package com.test.game.component;

/**
 * This is abstract class which inherit from JButton
 * 
 * This class add some user defined abstract method.
 * 
 * And we can add more custom property later on 
 * 
 * 
 */

import javax.swing.JButton;

public abstract class GameDart extends JButton {
	
	public abstract Object getCustomProperty(String propertyName);
	
	public abstract void setCustomProperty(String propertyName ,Object propertyValue);
	

}
