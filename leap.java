import java.util.*;
class leap{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s,k;
int y;
System.out.println("Enter the date : ");
s=sc.next();
System.out.println("Year = "+s.substring(6));
k=s.substring(6);
y=Integer.parseInt(k);
if(y%4==0){
System.out.println("Leap year");
}
else{
System.out.println("Not leap year");
}
}
}