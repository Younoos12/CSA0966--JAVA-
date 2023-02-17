import java.util.*;
class dectobin{
public static void main(String args[]){      
  
	 Scanner s= new Scanner(System.in);
	 System.out.print("Enter the Decimal value : ");  
	 int decimal= s.nextInt();
	 
System.out.println(Integer.toBinaryString(decimal));  
System.out.println(Integer.toOctalString(decimal));   
}
}