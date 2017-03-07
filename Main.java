import java.util.Scanner;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++) {
            Double A=sc.nextDouble();
            Double B=sc.nextDouble();
            Double inc=sc.nextDouble();
            if((A==1)&&(B==1)){
                int  h=(int) Math.round(inc/2);
                System.out.println(h);
            }else{
                Double sum=A+B;
                Double working=sum/3;
                Double iA=A-working;
                Double iB=B-working;  
                Double ans=(iA/working)*inc;
                if(iB <0) {
                    ans=inc;
                }
                if(iA<0) {
                    ans=0.0;
                }
                if( A ==0) {
                    ans=0.0;
                }
                int s=(int) Math.round(ans);
                System.out.println(s);
            }
            
        }
    }
}