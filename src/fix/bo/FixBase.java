/**
 * 
 */
package fix.bo;

/**
 * @author Kishore
 *
 */
public abstract class FixBase {
	public static String SOH = "";
	private String version = "";
	private int bodyLength = -1;
	private int messageType = -1;

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the bodyLength
	 */
	public int getBodyLength() {
		return bodyLength;
	}

	/**
	 * @param bodyLength the bodyLength to set
	 */
	public void setBodyLength(int bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	public abstract String generateFixMsg();

	public String generateFixPrefix() {
		return "8=" + version + SOH + "9=";
	}

	public int generateCheckSum(String msg) {
		// to do implement the checksum algo
		return 999;
	}
}
