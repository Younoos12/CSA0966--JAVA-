import java.util.*;
import java.io.*;
import java.util.stream.Stream;
class day_2frequency{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int[] arr=Stream.of(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
System.out.println(Arrays.toString(arr));
int count=0,i,j;
for(i=0;i<arr.length;i++){
for(j=0;j<arr.length;j++){
if(arr[i]==arr[j]){count=count+1;}
}
System.out.println(arr[i]+"frequency : "+count);
count=0;
}
}
}