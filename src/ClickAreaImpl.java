import java.awt.*;
import java.util.Random;

public abstract class ClickAreaImpl implements ClickArea {
    int x;
    int y;
    int width;
    int height;

    @Override
    public Point getClickPoint() {
        Random random = new Random();
        return new Point(x + random.nextInt(width), y + random.nextInt(height));
    }

    @Override
    public String toString() {
        return "ClickAreaImpl{" +
            "x=" + x +
            ", y=" + y +
            ", width=" + width +
            ", height=" + height +
            '}';
    }
}
