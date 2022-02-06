import javax.swing.JFrame;

/**
 * A class that tests SettingsPage.
 * @author Onurcan Ataç
 * @version 1.00, 30.04.2021
*/
public class SettingsPageTest
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame();
		User user = new User("user01@ug.bilkent.edu.tr", "user01", 2, "user01", 6);
		SettingsPage settingsPanel = new SettingsPage(user);
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("Post Item Page");
		frame.setBackground(new java.awt.Color(255, 255, 255)); 
		frame.getContentPane().add(settingsPanel);
    }
    
}