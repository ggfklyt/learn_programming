package com.nonsuch1.todo;

import com.nonsuch1.todo.utils.CommandLineInput;
import com.nonsuch1.todo.utils.CommandLineInputHandler;
import org.apache.commons.lang3.CharUtils;

public class ToDoApp {
	public static final char DEFAULT_INPUT = '\u0000';

	public static void main(String[] args) {
		CommandLineInputHandler commandLineInputHandler = new CommandLineInputHandler();
		char command = DEFAULT_INPUT;

		while (CommandLineInput.EXIT.getShortCmd() != command) {
			commandLineInputHandler.printOptions();
			String input = commandLineInputHandler.readInput();
			//char[] inputChars = input.length() == 1 ? input.toCharArray() : 
			//	new char[] { DEFAULT_INPUT };
			//command = inputChars[0];
			command = CharUtils.toChar(input, DEFAULT_INPUT);
			CommandLineInput commandLineInput =
				CommandLineInput.getCommandLineInputForInput(command);
			commandLineInputHandler.processInput(commandLineInput);
		}
	}
}
