
package trycatch; 
import java.io.*;
public class copiar {
    public static void main(String [] args) throws IOException{
        FileReader fr = null;
        FileWriter fw =null;
        try{
            fr =new FileReader("biblio.xml");
            fw = new FileWriter("");
            int c;
            while((c=fr.read())!=1){
                fw.write(c);
            }
        }catch(IOException E){
            System.out.println("Error del acceso");
        }
        finally{
            if(fr != null){
                fr.close();
            }
            if(fw != null){
                fw.close();
            }   
        }
    }
}
