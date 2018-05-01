// Employee.java

public class Employee
{
    private String ID;
    private String firstName;
    private String surname;
    private String department;
    private long mobile;
    private double salary;
    
    // constructor
    public Employee(String ID, String firstName, String surname, String department, long mobile, double salary)
    {
        this.ID = ID;
        this.firstName = firstName;
        this.surname = surname;
        this.department = department;
        this.mobile = mobile;
        this.salary = salary;
    }
    
    public String getID()
    {
        return ID;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getSurname()
    {
        return surname;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public long getMobile()
    {
        return mobile;
    }
    
    public double getSalary()
    {
        return salary;
    }
}