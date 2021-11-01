import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCounter implements ActionListener {

    private int count = 0;
    private final JLabel label;
    private final JFrame frame;
    private final JPanel panel;
    private final JButton button;

        public SimpleCounter() {

            frame = new JFrame();

            button= new JButton("Click Me!");
            button.addActionListener(this);

            label = new JLabel("Number of clicks: 0");

            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            panel.setLayout(new GridLayout(0, 1));
            panel.add(button);
            panel.add(label);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Simple Counter");
            frame.pack();
            frame.setVisible(true);
        }

        public static void main (String [] args){
            new SimpleCounter();
        }

    @Override
    public void actionPerformed(ActionEvent e) {
            count++;
            label.setText("Number of clicks: %d".formatted(count));
    }
}

