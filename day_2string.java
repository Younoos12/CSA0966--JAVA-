import java.util.*;
class day_2string{
public static void pal(String st){
String m="";
for(int i=0;i<st.length();i++){
m=st.charAt(i)+m;
}
if(m.equals(st)){
System.out.println("palindrome");
}
else{
System.out.println("not palindrome");
}
}

public static void subst(String st){
System.out.println("The substring of st is "+st.substring(2));
}

public static void candv(String st){
List<String> c =new ArrayList<>();
List<String> v =new ArrayList<>();
String s,v1="aeiouAEIOU";
char f;
int i,j,r=1;
for(i=0;i<st.length();i++){
for(j=0;j<v1.length();j++){
if(st.charAt(i)==v1.charAt(j)){
r=r*0;
}
else{
r=r*1;
}
}
f=st.charAt(i);
s=Character.toString(f);
if(r==1){
c.add(s);}
else{
v.add(s);
r=1;
}
}
System.out.println("consonants  : "+c);
System.out.println("Vowels : "+v);
}
public static void main(String[] args){
Scanner w= new Scanner(System.in);
String st;
System.out.println("Enter the string : ");
st=w.next();
pal(st);
subst(st);
candv(st);
}

}