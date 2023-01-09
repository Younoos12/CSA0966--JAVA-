import java.util.*;
class vote{
public static void main(String[] args){
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the age");
try{
n=s.nextInt();
if(n>0){
if(n>=18){
System.out.println("Eligible for vote");
}
else{
System.out.println("required age for is "+(18-n));
}
}
else{
System.out.println("Enter the positive value");
}
}
catch(InputMismatchException e){
System.out.println("enter the integer value");
}
}
}