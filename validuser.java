import java.util.*;
class validuser{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1,s2;
int i,r=0;
System.out.println("enter the username : ");
s1=s.next();
System.out.println("Reenter the username : ");
s2=s.next();
if(s1.length()==s2.length()){
for(i=0;i<s1.length();i++){
if(s1.charAt(i)!=s2.charAt(i)){
r=r+1;
}
}
if(r!=0){
System.out.println("Invalid");
}
else{
System.out.println("Valid");
}
}
else{
System.out.println("Invalid");
}
}
}