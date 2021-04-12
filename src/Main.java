import originator.Editor;
import shape.Circle;
import shape.Rectangle;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new Rectangle(250, 250, 100, 100, Color.GREEN)
        );
    }
}
