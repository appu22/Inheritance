package inheritance;
public class employee
{
    protected int emp_no,salary;
    protected String name;
    public employee(int empno, String nam, int sal)
    {
        emp_no=empno;
        name=nam;
        salary=sal;
               
    }
    public void emp_data()
    {
        System.out.println("Employee no="+emp_no);
        System.out.println("Name="+name);
        System.out.println("Salary"+salary);
        
    }
            
}
