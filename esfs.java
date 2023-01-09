import java.util.*;
class esfs{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n,n1=0,n2=1,n3,count=0,count1=1,sum=0;
System.out.print("n=");
try{
n=s.nextInt();
if(n>0){
while(count!=n){
n3=n1+n2;
n1=n2;
n2=n3;
count1=count1+1;
if(count1%2==0){
sum=sum+n3;
count=count+1;
}
}
System.out.println("SUM = "+sum);
}
else{
System.out.println("Enter the positive number ");
}
}
catch(InputMismatchException e){
System.out.println("Enter the integer number ");
}
}
}