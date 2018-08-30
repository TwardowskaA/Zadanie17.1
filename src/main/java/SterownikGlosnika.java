import org.springframework.context.annotation.Bean;

public class SterownikGlosnika  {


    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        if (stacjaPogodowa.getTemperature() < 15){
            System.out.println("Dzień dobry. Dzisiejsza temperatura " + stacjaPogodowa.getTemperature() + "*C" + StacjaPogodowa.getWeather());
        } else {
            System.out.println("Dzień dobry. Dzisiejsza temperatura " + stacjaPogodowa.getTemperature() + "*C" + StacjaPogodowa.getWeather());
        }
    }




}
