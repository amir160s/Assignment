public class Administrator extends Employee{
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+"Department: "+department;
    }
}
