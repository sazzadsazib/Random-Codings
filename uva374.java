import java.util.Scanner;
import java.math.*;
class uva374{
  static  long mainfunc(long b,long p,long m) {
        if(p==0) {
            return 1;
        }
        long r=mainfunc(b,p/2,m);
        if(p%2==0) {
            return ((r%m)*(r%m))%m;
        }else {
            return ((r%m)*(r%m)*(b%m))%m;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            int b=sc.nextInt();
            int p=sc.nextInt();
            int m=sc.nextInt();
         long op=mainfunc(b,p,m);
         System.out.println(op);

           
        }
    }
}