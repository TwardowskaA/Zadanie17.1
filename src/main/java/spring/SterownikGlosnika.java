package spring;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {

    private StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public String status() {
        return "Dzień dobry. Dzisiejsza temperatura " + stacjaPogodowa.getTemperature()+"*C" + stacjaPogodowa.getWeather();
    }

}

