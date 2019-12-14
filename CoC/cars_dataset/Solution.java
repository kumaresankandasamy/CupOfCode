package CoC.cars_dataset;
import java.io.*;
import java.util.*;

public class Solution {
    int Solution(String input, String output, String O) throws IOException {
        PrintWriter pw = new PrintWriter(output);
        BufferedReader br = new BufferedReader(new FileReader(input));
        String line = br.readLine();
        float sum=0;
        int avg=0, c=0;
        while(line != null)
        {
            String[] words = line.split(",");
            int l = words.length;

            if(l==3) {
                if(words[1].equals(O)){
                    sum = sum+Float.parseFloat(words[2]);
                    c++;
                    pw.println(line);
                    pw.flush();
                }
            }
            line = br.readLine();
        }
        avg = (int)sum/c;
        br.close();
        pw.close();
        return avg;
    }
    public static void main(String[] args) throws IOException
    {
        Solution ob = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Input");
        System.out.println("------------------------------------------");
        System.out.println("");
        System.out.println("Enter the number of Lines");
        int N = sc.nextInt();
        System.out.println("Enter the Origin");
        String O = sc.next();
        int avg = ob.Solution("input.txt", "temp.txt", O);
        PrintWriter pw = new PrintWriter("output.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("temp.txt"));
        String line = br1.readLine();
        ArrayList<Float> num = new ArrayList<Float>();
        ArrayList<String> ls = new ArrayList<String>();
        int c=0, i=0;
        while (line != null)
        {
            String[] words = line.split(",");
            num.add(Float.parseFloat(words[2]));
            ls.add(line);
            c++;
            line = br1.readLine();
        }
        Collections.sort(num, Collections.reverseOrder());

        for (float l : num)
        {
            while(i < c)
            {
                String line1 = ls.get(i);
                String[] words = line1.split(",");
                if(l==(Float.parseFloat(words[2])))
                {
                    pw.println(line1);
                    pw.flush();
                    ls.remove(line1);
                    break;
                }
                i++;
            }
            i=0;
        }
        BufferedReader br2 = new BufferedReader(new FileReader("output.txt"));
        String ll = br2.readLine();
        int res=0;
        System.out.println("");
        System.out.println("--------------------------------------------");
        while(res<N) {
            String[] wrds = ll.split(",");
            int nn = (int)Float.parseFloat(wrds[2]);
            if(nn>avg) {
                System.out.println(ll);
            }
            res++;
            ll = br2.readLine();
        }
        br1.close();
        br2.close();
        pw.close();

        System.out.println("---------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("Output is Displayed On Output Screen");
        System.out.println("input.txt containing Input lines");
        System.out.println("----------------------------------------------------");
    }
}