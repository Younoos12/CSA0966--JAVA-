import java.util.*;
class compbw{
public static void main(String[] arfs){
Scanner s=new Scanner(System.in);
int a,b,i,j,count=0;
System.out.print("A=");
a=s.nextInt();
System.out.print("B=");
b=s.nextInt();
for(i=a;i<=b;i++){
for(j=1;j<=i;j++){
if(i%j==0){
count=count+1;
}
}
if(count!=2){
System.out.print(i+" ");
count=0;
}
else{
count=0;
}
}
}
}