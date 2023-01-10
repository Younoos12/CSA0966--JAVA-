import java.util.*;
class day_2vowels{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s,v="aeiouAEIOU";
int i,j,count=0;
System.out.print("Enter the String :  ");
s=sc.nextLine();
for(i=0;i<s.length();i++){
for(j=0;j<v.length();j++){
if(s.charAt(i)==v.charAt(j)){
count=count+1;
}
}
}
System.out.println("no.of vowels : "+count);
}
}