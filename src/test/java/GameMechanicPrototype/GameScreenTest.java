package GameMechanicPrototype;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class GameScreenTest {

    @Test
    public void gameScreenShouldHaveSizeOf1500By1000OnConstruction() {
        Dimension expectedDimension = new Dimension(1500, 1000);
        GameScreen gameScreen = new GameScreen(expectedDimension);

        assertEquals(expectedDimension, gameScreen.getSize());
    }

    @Test
    public void gameScreenDefaultCloseOperationShouldBeSetToExitOnCloseOnConstruction(){
        GameScreen screen = new GameScreen(new Dimension(123, 123));
        int EXIT_ON_CLOSE = 3;

        assertEquals(EXIT_ON_CLOSE, screen.getDefaultCloseOperation());
    }

    @Test
    public void gameScreenTitleDefaultsToLearnTDD() {
        GameScreen screen = new GameScreen(new Dimension(1500,1000));
        String expectedTitle = "Learn TDD";

        assertEquals(expectedTitle, screen.getTitle());
    }


}
