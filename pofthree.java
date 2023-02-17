import java.util.*;
class pothree{
public static void main(String[] srgs){
int n,i,b=0;
try{
Scanner sc=new Scanner(System.in);
System.out.print("Input : ");
n=sc.nextInt();
if(n>0){
for(i=0;i<n/2;i++){
if(i*i*i==n){
	b=1;
break;
}
else
	b=0;
}
if(b==1)
	System.out.println("true");
else
	System.out.println("false");
}
else
	System.out.println("Enter numbers greater than 0");
}
catch(Exception e){
	System.out.println(e);
}}
}