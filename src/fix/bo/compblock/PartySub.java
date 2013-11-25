/**
 * 
 */
package fix.bo.compblock;

import fix.bo.FixBase;
import fix.util.ParseFixMessage;


/**
 * @author Kishore
 * 
 */
public class PartySub  extends ComponentBlock {

	// PartySub TAG numbers
	public static int TAG_COMP_BLOCK_COUNT = 802;
	public static int TAG_ID = 523;
	public static int TAG_TYPE = 803;
	
	private String id;
	private String type;

	/**
	 * 
	 */
	public PartySub(String msg) {
		String[] fields = msg.split(FixBase.SOH);

		id = ParseFixMessage.parseOneTag(fields[0])[1];
		type = ParseFixMessage.parseOneTag(fields[1])[1];
	}

	/*
	 * 
	 * 
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
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PartySub [id=" + id + ", type=" + type + "]";
	}

	
}
