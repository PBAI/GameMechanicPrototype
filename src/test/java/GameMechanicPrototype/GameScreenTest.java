package GameMechanicPrototype;

import org.junit.Test;

import javax.swing.*;
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
    public void gameScreenShouldHaveNameOfMainGameScreen(){
        GameScreen screen = new GameScreen(new Dimension(2, 2));
        String expectedName = "Main Game Screen";

        assertEquals(expectedName, screen.getName());
    }

    @Test
    public void gameScreenTitleDefaultsToLearnTDD() {
        GameScreen screen = new GameScreen(new Dimension(1500,1000));
        String expectedTitle = "Learn TDD";

        assertEquals(expectedTitle, screen.getTitle());
    }

    @Test
    public void gameScreenContentPaneShouldHaveFlowLayout(){
        GameScreen screen = new GameScreen(new Dimension(1, 1));
        String expectedLayout = FlowLayout.class.toString();

        assertEquals(expectedLayout, screen.getContentPane().getLayout().getClass().toString());
    }

    @Test
    public void gameScreenContentPaneShouldHaveNameOfMainScreenContentPane(){
        GameScreen screen = new GameScreen(new Dimension(1, 1));
        String expectedName = "Main Screen Content Pane";

        assertEquals(expectedName, screen.getContentPane().getName());
    }

    @Test
    public void firstJPanelisNamedCodePieces() {
        GameScreen screen = new GameScreen(new Dimension(1, 1));
        String expectedName = "Code Pieces";

        assertEquals(expectedName, screen.getContentPane().getComponent(0).getName());
    }

    @Test
    public void codePiecesPanelShouldHaveLabelWithTextThatSaysCodePieces(){
        GameScreen screen = new GameScreen(new Dimension(2,2));
        String expectedText = "CODE PIECES";
        JPanel panel = (JPanel) screen.getContentPane().getComponent(0);
        JLabel label = (JLabel) panel.getComponent(0);

        assertEquals(expectedText, label.getText());
    }

    @Test
    public void codeEditorPanelShouldHaveLabelWithTextThatSaysCodeEditor() {
        GameScreen screen = new GameScreen(new Dimension(2,2));
        String expectedText = "CODE EDITOR";
        JPanel panel = (JPanel) screen.getContentPane().getComponent(1);
        JLabel label = (JLabel) panel.getComponent(0);

        assertEquals(expectedText, label.getText());
    }
}
