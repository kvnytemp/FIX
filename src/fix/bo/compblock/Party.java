/**
 * 
 */
package fix.bo.compblock;

import java.util.Arrays;

import fix.bo.FixBase;
import fix.util.ParseFixMessage;

/**
 * @author Kishore
 *
 */
public class Party extends ComponentBlock {
	
	// Party TAG numbers
	public static int TAG_COMP_BLOCK_COUNT = 453;
	public static int TAG_ID = 448;
	public static int TAG_ID_SOURCE = 447;
	public static int TAG_ROLE = 452;
	
	private String id;
	private String idSource;
	private String role;
	private PartySub[] partySubs;
	

	/**
	 * 
	 */
	public Party(String msg) {
		String[] fields = msg.split(FixBase.SOH, 5);

		id = ParseFixMessage.parseOneTag(fields[0])[1];
		idSource = ParseFixMessage.parseOneTag(fields[1])[1];
		role = ParseFixMessage.parseOneTag(fields[2])[1];

		int partySubCount = -1;
		int eqIdx = fields[3].indexOf('=');
		String tag = fields[3].substring(0, eqIdx);
		if (tag.trim().equals("802")) {
			partySubCount = Integer.parseInt(fields[3].substring(eqIdx + 1));
		} else {
		//	throw new Exception(
		//			"Malformed Fix message. Expecting BodyLength (9) tag.");
		}
		
		partySubs = new PartySub[partySubCount];
		String firstTag = fields[4].substring(0, fields[4].indexOf("="));
		int begIdx = 0;
		int endIdx = -1;
		for (int i=0; i<partySubCount; i++)
		{
			endIdx = fields[4].indexOf(firstTag, begIdx+firstTag.length());
			String onePrtySubMsg;
			
			if (endIdx > 0)
				onePrtySubMsg = fields[4].substring(begIdx, endIdx);
			else
				onePrtySubMsg = fields[4].substring(begIdx);

			partySubs[i] = new PartySub(onePrtySubMsg);
			
			begIdx = endIdx;
		}
	}

	/* 
	 * 
	 */
	public String generateFixMsg() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the idSource
	 */
	public String getIdSource() {
		return idSource;
	}

	/**
	 * @param idSource the idSource to set
	 */
	public void setIdSource(String idSource) {
		this.idSource = idSource;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Party [id=" + id + ", idSource=" + idSource + ", role=" + role
				+ ", partySubs=" + Arrays.toString(partySubs) + "]";
	}

}
