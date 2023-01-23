import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTests {
    CabinCrewMember cabinCrewMember;
    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Lexi",Rank.Captain);
    }
    @Test
    public void cabinCrewMemberHasAName() {
        assertEquals("Lexi", cabinCrewMember.getName());
    }
    @Test
    public void cabinCrewMemberHasARank() {
        assertEquals(Rank.Captain, cabinCrewMember.getRank());
    }
    @Test
    public void canRelayAMessage() {
        assertEquals("Get ready for landing", cabinCrewMember.relayMessage("Get ready for landing"));
    }

}
