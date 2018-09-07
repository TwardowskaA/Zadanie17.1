package spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {

    private RandomTemperature randomTemperature;
    private int temperature;

    public StacjaPogodowa(RandomTemperature randomTemperature) {
        this.randomTemperature = randomTemperature;
        this.setTemperature();
        this.info();
    }

    public void setTemperature() {

       temperature = randomTemperature.random(-25,30);
    }

    public int getTemperature() {
        return temperature;
    }


    public String getWeather(){
        Random random = new Random();
        boolean weather = random.nextBoolean();
        if(weather){
            return " jest słonecznie";
        } else {
            return " jest pochmurno";
        }
    }

    public String info(){
        return "Uruchamiam stację pogodową";
    }

}
