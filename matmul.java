import java.util.*;
class matmul{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i,j,k;
int[][] a=new int[2][2];
int[][] b=new int[2][2];
int[][] c=new int[2][2];
System.out.println("Mat1 : ");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
a[i][j]=s.nextInt();
}
}
System.out.println("mat2:");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
b[i][j]=s.nextInt();
}
}
System.out.println("Mulmat : ");
for(i=0;i<2;i++){

for(j=0;j<2;j++){
c[i][j]=0;
for(k=0;k<2;k++){
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
System.out.print(c[i][j]+"  ");
}
System.out.println();
}
}
}