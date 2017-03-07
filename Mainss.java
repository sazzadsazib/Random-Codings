import java.io.*;

public class Mainss { //458 decode ac
    
    public static void main(String[] args) throws Exception {
        DataInputStream Din = new DataInputStream(System.in); //read kore 
        DataOutputStream Dout = new DataOutputStream(System.out); //write kore
        try {
            while(true) { //last porjnto cholbe
                byte bit = Din.readByte(); //bit nicche
                if(bit != 10 && bit != 13){ // dekhtese line feeder naki line interval
                    Dout.writeByte(bit-7); //na hoile valid ascii so -7
                }else{
                    Dout.writeByte(bit); //hoile valid ascii na ja ase tai
                }
            }
        }
        catch(Exception e) {
            System.exit(0); //exception khaile terminate korbe
        }
    }
}