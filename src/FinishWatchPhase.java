import java.awt.*;

public class FinishWatchPhase extends PhaseImpl implements Phase {
    FinishWatchPhase(ClickArea area) {
        super(area);
    }

    @Override
    public Point getClickPoint() {
        return area.getClickPoint();
    }

    @Override
    public int getPause() {
        return 1000 + random.nextInt(1000);
    }
}
