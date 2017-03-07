import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Mains{
  public static void main (String[]args) throws IOException{
   
 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String str=null;
   char []ss=null;
    while((str=br.readLine())!=null){
    //String str = s.nextLine();
    ss=str.toCharArray();
      for(int i = 0; i < ss.length; i++){
        ss[i]=(char) (((ss[i] - 32 - 7) % 95) + 32);
       // System.out.print();//sequence[i] = (char) (((sequence[i] - 32 - 7) % 95) + 32);
      }
      System.out.println(ss);
    }
  }
}