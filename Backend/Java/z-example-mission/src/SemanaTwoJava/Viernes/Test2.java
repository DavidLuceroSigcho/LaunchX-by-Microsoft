package SemanaTwoJava.Viernes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Test2
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
                    String s = "Magia!!!";
            byte b[]=s.getBytes(StandardCharsets.UTF_8);
            fos.write(b);
            fos.close();
            System.out.println("Magia!!!");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}
