public class Employee {
    private int employeeID;
    private String name;
    private double salary;





    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee ID: "+employeeID+"\n"+"Name: "+name+"\n"+"Salary: "+salary+"\n";
    }

}
