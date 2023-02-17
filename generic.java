import java.util.*;
class generic <T>{
public void sort(T[] arr){
Arrays.sort(arr,0,arr.length);
System.out.println(Arrays.toString(arr));
}
}


class main{
public static void main(String[] args){
generic<String> r=new generic<String>();
String[] s={"Zebra","Apple","Yellow","world"};

r.sort(s);

}
}