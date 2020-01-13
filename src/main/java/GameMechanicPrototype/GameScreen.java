package GameMechanicPrototype;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JFrame {

    public static void main(String[] args){
        GameScreen gameScreen = new GameScreen();
        gameScreen.setVisible(true);
    }

    public GameScreen() {
        this.setSize(new Dimension(1020, 840));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setName("Main Game Screen");
        this.setTitle("LEARN TDD");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.setName("Main Screen Content Pane");
        addTestViewPanelToContentPane(contentPane);
        addProdViewPanelToContentPane(contentPane);
    }

    private void addTestViewPanelToContentPane(Container contentPane){
        JPanel testViewPanel = new JPanel();
        testViewPanel.setName("Test View Panel");
        testViewPanel.setBackground(Color.BLACK);
        testViewPanel.setPreferredSize(new Dimension(1000, 420));
        addChildrenToTestViewPanel(testViewPanel);
        contentPane.add(testViewPanel);
    }

    private void addChildrenToTestViewPanel(JPanel testViewPanel){
        JPanel codePiecesPanel = new JPanel();
        codePiecesPanel.setName("Test View Code Pieces Panel");
        codePiecesPanel.setBackground(Color.darkGray);
        codePiecesPanel.setPreferredSize(new Dimension(500,400));
        testViewPanel.add(codePiecesPanel);

        JPanel codeEditorPanel = new JPanel();
        codeEditorPanel.setName("Test View Code Editor Panel");
        codeEditorPanel.setBackground(Color.DARK_GRAY);
        codeEditorPanel.setPreferredSize(new Dimension(500, 400));
        testViewPanel.add(codeEditorPanel);
    }

    private void addProdViewPanelToContentPane(Container contentPane){
        JPanel prodViewPanel = new JPanel();
        prodViewPanel.setName("Prod View Panel");
        prodViewPanel.setBackground(Color.BLACK);
        prodViewPanel.setPreferredSize(new Dimension(1000, 420));
        addChildrenToProdViewPanel(prodViewPanel);
        contentPane.add(prodViewPanel);
    }

    private void addChildrenToProdViewPanel(JPanel prodViewPanel) {
        JPanel codePiecesPanel = new JPanel();
        codePiecesPanel.setName("Prod View Code Pieces Panel");
        codePiecesPanel.setBackground(Color.darkGray);
        codePiecesPanel.setPreferredSize(new Dimension(500, 400));
        prodViewPanel.add(codePiecesPanel);


        JPanel codeEditorPanel = new JPanel();
        codeEditorPanel.setName("Prod View Code Editor Panel");
        codeEditorPanel.setBackground(Color.darkGray);
        codeEditorPanel.setPreferredSize(new Dimension(500, 400));
        prodViewPanel.add(codeEditorPanel);
    }
}
