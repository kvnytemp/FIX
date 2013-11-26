/**
 * 
 */
package fix.tests;

import static org.junit.Assert.*;

import java.util.Hashtable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fix.bo.FixBase;
import fix.bo.compblock.Party;
import fix.util.ParseFixMessage;

/**
 * @author Kishore
 * Updated thro' eclipse
 */
public class ParseTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String msg;
		ParseFixMessage pfm = new ParseFixMessage();
		FixBase fields;

		try {
			
		msg = "8=FIX.4.19=11235=049=BRKR56=INVMGR34=23552=19980604-07:58:28112=19980604-07:58:2810=157";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=15435=649=BRKR56=INVMGR34=23652=19980604-07:58:4823=11568528=N55=SPMI.MI54=227=20000044=10100.00000025=H10=159";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23652=19980604-07:59:3010=225";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=11235=049=BRKR56=INVMGR34=23752=19980604-07:59:48112=19980604-07:59:4810=225";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=15435=649=BRKR56=INVMGR34=23852=19980604-07:59:5623=11568628=N55=FIA.MI54=227=25000044=7900.00000025=H10=231";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23752=19980604-08:00:3110=203";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=15435=649=BRKR56=INVMGR34=23952=19980604-08:00:3623=11568728=N55=PIRI.MI54=127=30000044=5950.00000025=H10=168";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23852=19980604-08:01:3110=026";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=11235=049=BRKR56=INVMGR34=24052=19980604-08:01:36112=19980604-08:01:3610=190";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=9035=049=INVMGR56=BRKR34=23952=19980604-08:02:3110=026";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=11235=049=BRKR56=INVMGR34=24152=19980604-08:02:36112=19980604-08:02:3610=018";
		fields = pfm.parseMessage(msg, "");

		msg = "8=FIX.4.19=9035=049=INVMGR56=BRKR34=24052=19980604-08:03:3110=220";
		fields = pfm.parseMessage(msg, "");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void CompBlockTest() {
		String partyMsg="448=KV447=REGISTRY452=CUSTOMER802=2523=1002803=BROKER523=1003803=CUSTODIAN";
		Party party = new Party(partyMsg);
		System.out.println("CompBlockTest - " + party);		
	}
}
