import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;


public class StacjaPogodowa {


    public int getTemperature() {

        return random(-25, 35);
    }

    private int random(int min, int max) {

        Random random = new Random();
        return random.nextInt(-min + max + 1) + min;
    }

    public static boolean getWeather(){
        Random random = new Random();

        if(random.nextBoolean() == true){
            System.out.print("jest słonecznie");
        } else {
            System.out.print("jest pochmurno");
        }
        return random.nextBoolean();
    }
}
