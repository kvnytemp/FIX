/**
 * 
 */
package fix.bo.msgtypes;

import fix.bo.FixBase;

/**
 * @author Kishore
 *
 */
public class Msg_0_Heartbeat extends FixBase {

	/**
	 * 
	 */
	public Msg_0_Heartbeat(String msg) {
		System.out.println(msg);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fix.bo.FixBase#generateFixMsg()
	 */
	@Override
	public String generateFixMsg() {
		// TODO Auto-generated method stub
		return null;
	}

}
