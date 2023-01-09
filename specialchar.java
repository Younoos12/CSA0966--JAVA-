import java.util.*;
class specialchar{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int count=0;
String s1;
int i;
System.out.println("Enter the sentence");
s1=s.next();
for(i=0;i<s1.length();i++){
char d=s1.charAt(i);
if(Character.isLetter(d)){
continue;
}
else if(Character.isDigit(d)){
continue;
}
else{
System.out.print(s1.charAt(i)+" ");
count=count+1;
}
}
System.out.println("\n no.of special characters  : "+count);
}
}