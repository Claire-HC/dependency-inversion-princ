package claire.solidprinciples.dependancyinversionprincipleexample;

/**
 * Created by claire on 23/12/20
 */
public class LightBulb implements Switchable{

    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");

    }
}
