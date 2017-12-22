package main;

import streamAPI.ProcessStream;
import viewMethod.ProcessViewMethod;

/**
 * Java8�ɂ����郁�C���N���X.
 * 
 * @author Noriyuki-Shimizu
 */
public class Java8Main {

	/**	Stream API ���W�b�N */
	private static ProcessStream processStream = ProcessStream.getInstance();
	
	/**	���\�b�h�Q��  ���W�b�N */
	private static ProcessViewMethod processViewMethod = ProcessViewMethod.getInstance();
	
	
	/**
	 * ���C���N���X.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		processStream.fizzBuzz();
		processViewMethod.process1();
	}

}
