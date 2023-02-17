import java.util.*;
class table{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int m,n;
System.out.print("M=");
m=sc.nextInt();
System.out.print("N=");
n=sc.nextInt();
if(n>0 && m>0){
for(int i=1;i<=n;i++){
System.out.println(i+"x"+m+"="+(i*m));
}
}
}
}