public class Employee {
    private String employeesName;
    private int departmentName;
    private int salary;
    private int id;
    private static int employeeCounter = 0;

    public Employee(String employeesName, int departmentName, int salary) {
        this.employeesName = employeesName;
        this.departmentName = departmentName;
        this.salary = salary;
        this.id = employeeCounter++;
    }



    //getters
    public String getEmployeesName () {
        return this.employeesName;
    }
    public int getDepartmentName () {
        return this.departmentName;
    }
    public int getSalary () {
        return this.salary;
    }
    public int getId () {
        return this.id;
    }
    //setters
    public void setDepartmentName (int departmentName) {
        this.departmentName = departmentName;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }

    public String toString () {
        return employeesName + ", отдел: " + departmentName + ", зарплата: " + salary + " руб. в месяц";
    }




}
