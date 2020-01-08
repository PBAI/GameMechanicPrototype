package GameMechanicPrototype;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JFrame {

    public static void main(String[] args){
        GameScreen screen = new GameScreen();
        screen.setVisible(true);
    }

    public GameScreen() {
        this.setSize(new Dimension(1000, 800));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setName("Main Game Screen");
        this.setTitle("LEARN TDD");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setName("Main Screen Content Pane");
        addCodePiecesPanelToContentPane(contentPane);
        addCodeEditorPanelToContentPane(contentPane);
    }

    private void addCodePiecesPanelToContentPane(Container contentPane){
        JPanel codePiecesPanel = new JPanel();
        codePiecesPanel.setName("Code Pieces Panel");
        addCodePiecesTextLabelToCodePiecesPanel(codePiecesPanel);
        contentPane.add(codePiecesPanel);
    }

    private void addCodePiecesTextLabelToCodePiecesPanel(JPanel codePiecesPanel){
        JLabel codePiecesLabel = new JLabel();
        codePiecesLabel.setText("CODE PIECES");
        codePiecesPanel.add(codePiecesLabel);
    }

    private void addCodeEditorPanelToContentPane(Container contentPane){
        JPanel codeEditorPanel = new JPanel();
        codeEditorPanel.setName("Code Editor Panel");
        addCodeEditorTextLabelToCodeEditorPanel(codeEditorPanel);
        contentPane.add(codeEditorPanel);
    }

    private void addCodeEditorTextLabelToCodeEditorPanel(JPanel codeEditorPanel){
        JLabel codeEditorLabel = new JLabel();
        codeEditorLabel.setText("CODE EDITOR");
        codeEditorPanel.add(codeEditorLabel);
    }
}
