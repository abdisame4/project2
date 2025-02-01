
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicCatalogueApp extends JFrame {

   
    public MusicCatalogueApp() {
        setTitle("My Music Catalogue");

        setSize(600, 400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("My Music Catalogue", SwingConstants.CENTER);
  	     titleLabel.setFont(new Font("Serif", Font.BOLD, 25)); 

        
        add(titleLabel, BorderLayout.NORTH); 
        
        JPanel southPanel = new JPanel();
        JButton submitButton = new JButton("Submit");
        JButton exitButton = new JButton("Exit");
        southPanel.add(submitButton); 
        southPanel.add(exitButton);   
        add(southPanel, BorderLayout.SOUTH); 

        
        JPanel westPanel = new JPanel();
        String[] categories = {"Rap", "Reggae", "Ballads"};
        JList<String> categoryList = new JList<>(categories); 
        westPanel.add(new JScrollPane(categoryList)); 
        add(westPanel, BorderLayout.WEST);

        
        JPanel centerPanel = new JPanel(new GridLayout(4, 2, 10, 10)); 
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); 

       
        centerPanel.add(new JLabel("Artist Name:"));
        JTextField artistNameField = new JTextField();
        centerPanel.add(artistNameField);

        centerPanel.add(new JLabel("Recording Studio:"));
        JTextField recordingStudioField = new JTextField();
        centerPanel.add(recordingStudioField);

        centerPanel.add(new JLabel("Category:"));
        JComboBox<String> categoryComboBox = new JComboBox<>(categories);
        centerPanel.add(categoryComboBox);

        centerPanel.add(new JLabel("Available:"));
        JCheckBox availableCheckBox = new JCheckBox();
        centerPanel.add(availableCheckBox);

        add(centerPanel, BorderLayout.CENTER); 

       
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                System.out.println("Artist Name: " + artistNameField.getText());
                System.out.println("Recording Studio: " + recordingStudioField.getText());
                System.out.println("Category: " + categoryComboBox.getSelectedItem());
                System.out.println("Available: " + availableCheckBox.isSelected());
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                System.exit(0);
            }
        });
    }

    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                MusicCatalogueApp app = new MusicCatalogueApp();
               
                app.setVisible(true);
            }
        });
    }
}