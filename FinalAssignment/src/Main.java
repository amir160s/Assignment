public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmployeeID(221);
        e.setName("Amir");
        e.setSalary(6000000.0);


        Professor p=new Professor();
        p.setEmployeeID(221);
        p.setName("Amir");
        p.setSalary(6000000.0);
        p.setSubjectOfExpertise("OOP");
        System.out.println(p+"\n"+"\n");

        Administrator a = new Administrator();
        a.setEmployeeID(221);
        a.setName("Amir");
        a.setSalary(6000000.0);
        a.setDepartment("CSE");
        System.out.println(a+"\n"+"\n");

        SupportStaff s = new SupportStaff();
        s.setEmployeeID(221);
        s.setName("Amir");
        s.setSalary(6000000.0);
        s.setJobTitle("Student Affairs");
        System.out.println(s);
    }
}