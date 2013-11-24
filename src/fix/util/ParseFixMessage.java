/**
 * 
 */
package fix.util;

import java.util.*;
import java.lang.Integer;
import java.lang.reflect.*;

import fix.bo.*;
/**
 * @author Kishore
 * 
 */
public class ParseFixMessage {

	public Hashtable<Integer, String> parseMessage(String msg, String sohField) throws Exception {
		Hashtable<Integer, String> fields = new Hashtable<Integer, String>();

		StringTokenizer st = new StringTokenizer(msg, sohField);

		String version;
		int bodyLength;
		String msgType;
		
		String token = st.nextToken();
		int eqIdx = token.indexOf('=');
		String tag = token.substring(0, eqIdx);
		if (tag.trim().equals("8")) {
			version = token.substring(eqIdx+1);
		} else {
			throw new Exception("Malformed Fix message. Excepting version (8) tag.");
		}
		
		String lenToken = st.nextToken();
		eqIdx = lenToken.indexOf('=');
		tag = lenToken.substring(0, eqIdx);
		if (tag.trim().equals("9")) {
			bodyLength = Integer.parseInt(lenToken.substring(eqIdx+1));
		} else {
			throw new Exception("Malformed Fix message. Expecting BodyLength (9) tag.");
		}
		
		String msgToken = st.nextToken();
		eqIdx = msgToken.indexOf('=');
		tag = msgToken.substring(0, eqIdx);
		if (tag.trim().equals("35")) {
			msgType = msgToken.substring(eqIdx+1);
		} else {
			throw new Exception("Malformed Fix message. Expecting Message Type (35) tag.");
		}
				
		String msgClassName = Fix35MsgTypes.getMsgClassNameByType(msgType);
		
		System.out.println("msgClassName = " + msgClassName);
		String typSpecMsg = "Rest of the message";
		
		try {
		Class<?> clazz = Class.forName(msgClassName);
		Constructor<?> ctor = clazz.getConstructor(String.class);
		Object msgObject = ctor.newInstance(new Object[] { typSpecMsg });
		
		System.out.println(msgObject);
	/*	
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			int eqIdx = token.indexOf('=');
			String tag = token.substring(0, eqIdx);
			String value = token.substring(eqIdx+1);
			fields.put(new Integer(tag), value);
			// System.out.println("Tag = " + tag + ", value = " + value);
		}
		*/
		} catch (Exception e) {
			System.out.print(e);
		}
		
		return fields;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String msg;
		ParseFixMessage pfm = new ParseFixMessage();
		Hashtable<Integer, String> fields;

		msg = "8=FIX.4.19=11235=149=BRKR56=INVMGR34=23552=19980604-07:58:28112=19980604-07:58:2810=157";
		fields = pfm.parseMessage(msg, "");
		/*
		 * msg = "8=FIX.4.19=11235=049=BRKR56=INVMGR34=23552=19980604-07:58:28112=19980604-07:58:2810=157";
		 * fields = pfm.parseMessage(msg, "");
		 * msg =
		 * "8=FIX.4.19=15435=649=BRKR56=INVMGR34=23652=19980604-07:58:4823=11568528=N55=SPMI.MI54=227=20000044=10100.00000025=H10=159"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23652=19980604-07:59:3010=225"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=11235=049=BRKR56=INVMGR34=23752=19980604-07:59:48112=19980604-07:59:4810=225"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=15435=649=BRKR56=INVMGR34=23852=19980604-07:59:5623=11568628=N55=FIA.MI54=227=25000044=7900.00000025=H10=231"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23752=19980604-08:00:3110=203"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=15435=649=BRKR56=INVMGR34=23952=19980604-08:00:3623=11568728=N55=PIRI.MI54=127=30000044=5950.00000025=H10=168"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23852=19980604-08:01:3110=026"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=11235=049=BRKR56=INVMGR34=24052=19980604-08:01:36112=19980604-08:01:3610=190"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23952=19980604-08:02:3110=026"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=11235=049=BRKR56=INVMGR34=24152=19980604-08:02:36112=19980604-08:02:3610=018"
		 * ; fields = pfm.parseMessage(msg, "");
		 * 
		 * msg =
		 * "8=FIX.4.19=9035=049=INVMGR56=BRKR34=24052=19980604-08:03:3110=220"
		 * ; fields = pfm.parseMessage(msg, "");
		 */

		System.out.println(fields);
		return;
	}

}
