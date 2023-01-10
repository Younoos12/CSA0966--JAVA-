import java.io.*;
import java.util.*;
import java.util.stream.Stream;
class day_2compandprim{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[] arr=Stream.of(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
System.out.println(Arrays.toString(arr));
int comp=0,prim=0,i,count=0,j;
for(i=0;i<arr.length;i++){
for(j=1;j<=arr[i];j++){
if(arr[i]%j==0){
count=count+1;
}
}
if(count==2){
comp=comp+1;
count=0;
}
else{prim=prim+1;
count=0;}
}
System.out.println("no.of prime numbers : "+comp);
System.out.println("no.of composite numbers : "+prim);
}
}