package GameMechanicPrototype;

import com.sun.tools.javac.comp.Flow;

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
        testViewPanel.setLayout(new BoxLayout(testViewPanel, BoxLayout.X_AXIS));
        testViewPanel.setName("Test View Panel");
        testViewPanel.setBackground(Color.BLACK);
        testViewPanel.setPreferredSize(new Dimension(1000, 420));
        createAndAddCodePiecesAndCodeEditorPanels(testViewPanel);
        contentPane.add(testViewPanel);
    }

    private void addProdViewPanelToContentPane(Container contentPane){
        JPanel prodViewPanel = new JPanel();
        prodViewPanel.setLayout(new BoxLayout(prodViewPanel, BoxLayout.X_AXIS));
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
        Dimension preferredSize = new Dimension(500, 950);
        codePiecesPanel.setPreferredSize(preferredSize);
        JScrollPane scrollPane = createScrollPane(codePiecesPanel);
        panelToAddChildrenTo.add(scrollPane);

        JPanel codeEditorPanel = new JPanel();
        codeEditorPanel.setName(panelToAddChildrenTo.getName() + " Code Editor Panel");
        codeEditorPanel.setBackground(Color.DARK_GRAY);
        codeEditorPanel.setPreferredSize(preferredSize);
        panelToAddChildrenTo.add(codeEditorPanel);
    }

    private JScrollPane createScrollPane(JPanel panelToHoldPieces){
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setLayout(new ScrollPaneLayout());
        scrollPane.setPreferredSize(new Dimension(500, 400));
        JViewport viewport = scrollPane.getViewport();
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        panelToHoldPieces.add(makeLabelPanel());
        viewport.add(panelToHoldPieces);
        return scrollPane;
    }

    private JPanel makeLabelPanel() {
        Dimension preferredSize = new Dimension(480, 100);
        JPanel panel = new JPanel();
        panel.setPreferredSize(preferredSize);
        JLabel label = new JLabel();
        label.setPreferredSize(preferredSize);
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
//        label.setBorder(BorderFactory.createLineBorder(color));
        label.setText("  I AM A LABEL.");
        panel.add(label);
        return panel;
    }
}
