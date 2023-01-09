import java.util.*;
class rnum{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n2=0,b,n;
System.out.println("Enter the number : ");
try{
n=s.nextInt();
if(n>0){
while(n!=0){
b=n%10;
n2=n2*10+b;
n=n/10;
}
System.out.println("Reverse number = "+n2);
}
else{
System.out.println("Enter the positive number");
}
}
catch(InputMismatchException e){
System.out.println("give integer value");
}
}
}