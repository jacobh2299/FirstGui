package gui.view;

import java.util.*;
import gui.controller.GuiAppController;
import javax.swing.JFrame;
//extends is the key word that inherits things
public class GUIFrame extends JFrame
{
	private GuiAppController appController;
	
	public GUIFrame(GuiAppController appController)
	{
		//call parent class constructor. Class it extends from. Can only go up one level. Can only call super once.
		//has to be on the first line.
		super();
		this.appController=appController;
		
		//helper Method call
		setupFrame();
	}
	
	//helper Method creation
	private void setupFrame() 
	{
		this.setTitle("First Gui");
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	
	
	
	
}
