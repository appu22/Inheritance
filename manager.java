package inheritance;
public class manager extends employee 
{
    int reward;
    private int p;
    public manager(int empno,String nam, int sal)
    {
        super(empno,nam,sal);
        reward=p;
    }
    public void managerdata()
    {
        System.out.println("Employee no= "+emp_no);
        System.out.println("Name= "+name);
        System.out.println("Salary= "+salary);
        System.out.println("Reward= "+reward);
       
    }
}
