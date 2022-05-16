//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
package imonsh;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialog
{
    ImageIcon icon = new ImageIcon("images/middle.gif");
    JOptionPane jop = new JOptionPane();
    String msg = "Hola mundo - Testing message";
    String war = "¡¡Advertencia, cuidado!!";
    String err = "¡¡ Error !!";
    String pla = "Mensaje simple:";
    String inf = "Mensaje Informativo:";
    String tit = "Opciones disponibles";
    JFrame f = null;
    int WARNING;
    int ERROR;
    int PLAIN;
    int INFO;
    int YESNO;
    int QUEST;
    Object[] opt;
    Object[] pos;

    public Dialog()
    {
        JOptionPane var10001 = this.jop;
        this.WARNING = 2;
        var10001 = this.jop;
        this.ERROR = 0;
        var10001 = this.jop;
        this.PLAIN = -1;
        var10001 = this.jop;
        this.INFO = 1;
        var10001 = this.jop;
        this.YESNO = 1;
        var10001 = this.jop;
        this.QUEST = 3;
        this.opt = new Object[]{"Yes, please", "No, thanks", "No, please no!"};
        this.pos = new Object[]{"No", "another no", "nope"};
    }

    public void display(String msg)
    {
        JOptionPane var10000 = this.jop;
        JOptionPane.showMessageDialog(this.f, msg);
    }
    public void display(String msg, char ch)
    {
        JOptionPane var10000;
        switch(ch)
        {
            case 'E':
            case 'e':
                var10000 = this.jop;
                JOptionPane.showMessageDialog(this.f, msg, this.err, this.ERROR);
                break;
            case 'I':
            case 'i':
                var10000 = this.jop;
                JOptionPane.showMessageDialog(this.f, msg, this.inf, this.INFO, this.icon);
                break;
            case 'P':
            case 'p':
                var10000 = this.jop;
                JOptionPane.showMessageDialog(this.f, msg, this.pla, this.PLAIN);
                break;
            case 'W':
            case 'w':
                var10000 = this.jop;
                JOptionPane.showMessageDialog(this.f, msg, this.war, this.WARNING);
        }
    }
    public Object readObject(Object msg, String tit, int o)
    {
        JOptionPane var10000 = this.jop;
        return JOptionPane.showInputDialog(this.f, msg, tit, this.PLAIN, this.icon, this.pos, this.pos[o]);
    }
    public String readString(String msg)
    {
        JOptionPane var10000 = this.jop;
        return JOptionPane.showInputDialog(msg);
    }
    public int readOption(Object[] opt, Object msg, String tit, int o)
    {
        JOptionPane var10000 = this.jop;
        return JOptionPane.showOptionDialog(this.f, msg, tit, this.YESNO, this.QUEST, (Icon)null, opt, opt[o]);
    }
    public int confirm(Object msg, String tit)
    {
        JOptionPane var10000 = this.jop;
        return JOptionPane.showConfirmDialog(this.f, msg, tit, this.YESNO);
    }
    public static void main(String[] args)
    {
        Dialog d = new Dialog();
        d.display("Mensaje de advertencia", 'W');
        d.display("Mensaje de error", 'E');
        d.display("Mensaje sencillo", 'P');
        d.display("Mensaje informativo", 'I');
        d.readOption(d.opt, d.msg, d.tit, 0);
        d.confirm(d.msg, d.tit);
        d.readObject(d.msg, "Entrada con titulo", 2);
        d.display(d.readString("Capturar datos: "));
    }
}
