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

	public static String[] parseOneTag(String oneTag) {
		return oneTag.split("=");
	}
	
	public FixBase parseMessage(String msg) throws Exception {
		return parseMessage(msg, FixBase.SOH);
	}
	
	public FixBase parseMessage(String msg, String sohField) throws Exception {
		Hashtable<Integer, String> fields = new Hashtable<Integer, String>();

		FixBase msgObject = null;

		String msgLessOne = msg.substring(0, msg.length() - 1);
		int lastIdx = msgLessOne.lastIndexOf(sohField);
		String chkSumToken = msgLessOne.substring(lastIdx + 1);
		int eqIdx = chkSumToken.indexOf('=');
		String tag = chkSumToken.substring(0, eqIdx);
		int chkSum = -1;
		if (tag.trim().equals("10")) {
			chkSum = Integer.parseInt(chkSumToken.substring(eqIdx + 1));
			// to do verify check sum
		} else {
			throw new Exception(
					"Malformed Fix message. Expecting Checksum (10) tag.");
		}

		String payLoad = msgLessOne.substring(0, lastIdx+1);
		String[] tokens = payLoad.split(sohField, 4);

		String version;
		int bodyLength;
		String msgType;

		String token = tokens[0];
		eqIdx = token.indexOf('=');
		tag = token.substring(0, eqIdx);
		if (tag.trim().equals("8")) {
			version = token.substring(eqIdx + 1);
		} else {
			throw new Exception(
					"Malformed Fix message. Expecting version (8) tag, found ["
							+ tag + "]");
		}

		String lenToken = tokens[1];
		eqIdx = lenToken.indexOf('=');
		tag = lenToken.substring(0, eqIdx);
		if (tag.trim().equals("9")) {
			bodyLength = Integer.parseInt(lenToken.substring(eqIdx + 1));
		} else {
			throw new Exception(
					"Malformed Fix message. Expecting BodyLength (9) tag.");
		}

		String msgToken = tokens[2];
		eqIdx = msgToken.indexOf('=');
		tag = msgToken.substring(0, eqIdx);
		if (tag.trim().equals("35")) {
			msgType = msgToken.substring(eqIdx + 1);
		} else {
			throw new Exception(
					"Malformed Fix message. Expecting Message Type (35) tag.");
		}

		String msgClassName = Fix35_MsgTypes.getMsgClassNameByType(msgType);

		String typSpecMsg = tokens[3];

		try {
			Class<?> clazz = Class.forName(msgClassName);
			Constructor<?> ctor = clazz.getConstructor(String.class);
			msgObject = (FixBase) ctor.newInstance(new Object[] { typSpecMsg });

		} catch (Exception e) {
			System.out.print(e);
		}

		return msgObject;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		String msg;
		ParseFixMessage pfm = new ParseFixMessage();
		FixBase fields;

		msg = "8=FIX.4.19=11235=9448=KV447=REGISTRY452=CUSTOMER802=2523=1002803=BROKER523=1003803=CUSTODIAN10=157";
		fields = pfm.parseMessage(msg);
		/*
		 * msg =
		 * "8=FIX.4.19=11235=049=BRKR56=INVMGR34=23552=19980604-07:58:28112=19980604-07:58:2810=157"
		 * ; fields = pfm.parseMessage(msg, ""); msg =
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
