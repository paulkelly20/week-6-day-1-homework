import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    private WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test

    public void testVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void testVolumeAfterOneDrink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void testVolumeAfterMultipleDrinks(){
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        bottle.drink();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void testVolumeBottleEmpty(){
        bottle.emptyBottle();
        assertEquals(0,bottle.getVolume());
    }

    @Test
    public void testVolumeBottleFull(){
        bottle.fillBottle();
        assertEquals(100, bottle.getVolume());
    }
}
