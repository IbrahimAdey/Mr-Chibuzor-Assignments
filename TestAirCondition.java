package TestPackage;

import ClassPackage.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAirCondition {
    @Test
    public void testThatAirConditionCanOn() {
        AirConditioner myAirConditioner = new AirConditioner();
        assertFalse(myAirConditioner.isStatus());

        myAirConditioner.isOn();
        assertTrue(myAirConditioner.isStatus());
    }
    @Test
    public void testThatAirConditionCanOff() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.isOn();
        assertTrue(myAirConditioner.isStatus());

        myAirConditioner.isOff();
        assertFalse(myAirConditioner.isStatus());
    }
    @Test
    public void testThatAirConditionCanIncreaseTemperature() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.isOn();
        assertTrue(myAirConditioner.isStatus());
        myAirConditioner.increase(32);
        assertEquals(30,myAirConditioner.getTemperature());
    }
    @Test
    public void testThatAirConditionCanDecreaseTemperature() {
        AirConditioner myAirConditioner = new AirConditioner();
        myAirConditioner.isOn();

        myAirConditioner.increase(30);
        assertEquals(30,myAirConditioner.getTemperature());

        myAirConditioner.decrease(16);
        assertEquals(16,myAirConditioner.getTemperature());
    }

}
