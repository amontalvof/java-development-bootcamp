package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import main.models.Team;

public class TeamTest {

    @Test
    public void hasNullTest() {
        String[] chasers = new String[] { null, "Ginny", "Katie" };
        assertTrue(Team.hasNull(chasers));
    }

    @Test
    public void hasBlankTest() {
        String[] chasers = new String[] { "    ", "Ginny", "Katie" };
        assertTrue(Team.hasBlank(chasers));
    }

}