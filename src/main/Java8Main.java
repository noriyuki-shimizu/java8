package main;

import streamAPI.ProcessStream;
import viewMethod.ProcessViewMethod;

/**
 * Java8におけるメインクラス.
 * 
 * @author Noriyuki-Shimizu
 */
public class Java8Main {

	/**	Stream API ロジック */
	private static ProcessStream processStream = ProcessStream.getInstance();
	
	/**	メソッド参照  ロジック */
	private static ProcessViewMethod processViewMethod = ProcessViewMethod.getInstance();
	
	
	/**
	 * メインクラス.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		processStream.fizzBuzz();
		processViewMethod.process1();
	}

}
