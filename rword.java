import java.util.*;
class rword{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String s1,s2="";
int i;
System.out.println("Enter the string to be reversed : ");
s1=s.nextLine();
for(i=0;i<s1.length();i++){
s2=s1.charAt(i)+s2;
}
System.out.println("Reversed word is : "+s2);
}
}