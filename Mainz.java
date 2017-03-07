import java.io.*;
import java.util.*;
class Mainz {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lengHth=Integer.parseInt(br.readLine());
        int sizE=Integer.parseInt(br.readLine());
        Map m1 = new HashMap();
        int a[]=new int[sizE];
        for(int i=0; i<lengHth; i++) {
            for(int p=0; p<sizE; p++) {
               a[p]=Integer.parseInt(br.readLine()); 
            }
            
        }
    }
}