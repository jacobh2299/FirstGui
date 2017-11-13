package gui.view;
import gui.controller.*;
import javax.swing.*;
import java.awt.*;
public class GUIPanel extends JPanel
{
	
	private GuiAppController appController;
	private JButton firstButton;
	
	public GUIPanel(GuiAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
	}
	
}


