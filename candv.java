import java.util.*;
class candv{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
List<String>c=new ArrayList<>();
List<String>vow=new ArrayList<>();
String s1,v1,c1,v="aeiouAEIOU";
int i,j,r=1;
System.out.println("Enter the string");
s1=s.next();
for(i=0;i<s1.length();i++){
for(j=0;j<v.length();j++){
if(s1.charAt(i)==v.charAt(j)){
r=r*0;
}
else{
r=r*1;
}
}
if(r==1){
c1=Character.toString(s1.charAt(i));
c.add(c1);
}
else{
v1=Character.toString(s1.charAt(i));
vow.add(v1);
r=1;
}
}

System.out.println(vow);
System.out.println(c);
}
}
