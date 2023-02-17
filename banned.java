import java.util.*;
class banned{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s2="",l="";
int r=1,g=1,t=0,count=0;
ArrayList<String> h=new ArrayList<String>();
char[] sp={',','!','@','.'};
for(int i=0;i<s.length();i++){
for(int j=0;j<sp.length;j++){
if(s.charAt(i)==sp[j])
	r=r*0;
else
	r=r*1;
}
if(r==1)
	s2=s2+s.charAt(i);
else
	r=1;
}
String[] s1=s2.split(" ");
String b=sc.nextLine();
String ban[]=b.split(",");

for(int i=0;i<s1.length;i++){
for(int j=0;j<ban.length;j++){
if(s1[i].equals(ban[j]))
	g=g*0;
else
	g=g*1;
}
if(g==1){
	h.add(s1[i]);}
else
	g=1;
}
for(int i=0;i<h.size();i++){
for(int j=0;j<h.size();j++){
if(h.get(i).equals(h.get(j)))
	count=count+1;
}
if(count>t){
t=count;
l=h.get(i);
count=0;
}
else
	count=0;
}
System.out.println(l);
}
}