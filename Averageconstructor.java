import java.util.*;
class student{
String name;
int reg,m1,m2,m3,m4,m5;
student(String name,int reg,int m1,int m2,int m3,int m4,int m5){
this.name=name;
this.reg=reg;
this.m1=m1;
this.m2=m2;
this.m3=m3;
this.m4=m4;
this.m5=m5;
}

void average(){
System.out.println("total : "+(m1+m2+m3+m4+5));
System.out.println("Average : "+(m1+m2+m3+m4+m5)/5);
}
}
class Averageconstructor{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String name;
int reg,m1,m2,m3,m4,m5;
System.out.print("Name : ");
name=sc.nextLine();
System.out.println("reg : ");
reg=sc.nextInt();
System.out.print("m1 =");
m1=sc.nextInt();
System.out.print("m2 =");
m2=sc.nextInt();
System.out.print("m3 =");
m3=sc.nextInt();
System.out.print("m4 =");
m4=sc.nextInt();
System.out.print("m5 =");
m5=sc.nextInt();
student s=new student(name,reg,m1,m2,m3,m4,m5);
s.average();
}
}