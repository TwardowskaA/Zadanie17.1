import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SmartHome {

    @Bean
    public StacjaPogodowa stacjaPogodowa() {
        System.out.println("Pobieram aktualne informacje pogodowe");
        StacjaPogodowa stacja = new StacjaPogodowa();
        return stacja;
    }

    @Bean
    public SterownikGlosnika sterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        SterownikGlosnika sterownikGlosnika = new SterownikGlosnika(stacjaPogodowa);
        return sterownikGlosnika;
    }

    @Bean
    public SterownikPieca sterownikPieca(SterownikGlosnika sterownikGlosnika,StacjaPogodowa stacjaPogodowa) {
        SterownikPieca sterownikPieca = new SterownikPieca(sterownikGlosnika,stacjaPogodowa);
        return sterownikPieca;
    }

    @Bean
    public SterownikRolet sterownikRolet(StacjaPogodowa stacjaPogodowa) {
        SterownikRolet sterownikRolet = new SterownikRolet(stacjaPogodowa);
        return sterownikRolet;
    }




}
