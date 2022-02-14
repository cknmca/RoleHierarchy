
public class Company {

	
	private String subrole;
	private String reportmgr;
	public String getSubrole() {
		return subrole;
	}
	public void setSubrole(String subrole) {
		this.subrole = subrole;
	}
	public String getReportmgr() {
		return reportmgr;
	}
	public void setReportmgr(String reportmgr) {
		this.reportmgr = reportmgr;
	}
	public Company(String subrole, String reportmgr) {
		super();
		this.subrole = subrole;
		this.reportmgr = reportmgr;
	}
	@Override
	public String toString() {
		return "Company [subrole=" + subrole + ", reportmgr=" + reportmgr + "]";
	}
	
	
}
