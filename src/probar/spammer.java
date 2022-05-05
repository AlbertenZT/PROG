
package probar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class spammer {
    public static void main(String[] args) throws AWTException, InterruptedException {
        int x=1;
        Robot robot = new Robot();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el texto para spamear jeje");
        String texto = sc.nextLine();
        
        StringSelection stringSelection = new StringSelection(texto);
        Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
        clpbrd.setContents (stringSelection, null);

Fuente: https://www.iteramos.com/pregunta/34882/copiar-texto-en-el-portapapeles-con-java
        
        System.out.println("Wait 5 sec");
        Thread.sleep(5000);
        while(x <=20){
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            x++;
            
        }
    }
}
