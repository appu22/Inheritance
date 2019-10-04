package inheritance;
import java.lang.*;
import java.util.Scanner;
public class Inheritance
{  
    public static void main(String[] args) 
    {
       employee emp=new employee(1,"appu ",10000);
       emp.emp_data();
       manager man =new manager(2,"basu ",20000);
       man.managerdata();
       scientist scient = new scientist(3,"asur ",20000);
       scient.scientistdata();
    }
    
}
