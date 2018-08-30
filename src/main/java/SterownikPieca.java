import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class SterownikPieca {




    public SterownikPieca(SterownikGlosnika sterownikGlosnika, StacjaPogodowa stacjaPogodowa){
        if(sterownikGlosnika.Temperature(stacjaPogodowa)< 15){
            System.out.println("Jest zimno. Uruchamiam piec");
        } else {
            System.out.println("Jest ciepło. Nie uruchamiam pieca");
        }
    }
}
