import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

/*
реальные границы:

начало просмотра     -1012 -955 726 782
подтверждение        -931 -821 1063 1086
закрытие рекламы     -150 -131 675 694
вертикальной рекламы -604 -594 667 677
подтверждение        -856 -746 1054 1077

на всякий случай:

начало просмотра     -1011 -956 727 781 = 55 54
подтверждение        -930 -822 1064 1085 = 108 21
закрытие рекламы     -149 -132 676 693 = 17 17
вертикальной рекламы -603 -595 668 676 = 8 8
подтверждение        -855 -747 1055 1076 = 108 21
 */

public class Main {
    public static void main(String[] args) {
        PhaseFactory phaseFactory = new PhaseFactory();

        try {
            Robot robot = new Robot();

            while (true) {
                Phase phase = phaseFactory.getNextPhase();
                Point point = phase.getClickPoint();
                robot.mouseMove(point.x, point.y);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                TimeUnit.MILLISECONDS.sleep(phase.getPause());

//                Point dbg = MouseInfo.getPointerInfo().getLocation();
//                System.out.println(dbg.x + ":" + dbg.y);
//                System.out.println(robot.getPixelColor(dbg.x, dbg.y));
//                TimeUnit.SECONDS.sleep(1);
            }
        } catch (Exception e) {

        }
    }
}
