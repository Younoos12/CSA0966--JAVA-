/*14.	Write a Java program to find distinct characters and their count in a string.*/
import java.util.*;
class distinctchar{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
HashMap<Character,Integer> c=new HashMap<Character,Integer>();
int i,j,r=1;
Integer count=0;
for(i=0;i<s.length();i++){
for(j=0;j<s.length();j++){

if(s.charAt(i)==s.charAt(j))
	count=count+1;
}
c.put(s.charAt(i),count);
count=0;
}
System.out.println(c);
}
}