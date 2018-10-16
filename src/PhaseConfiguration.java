import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhaseConfiguration {
    AreaConfiguration areaConfiguration;

    public PhaseConfiguration() {
        areaConfiguration = new AreaConfiguration();
    }

    @Bean
    public Phase startWatchPhase() {
        return new StartWatchPhase(areaConfiguration.startWatchArea());
    }

    @Bean
    public Phase startWatchConfirmPhase() {
        return new StartWatchConfirmPhase(areaConfiguration.startWatchConfirmArea());
    }

    @Bean
    public Phase closeAdsPhase() {
        return new CloseAdsPhase(areaConfiguration.closeAdsArea());
    }

    @Bean
    public Phase closeVerticalAdsPhase() {
        return new CloseVerticalAdsPhase(areaConfiguration.closeVerticalAdsArea());
    }

    @Bean
    public Phase finishWatchPhase() {
        return new FinishWatchPhase(areaConfiguration.finishWatchArea());
    }
}