import java.util.Random;

abstract class PhaseImpl implements Phase {
    ClickArea area;
    Random random;

    public PhaseImpl(ClickArea area) {
        this.area = area;
        this.random = new Random();
    }
}
