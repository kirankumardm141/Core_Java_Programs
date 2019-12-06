package sampleprograms;

public class Hacker {
	
	private int hid;
	private String hname;
	
	public Hacker(int hid, String hname) {
		super();
		this.hid = hid;
		this.hname = hname;
	}
	
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	
	

	@Override
	public String toString() {
		return "Hacker [hid=" + hid + ", hname=" + hname + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hid;
		result = prime * result + ((hname == null) ? 0 : hname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hacker other = (Hacker) obj;
		if (hid != other.hid)
			return false;
		if (hname == null) {
			if (other.hname != null)
				return false;
		} else if (!hname.equals(other.hname))
			return false;
		return true;
	}
	
	

}
