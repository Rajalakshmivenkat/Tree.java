import java.io.*;
import java.util.*;
import java.lang.*;
class Employee
{
String n;
int s;
Employee()
{
n="";
s=0;
}
Employee(String p,int a)
{
n=p;
s=a;
}
}
public class Solntree
{
public static void main(String[]args)
{
HashSet<Employee> t=new HashSet<Employee>();
t.add(new Employee("Pavithra",20000));
t.add(new Employee("Raji",2000));
t.add(new Employee("Abi",25000));
t.add(new Employee("Harini",30000));
System.out.println(t);
System.out.println("The size of the treeset is:"+t.size());
}
}

