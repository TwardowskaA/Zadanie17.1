import org.springframework.context.annotation.Bean;

public class SterownikGlosnika  {


    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        if (Temperature(stacjaPogodowa) < 15){
            System.out.println("Dzień dobry. Dzisiejsza temperatura " + Temperature(stacjaPogodowa) + "*C" + StacjaPogodowa.getWeather());
        } else {
            System.out.println("Dzień dobry. Dzisiejsza temperatura " + Temperature(stacjaPogodowa) + "*C" + StacjaPogodowa.getWeather());
        }
    }

    public int Temperature(StacjaPogodowa stacjaPogodowa){
        return stacjaPogodowa.getTemperature();
    }




}
