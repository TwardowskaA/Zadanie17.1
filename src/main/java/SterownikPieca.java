import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class SterownikPieca {




    public SterownikPieca(StacjaPogodowa stacjaPogodowa){
        if(stacjaPogodowa.getTemperature()< 15){
            System.out.println("Jest zimno. Uruchamiam piec");
        } else {
            System.out.println("Jest ciepło. Nie uruchamiam pieca");
        }
    }
}
