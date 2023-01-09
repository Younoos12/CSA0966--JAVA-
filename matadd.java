import java.util.*;
class matadd{
public static void main(String[] s1){
Scanner s=new Scanner(System.in);
int i,j;
int[][] a=new int[2][2];
int[][] b=new int[2][2];
int[][] c=new int[2][2];
System.out.println("MAT1");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
a[i][j]=s.nextInt();
}
}
System.out.println("Matadd:");
for(i=0;i<2;i++){
for(j=0;j<2;j++){
b[i][j]=s.nextInt();
}
}

for(i=0;i<2;i++){
for(j=0;j<2;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}

}
}