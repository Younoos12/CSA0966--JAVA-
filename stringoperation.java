import java.util.*;
class stringoperations{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s;
System.out.print("Enter String : ");
s=sc.nextLine();
String[] arr=s.split(" ");
System.out.println(Arrays.toString(arr));
arr[0]="bro";
System.out.println(Arrays.toString(arr));
System.out.println("Length : "+arr.length);
System.out.println(s.toUpperCase());
}
}