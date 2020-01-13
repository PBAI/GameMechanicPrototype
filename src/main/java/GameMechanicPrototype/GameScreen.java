package GameMechanicPrototype;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JFrame {

    public static void main(String[] args){
        GameScreen gameScreen = new GameScreen();
        gameScreen.setVisible(true);
    }

    public GameScreen() {
        this.setSize(new Dimension(1000, 800));
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
        testViewPanel.setPreferredSize(new Dimension(500, 400));
        testViewPanel.setBorder(BorderFactory.createDashedBorder(Color.CYAN));
        addChildrenToTestViewPanel(testViewPanel);
        contentPane.add(testViewPanel);
    }

    private void addProdViewPanelToContentPane(Container contentPane){
        JPanel prodViewPanel = new JPanel();
        prodViewPanel.setName("Prod View Panel");
        prodViewPanel.setPreferredSize(new Dimension(500, 400));
        prodViewPanel.setBorder(BorderFactory.createDashedBorder(Color.RED));
        addChildrenToProdViewPanel(prodViewPanel);
        contentPane.add(prodViewPanel);
    }

    private void addChildrenToTestViewPanel(JPanel testViewPanel){
        JPanel codePieces = new JPanel();
        codePieces.setName("Test View Code Pieces Panel");
        testViewPanel.add(codePieces);

        JPanel codeEditor = new JPanel();
        codeEditor.setName("Test View Code Editor Panel");
        testViewPanel.add(codeEditor);
    }

    private void addChildrenToProdViewPanel(JPanel prodViewPanel) {
        JPanel codePieces = new JPanel();
        codePieces.setName("Prod View Code Pieces Panel");
        prodViewPanel.add(codePieces);

        JPanel codeEditor = new JPanel();
        codeEditor.setName("Prod View Code Editor Panel");
        prodViewPanel.add(codeEditor);
    }
}
