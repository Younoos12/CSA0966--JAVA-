import java.util.*;
class alphaord{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String[] b=new String[5];
char o;
String temp;
int i,j;
System.out.println("Enter the word of range 5");
for(i=0;i<5;i++){
b[i]=s.next();
}
for(i=0;i<5;i++){
for(j=i;j<5;j++){
if(b[i].charAt(0)>b[j].charAt(0)){
temp=b[i];
b[i]=b[j];
b[j]=temp;
}

}
}
System.out.print("order(A/D)");
o=s.next().charAt(0);
if(o=='A'){
for(i=0;i<5;i++){
System.out.println(b[i]);
}
}
else if(o=='D'){
for(i=5;i>0;i--){
System.out.println(b[i]);
}
}
else{
System.out.println("Enter the order A or D");
}
}
}