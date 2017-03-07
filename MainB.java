import java.util.Scanner;
public class MainB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        while(sc.hasNext()) {
            String s="";
            char []grid=sc.nextLine().toCharArray();
            for(int i=0; i<grid.length; i++) {
                if(grid[i]=='W') {
                    if(grid[i+1]=='U') {
                        if(grid[i+2]=='B') {
                            grid[i]='\0';
                            grid[i+1]='\0';
                            grid[i+2]='\0';
                            i+=2;
                        }
                    }
                }
            }
            for(int i=0; i<grid.length; i++) {
                if(grid[i] !='\0')  {
                    s=s+grid[i];
                    if((i+1)<grid.length && grid[i+1]=='\0' ) {
                    s=s+" ";
                }
                }
                
            }
            System.out.println(s);
            
        }
    }
}