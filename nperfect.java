import java.util.*;
class nperfect{
public static void main(String[] rahd){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j,sum=0;
for(i=1;i<=n;i++){
for(j=1;j<i;j++){
if(i%j==0)
	sum=sum+j;}
if(sum==i){
System.out.println(i);
sum=0;}
else
	sum=0;
}}}