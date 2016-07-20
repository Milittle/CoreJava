package CoreJavaTest.v1ch14.bounce;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mizeshuang on 2016/6/2.
 */
public class Bounce {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame = new BounceFrame();
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setVisible(true);
            }
        });
    }
}

class BounceFrame extends JFrame {
    private BallComponent component;
    public static final int STEPS = 1000;
    public static final int DELAY = 3;

    public BounceFrame() {
        setTitle("Bounce");
        component = new BallComponent();
        add(component, BorderLayout.CENTER);
        JPanel jPanel = new JPanel();
        addButton(jPanel, "Start", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBall();
            }
        });
        addButton(jPanel, "Stop", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(jPanel, BorderLayout.SOUTH);
        pack();
    }

    public void addButton(Container container, String title, ActionListener actionListener) {
        JButton jButton = new JButton(title);
        container.add(jButton);
        jButton.addActionListener(actionListener);
    }

    public void addBall() {
        Ball ball = new Ball();
        component.add(ball);
        for(int i=0;i<STEPS;i++) {
            ball.move(component.getBounds());
            component.paintComponents(component.getGraphics());
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
