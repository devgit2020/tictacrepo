package com.test.game.component;

/**
 * This is abastact class wich inhertis from JButton
 * 
 * This class add some user defined abstract method.
 * 
 * 
 */

import javax.swing.JButton;

public abstract class GameDart extends JButton {
	
	public abstract Object getCustomProperty(String propertyName);
	
	public abstract void setCustomProperty(String propertyName ,Object propertyValue);
	

}
