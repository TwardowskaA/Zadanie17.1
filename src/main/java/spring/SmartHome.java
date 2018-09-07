package spring;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {
    private StacjaPogodowa stacjaPogodowa;
    private SterownikGlosnika sterownikGlosnika;
    private SterownikRolet sterownikRolet;
    private SterownikPieca sterownikPieca;

    public SmartHome(StacjaPogodowa stacjaPogodowa, SterownikGlosnika sterownikGlosnika, SterownikRolet sterownikRolet, SterownikPieca sterownikPieca) {
        this.stacjaPogodowa = stacjaPogodowa;
        this.sterownikGlosnika = sterownikGlosnika;
        this.sterownikRolet = sterownikRolet;
        this.sterownikPieca = sterownikPieca;
    }

    public void uruchom(){
        System.out.println(stacjaPogodowa.info());
        System.out.println(sterownikGlosnika.status());
        System.out.println(sterownikRolet.sterownik());
        System.out.println(sterownikPieca.sterownikPieca());
    }
}
