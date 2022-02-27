class Employee
{
String name,add,mail;
float id,mobile,basic;


void salary()
{
float da,hra,pf,cf,gross;
da=basic*97/100;
hra=basic*10/100;
pf=basic*12/100;
cf=basic*0.1f/100;
gross=basic+da+hra-pf-cf;
System.out.println("Name:"+name);
System.out.println("Basic salary:"+basic);
System.out.println("Gross salary:"+gross);
}
}
class Programmer extends Employee{
Programmer(String name,int sal)
{
this.name=name;
basic=sal;
}
}
class TeamLead extends Employee
{
TeamLead(String name,int sal)
{
this.name=name;
basic =sal;
}
}
class APM extends Employee
{
APM(String name,int sal)
{
this.name=name;
basic=sal;
}
}
class ProjectManeger extends Employee
{
ProjectManeger(String name,int sal)
{

this.name=name;
basic=sal;
}
}
public class assignments3
{
public static void main(String[] args){
Programmer p= new Programmer("rohit",73889);
p.salary();

TeamLead t= new TeamLead("manual",60000);
t.salary();

APM a= new APM("sagar",646478);
a.salary();
}
}