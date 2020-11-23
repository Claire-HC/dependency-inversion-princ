package claire.solidprinciples.dependancyinversionprincipleexample;

/**
 * Created by claire on 23/12/20
 */
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
