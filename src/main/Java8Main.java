package main;

import streamAPI.ProcessStream;
import viewMethod.ProcessViewMethod;

public class Java8Main {

	/**	Stream API ���W�b�N */
	private static ProcessStream processStream = ProcessStream.getInstance();
	
	/**	���\�b�h�Q��  ���W�b�N */
	private static ProcessViewMethod processViewMethod = ProcessViewMethod.getInstance();
	
	public static void main(String[] args) {
		processStream.fizzBuzz();
	}

}
