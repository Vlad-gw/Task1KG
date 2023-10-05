package proba;

import proba.Drova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel2 extends JPanel implements ActionListener {

    private final int PANEL_WIDTH2;
    private final int PANEL_HEIGHT2;
    private final int TIMER_DELAY2;
    private Timer timer2;
    private int ticksFromStart2 = 50;         //отсчитывает от начала

    private Drova drova;

    public DrawPanel2(final int width2, final int height2, final int timerDelay2) {
        this.PANEL_WIDTH2 = width2;
        this.PANEL_HEIGHT2 = height2;
        this.TIMER_DELAY2 = timerDelay2;
        timer2 = new Timer(timerDelay2, this);
        timer2.start();

        this.drova = new Drova(ticksFromStart2, 200, 200, 260, Color.BLUE);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        drova.setX(ticksFromStart2);
        drova.draw(gr);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer2) {
            repaint();
            --ticksFromStart2;       //делалось так, чтобы двигалось вправо
        }
    }
}
