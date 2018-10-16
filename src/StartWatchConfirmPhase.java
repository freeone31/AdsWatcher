import java.awt.*;

public class StartWatchConfirmPhase extends PhaseImpl implements Phase {
    StartWatchConfirmPhase(ClickArea area) {
        super(area);
    }

    @Override
    public Point getClickPoint() {
        return area.getClickPoint();
    }

    @Override
    public int getPause() {
        return 57000 + random.nextInt(1000);
    }
}
