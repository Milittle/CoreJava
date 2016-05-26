package CoreJavaTest.v1ch11.debugger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mizeshuang on 2016/5/24.
 */
public class BuggyButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame = new BuggyButtonFrame();
                jFrame.setTitle("BuggyButtonTest");
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setVisible(true);
                jFrame.setBounds(500,200,300,200);
            }
        });
    }
}

class BuggyButtonFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HIGHT = 200;
    public BuggyButtonFrame() {
        setSize(DEFAULT_WIDTH,DEFAULT_HIGHT);
        add(new BuggyButtonPanel());
    }
}

class BuggyButtonPanel extends JPanel {

    public BuggyButtonPanel() {
        ButtonActionListener buttonActionListener = new ButtonActionListener();
        Button redButton = new Button("red");
        add(redButton);
        redButton.addActionListener(buttonActionListener);
        Button blueButton = new Button("blue");
        add(blueButton);
        blueButton.addActionListener(buttonActionListener);
        Button yellowButton = new Button("yellow");
        add(yellowButton);
        yellowButton.addActionListener(buttonActionListener);
    }

    private class ButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String arg = e.getActionCommand();
            if ("red".equals(arg)) {
                setBackground(Color.red);
            }else if ("blue".equals(arg)) {
                setBackground(Color.blue);
            }else if ("yellow".equals(arg)) {
                setBackground(Color.yellow);
            }
        }
    }
}
