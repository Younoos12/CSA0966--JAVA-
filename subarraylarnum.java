import java.util.*;
class subarraylargsum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int w=0,sum=0,psum=0;
String[] s1=s.split(",");
int[] nums=new int[s1.length];
int[] n=new int[s1.length-1];
for(int i=0;i<s1.length;i++)
	nums[i]=Integer.parseInt(s1[i]);
while(w!=s1.length-1){
for(int i=0;i<s1.length-1;i++){
int[] l=new int[i+1];
for(int j=w;j<=i;j++){
l[j]=nums[j];
}

for(int y=0;y<l.length;y++){
sum=sum+l[y];
}
if(sum>=psum){
psum=sum;
sum=0;
for(int g=0;g<l.length;g++){
n[g]=l[g];
}

}
else
	sum=0;
}
w=w+1;
}
ArrayList<Integer>h=new ArrayList<Integer>();
for(int t=0;t<n.length;t++){
if(n[t]!=0)
	h.add(n[t]);
}
System.out.println("highest sum : "+psum);
System.out.println("elements : "+h);
}
}