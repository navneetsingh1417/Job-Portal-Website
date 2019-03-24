package company;

public class Company_Bean {

	
	private String company_name;
	private String user_name;
	private String password;
	private int comp_id;
	//   Job Post bean 
	private int jobid;;
	private String jobname;
	private String jobdesc;
	private String eligibility;
	private String salary;
	private String jobcity;
	private String jobstate;
	private String jobcountry;
	
	
	
	
	
	
	public int getComp_id() {
		return comp_id;
	}
	public void setComp_id(int comp_id) {
		this.comp_id = comp_id;
	}
	public int getJobid() {
		return jobid;
	}
	public void setJobid(int jobid) {
		this.jobid = jobid;
	}
	public String getJobcity() {
		return jobcity;
	}
	public void setJobcity(String jobcity) {
		this.jobcity = jobcity;
	}
	public String getJobstate() {
		return jobstate;
	}
	public void setJobstate(String jobstate) {
		this.jobstate = jobstate;
	}
	public String getJobcountry() {
		return jobcountry;
	}
	public void setJobcountry(String jobcountry) {
		this.jobcountry = jobcountry;
	}
	private String experience;
	
	
	
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getJobdesc() {
		return jobdesc;
	}
	public void setJobdesc(String jobdesc) {
		this.jobdesc = jobdesc;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
