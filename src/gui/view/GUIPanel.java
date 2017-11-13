package gui.view;
import gui.controller.*;
import javax.swing.*;
import java.awt.*;
public class GUIPanel extends JPanel
{
	
	private GuiAppController appController;
	private JButton firstButton;
	private SpringLayout baseLayout;
	
	public GUIPanel(GuiAppController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Wow a button");
		baseLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


