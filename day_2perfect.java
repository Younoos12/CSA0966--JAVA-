import java.util.*;
class day_2perfect{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,sum=0,i;
System.out.print("Enter the number : ");
try{
n=sc.nextInt();
if(n<0){System.out.println("Enter the number greater than 0");}
else{
for(i=1;i<n;i++){
if(n%i==0){
sum=sum+i;
}
}
if(n==sum){System.out.println("it's perfect number");}
else{System.out.println("it's not perfect number");}
}
}
catch(InputMismatchException e){
System.out.println("Eneter the integer data type ");
}
}
}