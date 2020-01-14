package com.test.game.component;

/**
 * This is implementation of abstract user defined JButton class
 * 
 * This class implements the abstract method to set the button property
 * 
 * 
 */

public class GameDartImpl extends GameDart {

	public GameDartImpl() {

		super();

	}

	/**
	 * This constructor set button label
	 * 
	 * @param label - It takes as button name as input parameter
	 *            
	 */


	public GameDartImpl(String label) {
		super.setText(label);
	}

	/**
	 * This method stores the user defined property in button class
	 * 
	 * @param propertyName - set customer property name
	 * 
	 * @param propertyValue - set as custom property value in button object
	 */

	@Override
	public void setCustomProperty(String propertyName, Object propertyValue) {

		this.putClientProperty(propertyName, propertyValue);

	}

	/**
	 * This method return the user defined property set in the button class
	 * 
	 * @param propertyName- Takes as custom property name to get the custom property value
	 */

	@Override
	public Object getCustomProperty(String propertyName) {

		return this.getClientProperty(propertyName);
	}

}
