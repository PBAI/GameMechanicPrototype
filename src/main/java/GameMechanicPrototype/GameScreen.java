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
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.setName("Main Screen Content Pane");
        addTestViewPanelToContentPane(contentPane);
        addProdViewPanelToContentPane(contentPane);
    }

    private void addTestViewPanelToContentPane(Container contentPane){
        JPanel testViewPanel = new JPanel();
        testViewPanel.setName("Test View Panel");
        contentPane.add(testViewPanel);
    }

    private void addProdViewPanelToContentPane(Container contentPane){
        JPanel prodViewPanel = new JPanel();
        prodViewPanel.setName("Prod View Panel");
        contentPane.add(prodViewPanel);
    }

}
