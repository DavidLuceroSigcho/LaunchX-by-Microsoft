//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package imonsh;

public class TestScreen
{
    public TestScreen()
    {}
    public static void main(String[] args)
    {
        Screen p = new Screen();
        Dialog d = new Dialog();
        p.out("Welcome to Java Mission\n", Colors.C64Ntsc);
        p.changeStyle("Helvetica", 28, Colors.AgalFuel, Colors.AntiFlashWhite);
        p.setVisible(true);
        String r = d.readString("Do you wanna see something amazing? y/n:");
        if (r.charAt(0) != 'Y' && r.charAt(0) != 'y')
        {p.out("Nos vemos, Adios", "Century Schoolbook L", 28, Colors.Desire);}
        else
        {
            p.showImage("images.jpeg");
            p.out("Hey folks\n");
            p.showImage("mundo.gif");
            p.out("hola mundo\n");
        }
    }
}
