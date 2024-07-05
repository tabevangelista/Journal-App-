import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class NewEntry {

    JFrame entryFrame;
    JPanel entryPanel;
    JTextArea entryText;
    JLabel entryLabel;
    JScrollPane entryScroll;
    
    public NewEntry() {

        EntryFrame();
        EntryPanel();
        entryText();

        entryFrame.setVisible(true);
        entryPanel.setVisible(true);
    }

    public void EntryFrame() {
        
        entryFrame = new JFrame();
        entryFrame.setSize(400, 400);
        entryFrame.setTitle("Journal");
        entryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        entryFrame.setResizable(false);
        entryFrame.setTitle("New Entry");
    }

    public void EntryPanel() {

        entryPanel = new JPanel();
        entryPanel.setSize(400, 200);
        entryFrame.add(entryPanel);
        
        // new entry label 
        entryLabel = new JLabel("Write anything here");
        entryLabel.setBounds(10, 30, 30, 50);
        entryPanel.add(entryLabel);
    }

    public void entryText() {

        entryText = new JTextArea(15, 30);
        entryText.setBounds(40, 40, 5, 30);
        entryText.setWrapStyleWord(true);
        entryText.setLineWrap(true);

        // figure out how to change font size 
        
         entryScroll();
    }
        
    public void entryScroll() {

        entryScroll = new JScrollPane(entryText);
        entryScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        entryPanel.add(entryScroll);
    }
}

// possibly make a class for the save button 
// learn how to have it save into files (using youtube video)
