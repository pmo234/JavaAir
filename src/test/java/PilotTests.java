import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTests {
    Pilot pilot;
    Pilot coPilot;
    @Before
    public void before(){
        pilot = new Pilot("Jennifer",Rank.Captain, "jfk123");
        coPilot = new Pilot("Mandy",Rank.FirstOfficer, "jfk121");
    }
    @Test
    public void pilotHasAName() {
        assertEquals("Jennifer", pilot.getName());
    }
    @Test
    public void pilotHasARank() {
        assertEquals(Rank.Captain, pilot.getRank());
    }
    @Test
    public void pilotHasALicenceNumber() {
        assertEquals("jfk123", pilot.getPilotLicenceNumber());
    }
    @Test
    public void pilotCanFlyThePlaneIfCaptain() {
        assertEquals("You can fly", pilot.canFlyPlane());
    }
    @Test
    public void pilotCanNotFlyThePlaneIfFirstOfficer() {
        assertEquals("You can not fly", coPilot.canFlyPlane());
    }


}

