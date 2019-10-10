/*********************
//Name: Jacob Rosengard
//Student ID: 1211604456
//Assignment #2
 
 // This file contains the code for the AddingMachine class
 // An AddingMachine object has two instance variables, total and history, and has a constructor, and a method to return the value of total, a method to add to total,
 // a method to subtract from total, a method to clear total and history and restore them to their initial values, and a toString method which returns a string that contains a history of the changes done to total
  */
/*********************
 */

/**
 Class which functions as an AddingMachine and can output the current value and can output the operations performed
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * Constructor of the AddingMachine class
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0"; // Initialize history with String value of total, "0"
	}
	
	/**
	 * Returns the total
	 * @return The value of the total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds value to the total and updates the actions performed in history
	 * @param value The number to add to the total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	 * Subtracts value from the total and updates the actions performed in history
	 * @param value The value to subtract from the total
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
		
	/**
	 * toString method which returns a history of the values added and subtracted from the total
	 * @return The String representation of the values added to and subtracted from the total
	 */
	public String toString () {
		return history;
	}

	/**
	 * Clears the values of total and history and resets them both to the initial values of 0 and "0" respectively
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
