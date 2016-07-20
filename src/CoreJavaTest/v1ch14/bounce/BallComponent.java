package CoreJavaTest.v1ch14.bounce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mizeshuang on 2016/6/2.
 */
public class BallComponent extends JPanel {
    private static final int DEFAULT_WIDTH = 450;
    private static final int DEFAULT_HEIGHT = 330;

    private List<Ball> balls = new ArrayList<>();

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Graphics2D graphics2D = (Graphics2D) g;
        for (Ball b : balls) {
            graphics2D.fill(b.getShape());
        }
    }

    public void add(Ball ball) {
        balls.add(ball);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
