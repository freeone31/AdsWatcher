import org.springframework.context.annotation.Bean;

public class PhaseFactory {
    private Phase lastPhase = null;
    private PhaseConfiguration phaseConfiguration;

    public PhaseFactory() {
        this.phaseConfiguration = new PhaseConfiguration();
    }

    @Bean
    public Phase startWatchPhase() {
        return phaseConfiguration.startWatchPhase();
    }

    @Bean
    public Phase startWatchConfirmPhase() {
        return phaseConfiguration.startWatchConfirmPhase();
    }

    @Bean
    public Phase closeAdsPhase() {
        return phaseConfiguration.closeAdsPhase();
    }

    @Bean
    public Phase closeVerticalAdsPhase() {
        return phaseConfiguration.closeVerticalAdsPhase();
    }

    @Bean
    public Phase finishWatchPhase() {
        return phaseConfiguration.finishWatchPhase();
    }

    @Bean
    public Phase getNextPhase() {
        if (lastPhase instanceof StartWatchPhase) {
            lastPhase = startWatchConfirmPhase();
        }
        else if (lastPhase instanceof StartWatchConfirmPhase) {
            lastPhase = closeAdsPhase();
        }
        else if (lastPhase instanceof CloseAdsPhase) {
            lastPhase = closeVerticalAdsPhase();
        }
        else if (lastPhase instanceof CloseVerticalAdsPhase) {
            lastPhase = finishWatchPhase();
        }
        else if (lastPhase instanceof FinishWatchPhase) {
            lastPhase = startWatchPhase();
        }
        else {
            lastPhase = startWatchPhase();
        }

        return lastPhase;
    }
}
