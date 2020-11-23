package claire.solidprinciples.dependancyinversionprincipleexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by claire on 23/12/20
 */
public class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception{
        Switchable switchableBulb = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }

}