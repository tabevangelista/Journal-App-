import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewEntry implements ActionListener {

    JFrame entryFrame;
    JPanel entryPanel;
    JTextArea entryText;
    JLabel entryLabel;
    JScrollPane entryScroll;
    JMenuBar menuBar; 
    JMenu file;
    JMenuItem newEntry, openEntry, saveEntry, saveAsEntry, exitEntry;
    public Object textArea;
    NewFileFunction fileFunction;
    
    public NewEntry() {

        EntryFrame();
        createMenuBar();
        createFileMenu();
        EntryPanel();
        entryText();
        
        fileFunction = new NewFileFunction(this);
        entryFrame.setVisible(true);
        entryPanel.setVisible(true);
    }

    public void EntryFrame() {
        // create entry frame
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

    public void createMenuBar() {
        // overall menu bar 
        menuBar = new JMenuBar();
        entryFrame.setJMenuBar(menuBar);

        file = new JMenu("File");
        menuBar.add(file);
    }

    public void createFileMenu() {
        // file menu 
        newEntry = new JMenuItem("New");
        file.add(newEntry);

        // make new a button 
        newEntry.addActionListener(this);
        newEntry.setActionCommand("New");

        openEntry = new JMenuItem("Open");
        file.add(openEntry);

        // make an open button
        openEntry.addActionListener(this);
        openEntry.setActionCommand("Open");

        saveEntry = new JMenuItem("Save");
        file.add(saveEntry);
        // make save a button

        saveAsEntry = new JMenuItem("Save As"); 
        file.add(saveAsEntry);
        // make saveAs a button

        exitEntry = new JMenuItem("Close"); 
        file.add(exitEntry);
        // make exit a button
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command) { 
            case "New": fileFunction.newFile(); 
            break;
            case "Open":fileFunction.openFile(); 
            break;
            
        }
        }
    }

