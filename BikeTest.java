package Test.Bike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike();
    }

    @Test
    public void bikeCanBeTurnedOn() {
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeCanBeTurnedOff() {
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void bikeAcceleratesInGearOne() {
        bike.turnOn();
        for (int i = 0; i < 5; i++) {
            bike.accelerate();
        }
        assertEquals(5, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeAcceleratesIntoGearTwo() {
        bike.turnOn();
        for (int i = 0; i < 21; i++) {
            bike.accelerate();
        }
        assertEquals(21, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void bikeAcceleratesIntoGearThree() {
        bike.turnOn();
        for (int i = 0; i < 27; i++) {
            bike.accelerate();
        }
        assertEquals(34, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void bikeAcceleratesIntoGearFour() {
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.accelerate();
        }
        assertTrue(bike.getSpeed() > 40);
        assertEquals(4, bike.getGear());
    }

    @Test
    public void bikeCanDecelerate() {
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.accelerate();
        }
        int speedBefore = bike.getSpeed();
        bike.decelerate();
        assertTrue(bike.getSpeed() < speedBefore);
    }

    @Test
    public void bikeDecreasesGearAutomaticallyOnDeceleration() {
        bike.turnOn();
        for (int i = 0; i < 30; i++) {
            bike.accelerate();
        }

        while (bike.getSpeed() > 20) {
            bike.decelerate();
        }

        assertEquals(1, bike.getGear());
    }

    @Test
    public void speedCannotGoBelowZero() {
        bike.turnOn();
        bike.decelerate();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeDoesNotAccelerateWhenOff() {
        bike.accelerate();
        assertEquals(0, bike.getSpeed());
    }
}

