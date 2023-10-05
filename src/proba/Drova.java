package proba;

import java.awt.*;

public class Drova {

    private int x2;
    private int y2;
    private int width2;
    private int height2;
    private Color color2;
    private double startAngle2;
    private double arcAngle2;

    public Drova(final int x2, final int y2, final int width2, final int height2, final Color color2) {
        this.x2 = x2;
        this.y2 = y2;
        this.width2 = width2;
        this.height2 = height2;
        this.color2 = color2;
    }

    public void setX(int x2) {
        this.x2 = x2;
    }

    public void setY(int y2) {
        this.y2 = y2;
    }

    public void setWidth(int width2) {
        this.width2 = width2;
    }

    public void setHeight(int height2) {
        this.height2 = height2;
    }

    public void setColor(Color color2) {
        this.color2 = color2;
    }

    void draw(final Graphics gr) {
        Graphics2D g2 = (Graphics2D) gr;

        g2.setColor(Color.GRAY);
        g2.fillOval((int) (this.x2 + 0.5 * this.width2), (int) (this.y2 + 0.9 * this.height2),
                (int) (0.3 * this.width2), (int) (0.5 * this.height2));
    }
}
