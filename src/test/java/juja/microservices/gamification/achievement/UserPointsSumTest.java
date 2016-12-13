package juja.microservices.gamification.achievement;

import juja.microservices.gamification.achivement.UserPointsSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UserPointsSumTest {

    @Test
    public void shouldCreateAuthFromColonSeparated() {
        String name = "johnny";
        int pointSum = 10;

        UserPointsSum userPointsSum = new UserPointsSum("johnny", 10);

        assertNotNull(userPointsSum);
        assertEquals(name, userPointsSum.getUserToId());
        assertEquals(pointSum, userPointsSum.getPointCount());
    }
}
