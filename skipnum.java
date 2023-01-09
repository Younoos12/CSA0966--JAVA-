import java.util.*;
class skipnum{
public static void main(String[] args){
int m,n,k,i;
Scanner s=new Scanner(System.in);
System.out.print("m=");
m=s.nextInt();
System.out.print("n=");
n=s.nextInt();
System.out.print("k=");
k=s.nextInt();
for(i=m;i<=n;i=i+k+1){
System.out.print(i+" ");
}
}
}