import java.awt.*;

public class CloseVerticalAdsPhase extends PhaseImpl implements Phase {
    CloseVerticalAdsPhase(ClickArea area) {
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
