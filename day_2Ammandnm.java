import java.io.*;
import java.util.*;
import java.util.stream.Stream;
class day_2Ammandnm{
public static void main(String[] args) throws IOException{
Scanner sc=new Scanner(System.in);
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[] arr1=Stream.of(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
System.out.println(Arrays.toString(arr1));
int m,n,i;
System.out.print("Enter the m value : ");
m=sc.nextInt();
System.out.println("Enter n value : ");
n=sc.nextInt();
List<Integer>l=new ArrayList<Integer>();
for(i=0;i<arr1.length;i++){
l.add(arr1[i]);
}
System.out.println(l);
Collections.sort(l);
int k=l.size();
System.out.println(m+"th maximum number : "+l.get(k-m));
System.out.println(n+"th minimum number : "+l.get(0+n-1));
System.out.println("Sum="+(l.get(k-m)+l.get(0+n-1)));
System.out.println("Difference"+(l.get(k-m)-l.get(0+n-1)));
}
}