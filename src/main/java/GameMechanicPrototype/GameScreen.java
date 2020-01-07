package GameMechanicPrototype;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JFrame {

    public static void main(String[] args){
        GameScreen screen = new GameScreen(new Dimension(1500, 1000));
        screen.setVisible(true);
    }

    public GameScreen(Dimension dimension) {
        this.setSize(dimension);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setName("Main Game Screen");
        this.setTitle("Learn TDD");
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.setName("Main Screen Content Pane");

        JPanel codePiecesPanel = new JPanel();
        codePiecesPanel.setName("Code Pieces");
        contentPane.add(codePiecesPanel);

        JLabel codePiecesLabel = new JLabel();
        codePiecesLabel.setText("CODE PIECES");
        codePiecesPanel.add(codePiecesLabel);

        JPanel codeEditorPanel = new JPanel();
        codeEditorPanel.setName("Code Pieces");
        contentPane.add(codeEditorPanel);

        JLabel codeEditorLabel = new JLabel();
        codeEditorLabel.setText("CODE EDITOR");
        codeEditorPanel.add(codeEditorLabel);
    }



}
