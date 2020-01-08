package GameMechanicPrototype;

import org.junit.Test;

import javax.swing.*;
import java.awt.*;

import static org.junit.Assert.*;

public class GameScreenTest {

    private GameScreen screen = new GameScreen();

    @Test
    public void gameScreenShouldHaveDefaultSizeOf1000By800OnConstruction() {
        Dimension expectedDimension = new Dimension(1000, 800);

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
    public void gameScreenContentPaneShouldHaveFlowLayout(){
        String expectedLayout = FlowLayout.class.toString();

        assertEquals(expectedLayout, this.screen.getContentPane().getLayout().getClass().toString());
    }

    @Test
    public void gameScreenContentPaneShouldHaveNameOfMainScreenContentPane(){
        String expectedName = "Main Screen Content Pane";

        assertEquals(expectedName, this.screen.getContentPane().getName());
    }

    @Test
    public void codePiecesPanelIsNamed_CodePiecesPanel() {
        String expectedName = "Code Pieces Panel";

        assertEquals(expectedName, this.screen.getContentPane().getComponent(0).getName());
    }

    @Test
    public void codePiecesPanelShouldHaveLabelWithTextThatSays_CodePieces(){
        String expectedText = "CODE PIECES";
        JPanel panel = (JPanel) this.screen.getContentPane().getComponent(0);
        JLabel label = (JLabel) panel.getComponent(0);

        assertEquals(expectedText, label.getText());
    }

    @Test
    public void codeEditorPanelShouldHaveLabelWithTextThatSays_CodeEditor() {
        String expectedText = "CODE EDITOR";
        JPanel panel = (JPanel) this.screen.getContentPane().getComponent(1);
        JLabel label = (JLabel) panel.getComponent(0);

        assertEquals(expectedText, label.getText());
    }

    @Test
    public void codeEditorPanelShouldBeNamed_CodeEditorPanel() {
        String expectedName = "Code Editor Panel";

        assertEquals(expectedName, this.screen.getContentPane().getComponent(1).getName());
    }
}
