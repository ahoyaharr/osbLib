import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class aleksandrMouseListener implements MouseListener {
    //create a boolean
    public boolean switchRange;
    public boolean switchMage;

    @Override
    public void mouseClicked(MouseEvent e) {
        //create our point variable
        Point p = e.getPoint();
        //create our rectangle
         Rectangle mRange = new Rectangle(440, 440, 30, 30);
         Rectangle mMage = new Rectangle(440, 380, 30, 30);
        //check if the rectangle contains point and change booleans state
        if (mRange.contains(p.getX(), p.getY())) {
            switchRange = true;
        } else if (mMage.contains(p.getX(), p.getY())) {
            switchMage = true;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
    }
}