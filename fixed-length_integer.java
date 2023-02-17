import java.util.*;
class fixed_length_integer{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int i=0,j=0;
String s=sc.next();

String[] c=s.split(",");
System.out.println(Arrays.toString(c));
int[] k=new int[c.length];
int f[]=new int[c.length];
for(int p=0;p<c.length;p++){
k[p]=Integer.parseInt(c[p]);}

while(i!=k.length){
if(k[j]==0){
f[i+1]=0;
i=i+1;
}
else{
f[i]=k[j];
}
i=i+1;
j=j+1;
}
System.out.println(Arrays.toString(f));
}
}