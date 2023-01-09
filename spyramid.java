import java.util.*;
class spyramid{
public static void main(String[] arf){
Scanner s=new Scanner(System.in);
int n,m,i,j;
System.out.print("Enter the number to be printed : ");
n=s.nextInt();
System.out.print("Max number of times to printed : ");
m=s.nextInt();
for(i=0;i<m;i++){
for(j=0;j<=i;j++){
System.out.print(n);
}
System.out.println();
}
for(i=m-1;i>0;i--){
for(j=0;j<i;j++){
System.out.print(n);
}
System.out.println();
}
}
}