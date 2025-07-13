package TestToggle;

import org.junit.jupiter.api.Test;

public class TestToggle {


}
@Test
    public void testThatToggleison() {
    toggle myToggle = new myToggle();
    assertFalse(myToggle.isStatus());

    myToggle.isOn();
    assertTrue(myToggle.isStatus());
}