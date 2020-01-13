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
        createAndAddCodePiecesAndCodeEditorPanels(testViewPanel);
        contentPane.add(testViewPanel);
    }

    private void addProdViewPanelToContentPane(Container contentPane){
        JPanel prodViewPanel = new JPanel();
        prodViewPanel.setName("Prod View Panel");
        prodViewPanel.setBackground(Color.BLACK);
        prodViewPanel.setPreferredSize(new Dimension(1000, 420));
        createAndAddCodePiecesAndCodeEditorPanels(prodViewPanel);
        contentPane.add(prodViewPanel);
    }

    private void createAndAddCodePiecesAndCodeEditorPanels(JPanel panelToAddChildrenTo) {
        JPanel codePiecesPanel = new JPanel();
        codePiecesPanel.setName(panelToAddChildrenTo.getName() + " Code Pieces Panel");
        codePiecesPanel.setBackground(Color.DARK_GRAY);
        Dimension preferredSize = new Dimension(500, 400);
        codePiecesPanel.setPreferredSize(preferredSize);
        panelToAddChildrenTo.add(codePiecesPanel);

        JPanel codeEditorPanel = new JPanel();
        codeEditorPanel.setName(panelToAddChildrenTo.getName() + " Code Editor Panel");
        codeEditorPanel.setBackground(Color.DARK_GRAY);
        codeEditorPanel.setPreferredSize(preferredSize);
        panelToAddChildrenTo.add(codeEditorPanel);
    }
}
