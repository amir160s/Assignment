public class SupportStaff extends Employee{
    private String jobTitle;

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString()+"Job Title"+jobTitle;
    }
}
