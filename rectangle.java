import java.util.*;
class rectsym{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n,i,j;
System.out.print("Enter the rows : ");
try{
n=s.nextInt();
if(n>0){
for(i=0;i<n;i++){
for(j=0;j<n;j++){
if(i==0 || i==n-1){
System.out.print("+");
}
else if(j==0 || j==n-1){System.out.print("|");}
else{System.out.print(" ");}
}
System.out.println();
}
}
else{
System.out.println("enter the positive number");
}
}
catch(InputMismatchException e){
System.out.println("Enter the integer value");
}
}
}