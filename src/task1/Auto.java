package task1;
import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class Auto {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private double startAngle;
    private double arcAngle;



    public Auto(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //цвет фона
        Color myColor = new Color(11, 218, 81);
        g.setColor(myColor);
        g.fillRect(0, 0,1000, 600);

        //небо
        g.setColor(Color.CYAN);
        g.fillRect(0, 0,1000, 280);

        //дорога
        g.setColor(Color.GRAY);
        g.fillRect(0,430,3000,70);

        //солнце
        g.setColor(Color.YELLOW);
        g.fillArc(870,-110,230,210,145,180);

        //стволы деревьев
        Color myColor2 = new Color(160, 128, 64);
        g.setColor(myColor2);
        g.fillRect(20,210,20,200);

        g.setColor(myColor2);
        g.fillRect(250,250,10,90);

        g.setColor(myColor2);
        g.fillRect(600,220,15,160);

        g.setColor(myColor2);
        g.fillRect(850,205,23,220);

        //листья кокосового дерева
        //1
        g.setColor(Color.GREEN);
        g.fillArc(25, 198, 100,50,-10,180);
        g.setColor(Color.GREEN);
        g.fillArc(-70, 198, 100,50,10,180);
        //2
        g.setColor(Color.GREEN);
        g.fillArc(250, 245, 75,37,-10,180);
        g.fillArc(185, 245, 75,37,10,180);
        //3
        g.setColor(Color.GREEN);
        g.fillArc(503, 213, 110,40,10,180);
        g.fillArc(605, 213, 110,40,-10,180);
        //4
        g.setColor(Color.GREEN);
        g.fillArc(857, 198, 140,42,-10,180);
        g.fillArc(729, 198, 140,42,10,180);

        //кокосы
        Color clr = new Color(86, 53, 37);
        g.setColor(clr);
        g.fillOval(7, 218,20,20);
        g.fillOval(28, 220,20,20);
        g.fillOval(242, 261,12,12);
        g.fillOval(255, 263,12,12);
        g.fillOval(584, 233,23,23);
        g.fillOval(609, 231,23,23);
        g.fillOval(827, 217,32,32);
        g.fillOval(860, 215,32,32);

        // корпус машины
        Color myColorrr = new Color(98, 99, 155);
        g.setColor(myColorrr);
        g.fillRect(this.x, (int) (this.y + 0.5 * this.height), (int) (1.1 * this.width), (int) (0.45 * this.height));
        g.setColor(myColorrr);
        g.drawRect(this.x, (int) (this.y + 0.5 * this.height), (int) (1.1 * this.width), (int) (0.45 * this.height));

        //окна и двери
        g.setColor(Color.CYAN);
        g.fillRect((int) (this.x + 0.05 * this.width), (int) (this.y + 0.52 * this.height),
                (int) (0.45 * this.width), (int) (0.18 * this.height));

        g.setColor(Color.CYAN);
        g.fillRect((int) (this.x + 0.6 * this.width), (int) (this.y + 0.52 * this.height),
                (int) (0.45 * this.width), (int) (0.18 * this.height));

        g.setColor(Color.ORANGE);
        g.fillRect((int) (this.x + 0.535 * this.width), (int) (this.y + 0.5 * this.height),
                (int) (0.03 * this.width), (int) (0.455 * this.height));

        //капот
        g.setColor(myColorrr);
        g.fillRect((int) (this.x + 1.1 * this.width), (int) (this.y + 0.7 * this.height),
        (int) (0.75 * this.width), (int) (0.255 * this.height));
        g.drawRect((int) (this.x + 1.1 * this.width), (int) (this.y + 0.7 * this.height),
                (int) (0.75 * this.width), (int) (0.255 * this.height));

        //багажник
        g.setColor(myColorrr);
        g.fillRect((int) (this.x - 0.4 * this.width), (int) (this.y + 0.7 * this.height),
                (int) (0.4 * this.width), (int) (0.255 * this.height));
        g.drawRect((int) (this.x - 0.4 * this.width), (int) (this.y + 0.7 * this.height),
                (int) (0.4 * this.width), (int) (0.255 * this.height));

        // колеса
        g.setColor(Color.BLACK);
        g.fillOval((int) (this.x - 0.16 * this.width), (int) (this.y + 0.8 * this.height), (int) (0.3 * this.width), (int) (0.25 * height));
        g.drawOval((int) (this.x - 0.16 * this.width), (int) (this.y + 0.8 * this.height), (int) (0.3 * this.width), (int) (0.25 * height));

        g.setColor(Color.BLACK);
        g.fillOval((int) (this.x + 1.3 * this.width), (int) (this.y + 0.8 * this.height), (int) (0.3 * this.width), (int) (0.25 * height));
        g.drawOval((int) (this.x + 1.3 * this.width), (int) (this.y + 0.8 * this.height), (int) (0.3 * this.width), (int) (0.25 * height));

        //Фары
        Color myColor3 = new Color(237, 255, 33);
        g.setColor(myColor3);
        g.fillRect((int) (this.x - 0.4 * this.width), (int) (this.y + 0.75 * this.height),
                (int) (0.1 * this.width), (int) (0.1 * this.height));

        g.setColor(myColor3);
        g.fillOval((int) (this.x + 1.68 * this.width), (int) (this.y + 0.75 * this.height),
                (int) (0.12 * this.width), (int) (0.1 * this.height));

        //надпись
        Font font = new Font("Tahoma", Font.BOLD|Font.ITALIC, 23);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString("Rolls-\nRoyce", (int) (this.x + 0.6 * this.width), (int) (this.y + 0.87 * this.height));

        //шильдик
        g.setColor(Color.BLACK);
        g.fillRect((int) (this.x + 1.78 * this.width), (int) (this.y + 0.63 * this.height),
                (int) (0.03 * this.width), (int) (0.08 * this.height));

        //облака
        g.setColor(Color.WHITE);
        g.fillOval(50, 50, 100, 50);
        g.fillOval(100, 35, 100, 50);
        g.fillOval(150, 50, 100, 50);
        g.fillOval(90, 50, 100, 50);

        g.setColor(Color.WHITE);
        g.fillOval(350, 70, 100, 50);
        g.fillOval(400, 55, 100, 50);
        g.fillOval(450, 70, 100, 50);
        g.fillOval(390, 70, 100, 50);

        g.setColor(Color.WHITE);
        g.fillOval(670, 170, 50, 25);
        g.fillOval(690, 162, 50, 25);
        g.fillOval(710, 170, 50, 25);
        g.fillOval(690, 177, 50, 25);

        //конец
        g.setColor(Color.black);
        g.fillRect(1000,0,3000,600);

    }
}
