import java.util.*;
class unique{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s;
int i,j,count=0;
System.out.print("Enter the String : ");
s=sc.next();
for(i=0;i<s.length();i++){
for(j=0;j<s.length();j++){
if(s.charAt(i)==s.charAt(j))
	count=count+1;
}
if(count==1){
System.out.println(s.charAt(i));
count=0;

}
else
	count=0;
}
}
}