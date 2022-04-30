package SemanaTwoJava.Viernes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2Run
{
    public static void main(String[] args) {
        Runnable rm = new Runnable() {
            @Override
            public void run()
            {
                try
                {
                    FileOutputStream fos = new FileOutputStream("C:\\magiaRun.txt");
                    String s = "Magia con Runable!!!";
                    byte b[]=s.getBytes(StandardCharsets.UTF_8);
                    fos.write(b);
                    fos.close();
                    System.out.println("Magia con Runable!!!");
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
            }
        };
        Thread magic = new Thread(rm);
        magic.start();
    }
}
