package inheritance;
 public class scientist extends employee

{
    int perks;
    public scientist(int empno,String nam,int sal,int p)
    {
        super(empno,nam,sal);
        perks=p;
    }
    public void scientistdata()
    {
        System.out.println("Employee no="+emp_no);
        System.out.println("Name="+name);
        System.out.println("Salary"+salary);
        System.out.println("perks="+perks);
    }
}
