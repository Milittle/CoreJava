package CoreJavaTest.v1ch14.bounce;


import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/**
 * Created by mizeshuang on 2016/6/2.
 */
public class Ball {
    private static final int XSIZE = 15;
    private static final int YSIZE = 15;
    private double x = new Random().nextInt(10);
    private double y = new Random().nextInt(10);
    private double dx = new Random().nextInt(10);
    private double dy = new Random().nextInt(10);

    public void move(Rectangle2D bounds) {
        x += dx;
        y += dy;
        if (x < bounds.getMinX()) {
            x = bounds.getMinX();
            dx = -dx;
        }
        if (x + XSIZE >= bounds.getMaxX()) {
            x = bounds.getMaxX() - XSIZE;
            dx = -dx;
        }
        if (y < bounds.getMinY()) {
            y = bounds.getMinY();
            dy = -dy;
        }
        if (y + YSIZE >= bounds.getMaxY()) {
            y = bounds.getMaxY() - YSIZE;
            dy = -dy;
        }
    }

    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, XSIZE, YSIZE);
    }
}
