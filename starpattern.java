import java.util.*;
class starpattern{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,i,j,k;
System.out.print("Enter the number of rows : ");
n=sc.nextInt();
for(i=0;i<n;i++){
for(k=n;k>i;k--){
System.out.print(" ");
}
for(j=0;j<=i;j++){
System.out.print("* ");
}
System.out.println();
}
for(i=n-2;i>=0;i--){
for(k=n-1;k>=i;k--){
System.out.print(" ");
}
for(j=i;j>=0;j--){
System.out.print("* ");
}
System.out.println();
}

}
}