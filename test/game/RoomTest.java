package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testGetDescription() {
        //Arrange
        Room room = new Room("cave");
        // Act
        String actual = room.getDescription();
        // Assert
        assertEquals("cave", room.getDescription());
    }
}