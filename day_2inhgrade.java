import java.util.*;
class gm{
Scanner sc=new Scanner(System.in);
int m1,m2,m3,m4;
void getmarks(){
System.out.print("m1=");
m1=sc.nextInt();
System.out.print("m2=");
m2=sc.nextInt();
System.out.print("m3=");
m3=sc.nextInt();
System.out.print("m4=");
m4=sc.nextInt();
}
}

class avg extends gm{

float Avg;
void aveg(){
System.out.println(m1);
System.out.println("AVG  = "+(m1+m2+m3+m4)/4);
}
void grade(){
if((m1+m2+m3+m4)/4>75){
System.out.println("Distinction");
}
else if((m1+m2+m3+m4)/4>=60 &&(m1+m2+m3+m4)/4<75){
System.out.println("First division");
}
else if((m1+m2+m3+m4)/4>=50 && (m1+m2+m3+m4)/4<60){System.out.println("Second division");}
else if((m1+m2+m3+m4)/4>=40 && (m1+m2+m3+m4)/4<50){System.out.println("Third division ");}
else{System.out.println("FAIL");}
}
}

class day_2inhgrade{
public static void main(String[] args){

avg a=new avg();
a.getmarks();
a.aveg();
a.grade();
}
}