import java.util.Scanner;
public class UVA1{
  public static void main (String[]args){
    
    Scanner s = new Scanner (System.in);
    int c=0;
    while(s.hasNext()){
        c++;
      //System.out.println("Enter a String");
      String str=s.nextLine();
     if(str.equals("*"))
       break;
     else if(str.equals("Hajj"))
      System.out.println("Case "+c+":"+" Hajj-e-Akbar"); 
     else if(str.equals("Umrah"))
      System.out.println("Case "+c+":"+" Hajj-e-Asghar");
    }
  }
}