package spring;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {

    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public String sterownikPieca(){
        if(temperature() > 15)
            return "Jest ciepło. Nie uruchamiam pieca";
        else
            return "Jest zimno. Uruchamiam piec";
    }


    public int temperature(){
        return stacjaPogodowa.getTemperature();
    }
}
