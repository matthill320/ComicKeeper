import java.awt.*;
import javax.swing.*;


public class MainView {

	protected JFrame mFrame;
	
	public MainView() 
	{
		mFrame = new JFrame("ComicKeeperFrame");
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setOpaque(true);
		menuBar.setBackground(new Color(154, 165, 127));
		menuBar.setPreferredSize(new Dimension(200, 20));
		
		JLabel label = new JLabel();
		label.setOpaque(true);
		label.setBackground(new Color(39, 44, 200));
		label.setPreferredSize(new Dimension(200, 150));
		
		mFrame.setJMenuBar(menuBar);
		mFrame.getContentPane().add(label);
		
		mFrame.pack();
		mFrame.setVisible(true);
		
		
	}

}
