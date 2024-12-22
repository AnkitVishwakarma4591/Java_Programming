import java.awt.event.*;
import javax.swing.*;

class one implements MouseListener{
    public void mouseClicked(MouseEvent me){
        System.out.println("Mouse Click Event :");
    }
    public void mousePressed(MouseEvent me){
        System.out.println("Mouse Press Event :");
    }
    public void mouseReleased(MouseEvent me){
        System.out.println("Mouse Release:");
    }
    public void mouseEntered(MouseEvent me){
        System.out.println("Mouse Enter :");
    }
    public void mouseExited(MouseEvent me){
        System.out.println("Mouse Exit :");
    }
}
class MouseEvents {
    public static void main(String[] args){
        JFrame jf = new JFrame("Event");
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Registering Listener
        one o = new one();
        jf.addMouseListener(o);
        jf.setVisible(true);
    }
}
