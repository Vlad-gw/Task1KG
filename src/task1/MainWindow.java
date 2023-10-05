package task1;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel panel;

//    private final DrawPanel2 panel2;        //=

    public MainWindow() throws HeadlessException {
        panel = new DrawPanel(this.getWidth(), this.getHeight(), 25);
        this.add(panel);


    }
}


