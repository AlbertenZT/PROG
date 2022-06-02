
package probar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class spamClick {
    
    
    
    
    //StackOverflow xD
    private static volatile boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (spamClick.class) {
            return wPressed;
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot r = new Robot();
        Thread.sleep(2000);
        int x =1;
        boolean f =true;
        while(x <=100){
            if(f){
                r.mousePress(InputEvent.BUTTON1_MASK);
                r.mouseRelease(InputEvent.BUTTON1_MASK);
                
                
                
                KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                synchronized (spamClick.class) {
                    switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        if (ke.getKeyCode() == KeyEvent.VK_W) {
                            wPressed = true;
                        }
                        break;

                    case KeyEvent.KEY_RELEASED:
                        if (ke.getKeyCode() == KeyEvent.VK_W) {
                            wPressed = false;
                        }
                        break;
                    }
                    return false;
                }
            }
        });
                
                
                if(spamClick.isWPressed()){
                    break;
                }
                
                
                
                
                
                
                
                
 
            }
            else{
                break;
            }
            
        }
        
        
        
        
         
    
        

    }
}
