import java.util.*;
import java.io.*;
import java.util.stream.Stream;
class day_2frequency{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int[] arr=Stream.of(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
System.out.println(Arrays.toString(arr));
}
}