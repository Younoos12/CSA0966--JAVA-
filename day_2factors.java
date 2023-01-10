import java.util.*;
class factors{
public static void main(String[] args){
int n,i,count=0;
Scanner s= new Scanner(System.in);
System.out.print("Enter the number");
try{
n=s.nextInt();
for(i=1;i<=n;i++){
if(n%i==0){
count=count+1;
}
}
System.out.println("No.of factors : "+count);
}
catch(InputMismatchException e){
System.out.println("Enter the integer datatype ");
}
}
}