import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AreaConfiguration {
    @Bean
    public ClickArea startWatchArea() {
        return new StartWatchArea();
    }

    @Bean
    public ClickArea startWatchConfirmArea() {
        return new StartWatchConfirmArea();
    }

    @Bean
    public ClickArea closeAdsArea() {
        return new CloseAdsArea();
    }

    @Bean
    public ClickArea closeVerticalAdsArea() {
        return new CloseVerticalAdsArea();
    }

    @Bean
    public ClickArea finishWatchArea() {
        return new FinishWatchArea();
    }
}
