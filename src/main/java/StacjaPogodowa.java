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
        boolean a = random.nextBoolean();
        boolean b = random.nextBoolean();
        if(random.nextBoolean() == a){
            System.out.print("jest słonecznie. Zapowiada sie dobry dzień");
        } else if(random.nextBoolean() == b){
            System.out.print("jest pochmurno. Zapowiada sie zły dzień");
        }
        return a || b;
    }
}
