package GameMechanicPrototype;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.*;

public class GameScreenTest {

    private GameScreen screen = new GameScreen();

    @Test
    public void gameScreenShouldHaveDefaultSizeOf1000By800OnConstruction() {
        Dimension expectedDimension = new Dimension(1020, 840);

        assertEquals(expectedDimension, this.screen.getSize());
    }

    @Test
    public void gameScreenDefaultCloseOperationShouldBeSetToExitOnCloseOnConstruction(){
        int expectedCloseOperation = WindowConstants.EXIT_ON_CLOSE;

        assertEquals(expectedCloseOperation, this.screen.getDefaultCloseOperation());
    }

    @Test
    public void gameScreenShouldHaveNameOfMainGameScreen(){
        String expectedName = "Main Game Screen";

        assertEquals(expectedName, this.screen.getName());
    }

    @Test
    public void gameScreenTitleTextDefaultsTo_LearnTDD() {
        String expectedTitle = "LEARN TDD";

        assertEquals(expectedTitle, this.screen.getTitle());
    }

    @Test
    public void gameScreenContentPaneShouldHaveBoxLayout(){
        String expectedLayout = BoxLayout.class.toString();

        assertEquals(expectedLayout, this.screen.getContentPane().getLayout().getClass().toString());
    }

    @Test
    public void gameScreenContentPaneShouldHaveNameOfMainScreenContentPane(){
        String expectedName = "Main Screen Content Pane";

        assertEquals(expectedName, this.screen.getContentPane().getName());
    }

    @Test
    public void testViewPanelIsNamed_TestViewPanel() {
        String expectedName = "Test View Panel";

        assertEquals(expectedName, this.screen.getContentPane().getComponent(0).getName());
    }

    @Test
    public void prodViewPanelShouldBeNamed_ProdViewPanel() {
        String expectedName = "Prod View Panel";

        assertEquals(expectedName, this.screen.getContentPane().getComponent(1).getName());
    }

    @Test
    public void codePiecesPanelShouldBeAddedToTestViewPanel() {
        String expectedName = "Test View Code Pieces Panel";
        JPanel testView = (JPanel)this.screen.getContentPane().getComponent(0);

        assertEquals(expectedName, testView.getComponent(0).getName());
    }

    @Test
    public void codeEditorPanelShouldBeAddedToTestViewPanel() {
        String expectedName = "Test View Code Editor Panel";
        JPanel testView = (JPanel)this.screen.getContentPane().getComponent(0);

        assertEquals(expectedName, testView.getComponent(1).getName());
    }

    @Test
    public void codePiecesShouldBeAddedToProdViewPanel() {
        String expectedName = "Prod View Code Pieces Panel";
        JPanel testView = (JPanel)this.screen.getContentPane().getComponent(1);

        assertEquals(expectedName, testView.getComponent(0).getName());
    }

    @Test
    public void codeEditorShouldBeAddedToProdViewPanel() {
        String expectedName = "Prod View Code Editor Panel";
        JPanel testView = (JPanel)this.screen.getContentPane().getComponent(1);

        assertEquals(expectedName, testView.getComponent(1).getName());
    }

    @Test
    public void testViewPanelHasPreferredSizeOf1000by420() {
        Dimension expectedDimension = new Dimension(1000, 420);
        JPanel testViewPanel = (JPanel)this.screen.getContentPane().getComponent(0);

        assertEquals(expectedDimension, testViewPanel.getPreferredSize());
    }

    @Test
    public void prodViewPanelHasPreferredSizeOf1000by420() {
        Dimension expectedDimension = new Dimension(1000, 420);
        JPanel prodViewPanel = (JPanel)this.screen.getContentPane().getComponent(1);

        assertEquals(expectedDimension, prodViewPanel.getPreferredSize());
    }

    @Test
    public void testViewPanelSubPanelsHavePreferredSizeOf1000by420() {
        Dimension expectedDimension = new Dimension(500, 400);
        JPanel testViewPanel = (JPanel)this.screen.getContentPane().getComponent(0);

        assertEquals(expectedDimension, testViewPanel.getComponent(0).getPreferredSize());
        assertEquals(expectedDimension, testViewPanel.getComponent(1).getPreferredSize());
    }

    @Test
    public void prodViewPanelSubPanelsHavePreferredSizeOf1000by420() {
        Dimension expectedDimension = new Dimension(500, 400);
        JPanel prodViewPanel = (JPanel)this.screen.getContentPane().getComponent(0);

        assertEquals(expectedDimension, prodViewPanel.getComponent(0).getPreferredSize());
        assertEquals(expectedDimension, prodViewPanel.getComponent(1).getPreferredSize());
    }
}
