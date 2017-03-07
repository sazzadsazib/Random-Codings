import java.util.*;
class Secret_language {
    /*a -T
     b-E
     c-u
     d-S
     e -p
     f-r
     g-O[zero]
     h -k
     i-A
     j-X
     k-v
     l-x
     m-b
     n-g
     o-t
     p-z
     q=5
     r=7
     s-i
     t-a
     u-K
     v-R
     w-o
     x-e
     y-n
     z--O[oooo]
     A-V
     B-Z
     C-9
     D-4
     E-j
     F-C
     G-H
     H-U
     I-3
     J-1
     K-Q
     L-M
     M-B
     N-8
     O-c
     P-q
     Q-2
     R-W
     S-6
     T-f
     U-d
     V-I
     W-P
     X-G
     Y-N
     Z-h
     0-w
     1-s
     2=L
     3-Y
     4-J
     5-m
     6-F
     7-l
     8-y
     9-D*/
    static String encoder() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String encoded="";
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a') {
                encoded=encoded+"T";
            }else if(c=='b') {
                encoded=encoded+"E";
            }else if(c=='c') {
                encoded=encoded+"u";
            }else if(c=='d') {
                encoded=encoded+"S";
            }else if(c=='e') {
                encoded=encoded+"p";
            }else if(c=='f') {
                encoded=encoded+"r";
            }else if(c=='g') {
                encoded=encoded+"0";
            }else if(c=='h') {
                encoded=encoded+"k";
            }else if(c=='i') {
                encoded=encoded+"A";
            }else if(c=='j') {
                encoded=encoded+"X";
            }else if(c=='k') {
                encoded=encoded+"v";
            }else if(c=='l') {
                encoded=encoded+"x";
            }else if(c=='m') {
                encoded=encoded+"b";
            }else if(c=='n') {
                encoded=encoded+"g";
            }else if(c=='o') {
                encoded=encoded+"t";
            }else if(c=='p') {
                encoded=encoded+"z";
            }else if(c=='q') {
                encoded=encoded+"5"; 
            }else if(c=='r') {
                encoded=encoded+"7";
            }else if(c=='s') {
                encoded=encoded+"i";
            }else if(c=='t') {
                encoded=encoded+"a";  
            }else if(c=='u') {
                encoded=encoded+"K";
            }else if(c=='v') {
                encoded=encoded+"R";
            }else if(c=='w') {
                encoded=encoded+"o";
            }else if(c=='x') {
                encoded=encoded+"e";
            }else if(c=='y') {
                encoded=encoded+"n";
            }else if(c=='z') {
                encoded=encoded+"O";
            }else if(c=='A') {
                encoded=encoded+"V";
            }else if(c=='B') {
                encoded=encoded+"Z";
            }else if(c=='C') {
                encoded=encoded+"9";
            }else if(c=='D') {
                encoded=encoded+"4";
            }else if(c=='E') {
                encoded=encoded+"j";
            }else if(c=='F') {
                encoded=encoded+"C";
            }else if(c=='G') {
                encoded=encoded+"H";
            }else if(c=='H') {
                encoded=encoded+"U"; 
            }else if(c=='I') {
                encoded=encoded+"3";
            }else if(c=='J') {
                encoded=encoded+"1";
            }else if(c=='K') {
                encoded=encoded+"Q"; 
            }else if(c=='L') {
                encoded=encoded+"M";
            }else if(c=='M') {
                encoded=encoded+"B"; //bug
            }else if(c=='N') {
                encoded=encoded+"8";
            }else if(c=='O') {
                encoded=encoded+"c"; 
            }else if(c=='P') {
                encoded=encoded+"q";
            }else if(c=='Q') {
                encoded=encoded+"2";
            }else if(c=='R') {
                encoded=encoded+"W";
            }else if(c=='S') {
                encoded=encoded+"6";
            }else if(c=='T') {
                encoded=encoded+"f";
            }else if(c=='U') {
                encoded=encoded+"d";
            }else if(c=='V') {
                encoded=encoded+"I"; 
            }else if(c=='W') {
                encoded=encoded+"P";
            }else if(c=='X') {
                encoded=encoded+"G";
            }else if(c=='Y') {
                encoded=encoded+"N";
            }else if(c=='Z') {
                encoded=encoded+"h";
            }else if(c=='0') {
                encoded=encoded+"w";
            }else if(c=='1') {
                encoded=encoded+"s";
            }else if(c=='2') {
                encoded=encoded+"L";
            }else if(c=='3') {
                encoded=encoded+"Y";
            }else if(c=='4') {
                encoded=encoded+"J";
            }else if(c=='5') {
                encoded=encoded+"m"; 
            }else if(c=='6') {
                encoded=encoded+"F";
            }else if(c=='7') {
                encoded=encoded+"l";
            }else if(c=='8') {
                encoded=encoded+"y";
            }else if(c=='9') {
                encoded=encoded+"D";
            }else {
                encoded=encoded+c;
            }
            
        }
        return encoded;
    }
    
    static String decode() {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String decoded="";
        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);
            if(c=='a') {
                decoded=decoded+"t";
            }else if(c=='b') {
                decoded=decoded+"m";
            }else if(c=='c') {
                decoded=decoded+"O";
            }else if(c=='d') {
                decoded=decoded+"U";
            }else if(c=='e') {
                decoded=decoded+"x";
            }else if(c=='f') {
                decoded=decoded+"T";
            }else if(c=='g') {
                decoded=decoded+"n";
            }else if(c=='h') {
                decoded=decoded+"Z";
            }else if(c=='i') {
                decoded=decoded+"s";
            }else if(c=='j') {
                decoded=decoded+"E";
            }else if(c=='k') {
                decoded=decoded+"h";
            }else if(c=='l') {
                decoded=decoded+"7";
            }else if(c=='m') {
                decoded=decoded+"5";
            }else if(c=='n') {
                decoded=decoded+"y";
            }else if(c=='o') {
                decoded=decoded+"w";
            }else if(c=='p') {
                decoded=decoded+"e";
            }else if(c=='q') {
                decoded=decoded+"P"; 
            }else if(c=='r') {
                decoded=decoded+"f";
            }else if(c=='s') {
                decoded=decoded+"1";
            }else if(c=='t') {
                decoded=decoded+"o";  
            }else if(c=='u') {
                decoded=decoded+"c";
            }else if(c=='v') {
                decoded=decoded+"k";
            }else if(c=='w') {
                decoded=decoded+"0";
            }else if(c=='x') {
                decoded=decoded+"l";
            }else if(c=='y') {
                decoded=decoded+"8";
            }else if(c=='z') {
                decoded=decoded+"p";
            }else if(c=='A') {
                decoded=decoded+"i";
            }else if(c=='B') {
                decoded=decoded+"M";
            }else if(c=='C') {
                decoded=decoded+"F";
            }else if(c=='D') {
                decoded=decoded+"9";
            }else if(c=='E') {
                decoded=decoded+"b";
            }else if(c=='F') {
                decoded=decoded+"6";
            }else if(c=='G') {
                decoded=decoded+"X";
            }else if(c=='H') {
                decoded=decoded+"G"; 
            }else if(c=='I') {
                decoded=decoded+"V";
            }else if(c=='J') {
                decoded=decoded+"4";
            }else if(c=='K') {
                decoded=decoded+"u"; 
            }else if(c=='L') {
                decoded=decoded+"2";
            }else if(c=='M') {
                decoded=decoded+"L"; //bug
            }else if(c=='N') {
                decoded=decoded+"Y";
            }else if(c=='O') {
                decoded=decoded+"z"; 
            }else if(c=='P') {
                decoded=decoded+"W";
            }else if(c=='Q') {
                decoded=decoded+"K";
            }else if(c=='R') {
                decoded=decoded+"v";
            }else if(c=='S') {
                decoded=decoded+"d";
            }else if(c=='T') {
                decoded=decoded+"a";
            }else if(c=='U') {
                decoded=decoded+"H";
            }else if(c=='V') {
                decoded=decoded+"A"; 
            }else if(c=='W') {
                decoded=decoded+"R";
            }else if(c=='X') {
                decoded=decoded+"j";
            }else if(c=='Y') {
                decoded=decoded+"3";
            }else if(c=='Z') {
                decoded=decoded+"B";
            }else if(c=='0') {
                decoded=decoded+"g";
            }else if(c=='1') {
                decoded=decoded+"J";
            }else if(c=='2') {
                decoded=decoded+"Q";
            }else if(c=='3') {
                decoded=decoded+"I";
            }else if(c=='4') {
                decoded=decoded+"D";
            }else if(c=='5') {
                decoded=decoded+"q"; 
            }else if(c=='6') {
                decoded=decoded+"S";
            }else if(c=='7') {
                decoded=decoded+"r";
            }else if(c=='8') {
                decoded=decoded+"N";
            }else if(c=='9') {
                decoded=decoded+"C";
            }else {
                decoded=decoded+c;
            }
            
            
        }
        return decoded;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("WELCOME TO Sazib's ENCODER DECODER \n \n Decide What You Want to do: \n 1 to encode \n 2 to decode \n 0 to stop"); 
            int a=sc.nextInt();
            
            if(a==1) {
                System.out.println("\n ENCODE :");
                System.out.println(encoder()+"\n"); 
            }else if(a==2) {
                System.out.println("\n DECODE :");
                System.out.println(decode()+"\n"); 
            }else {
                System.out.println("THANKS!!!");
                break;
            }
        }
    }
}