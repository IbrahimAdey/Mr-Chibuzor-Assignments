package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeoPoliticalZoneFinderTest {

    @Test
    public void testNorthCentralStates() {
        assertEquals("North Central", GeoPoliticalZoneFinder.getZone("Benue"));
        assertEquals("North Central", GeoPoliticalZoneFinder.getZone("FCT"));
        assertEquals("North Central", GeoPoliticalZoneFinder.getZone("Kwara"));
    }

    @Test
    public void testNorthEastStates() {
        assertEquals("North East", GeoPoliticalZoneFinder.getZone("Borno"));
        assertEquals("North East", GeoPoliticalZoneFinder.getZone("Yobe"));
    }

    @Test
    public void testNorthWestStates() {
        assertEquals("North West", GeoPoliticalZoneFinder.getZone("Kano"));
        assertEquals("North West", GeoPoliticalZoneFinder.getZone("Zamfara"));
    }

    @Test
    public void testSouthEastStates() {
        assertEquals("South East", GeoPoliticalZoneFinder.getZone("Imo"));
    }

    @Test
    public void testSouthSouthStates() {
        assertEquals("South South", GeoPoliticalZoneFinder.getZone("Delta"));
    }

    @Test
    public void testSouthWestStates() {
        assertEquals("South West", GeoPoliticalZoneFinder.getZone("Lagos"));
    }

    @Test
    public void testInvalidState() {
        assertEquals("Invalid Unknown zone", GeoPoliticalZoneFinder.getZone("Narnia"));
    }
}
