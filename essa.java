import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        super("BorderLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton btnNorth = new JButton("North");
        add(btnNorth, BorderLayout.NORTH);

        JButton btnSouth = new JButton("South");
        add(btnSouth, BorderLayout.SOUTH);

        JButton btnEast = new JButton("East");
        add(btnEast, BorderLayout.EAST);

        JButton btnWest = new JButton("West");
        add(btnWest, BorderLayout.WEST);

        JButton btnCenter = new JButton("Center");
        add(btnCenter, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
