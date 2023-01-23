import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTests {
    Plane plane;
    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUSA320);
    }
    @Test
    public void planeHasAPlaneType() {
        assertEquals(PlaneType.AIRBUSA320, plane.getPlaneType());
    }
    @Test
    public void planeHasAWeight() {
        assertEquals(10, plane.getPlaneWeight());
    }
    @Test
    public void planeHasACapacity() {
        assertEquals(5, plane.getPlaneCapacity());
    }

}
