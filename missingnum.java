import java.util.*;
class missingnum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n,r=1;
String s=sc.nextLine();
String[] s1=s.split(",");
int[] num=new int[s1.length];
for(int i=0;i<s1.length;i++)
	num[i]=Integer.parseInt(s1[i]);
Arrays.sort(num);
int w=num[s1.length-1];
for(int i=0;i<=w;i++){
for(int j=0;j<num.length;j++)
{
if(i==num[j]){
r=r*0;
}
else
	r=r*1;

}
if(r==1)
	System.out.println("Missing number : "+i);
else
	r=1;
}
}
}