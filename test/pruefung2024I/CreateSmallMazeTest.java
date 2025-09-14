package pruefung2024I;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class CreateSmallMazeTest {

    private static Room byName(Set<Room> rooms, String name) {
        for (Room room : rooms) if (name.equals(room.getName())) return room;
        return null;
    }

    @Test
    void createsCorrectMaze() {
        CreateSmallMaze smallMaze = new CreateSmallMaze();
        Room a1 = smallMaze.createSmallMaze();
        assertEquals("a1", a1.getName());

        // a1 <-> a2
        assertEquals(1, a1.getReachable().size());
        Room a2 = byName(a1.getReachable(), "a2");
        assertNotNull(a2);
        assertTrue(a2.getReachable().contains(a1));

        // a2 <-> b2, keine Diagonale a2 <-> b1
        assertEquals(2, a2.getReachable().size());
        Room b2 = byName(a2.getReachable(), "b2");
        assertNotNull(b2);
        assertTrue(b2.getReachable().contains(a2));
        assertNull(byName(a2.getReachable(), "b1"));

        // b2 <-> b1
        assertEquals(2, b2.getReachable().size());
        Room b1 = byName(b2.getReachable(), "b1");
        assertNotNull(b1);
        assertTrue(b1.getReachable().contains(b2));
        assertEquals(1, b1.getReachable().size());

        // Minotaurus nur in b1
        assertTrue(b1.hasMinotaur());
        assertFalse(a1.hasMinotaur());
        assertFalse(a2.hasMinotaur());
        assertFalse(b2.hasMinotaur());

    }

}
