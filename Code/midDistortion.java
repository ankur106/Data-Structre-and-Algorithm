import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'getMinimumDistortion' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY packets
     *  2. INTEGER max_frame
     */

    public static int getMinimumDistortion(List<Integer> packets, int max_frame) {
    // Write your code here
    
    long ans = Long.MIN_VALUE;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
    
    for(int i=0;i<packets.size();i++){
        if(packets.get(i) == 0){
            if(i - 1 >= 0 && packets.get(i - 1) != 0){
                min = Math.min(min, packets.get(i - 1));
                max = Math.max(max, packets.get(i - 1));
            }
            if(i + 1 < packets.size() && packets.get(i + 1) != 0){
                min = Math.min(min, packets.get(i + 1));
                max = Math.max(max, packets.get(i + 1));
            }
            
        }   
    }
    
    long x = (min + max)/2;
    x = Math.min(x, max_frame);
    
    if(packets.get(0) == 0)
        packets.set(0, (int)x);
    for(int i=1;i<packets.size();i++){
        if(packets.get(i) == 0)
            packets.set(i, (int)x);
        ans = Math.max(ans, Math.abs(packets.get(i) - packets.get(i - 1)));
    }
    
    return (int)ans;
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int packetsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> packets = IntStream.range(0, packetsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int max_frame = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getMinimumDistortion(packets, max_frame);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}