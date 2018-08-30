import org.springframework.context.annotation.Bean;

public class SterownikRolet {



    public SterownikRolet(StacjaPogodowa stacjaPogodowa){
        if(stacjaPogodowa.getWeather() == true) {
            System.out.println("Jest słonecznie. Zasłaniam rolety");
        } else {
            System.out.println("Jest pochmurnie. Nie zasłaniam rolet");
        }

    }
}
