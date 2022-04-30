package SemanaTwoJava.Viernes;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1
{
    public static void main(String[] args)
    {
        Runnable T1 = new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    FileOutputStream fos = new
                            FileOutputStream("C:\\hola.txt");
                    fos.write(65);
                    fos.close();
                }
                catch (IOException ioe)
                {
                    //ioe.printStackTrace();
                    System.out.println(ioe);
                }
            }
        };
        Thread writeFile = new Thread(T1);
        writeFile.start();
    }
}
