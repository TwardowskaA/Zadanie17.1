package spring;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {

    private StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public String sterownik(){
        if (stacjaPogodowa.getWeather().equals(" jest słonecznie"))
            return "Jest słonecznie. Zasłaniam rolety";
        else
            return "Jest pochmurnie. Nie zasłaniam rolet";
    }
}
