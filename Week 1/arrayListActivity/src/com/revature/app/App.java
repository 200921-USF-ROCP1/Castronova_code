package com.revature.app;

import com.revature.generic.arraylist.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<String> arlist = new ArrayList<String>();
		arlist.add("This");
		arlist.add("is");
		arlist.add("Spartaaaa");
		
		for (int i = 0; i < arlist.count(); i++) {
			System.out.println(arlist.get(i));
		}
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(5);
		intList.add(6);
		intList.add(5);
		intList.add(7);
		
		Object[][] split = intList.split(3);
		
		//print2dArray(split);
	}
	
	public static void print2dArray(Object[][] twoDArray) {
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j]);
				
				if (j+1 < twoDArray[i].length) {
					System.out.print(", ");
				}
				
				System.out.print("\n");
			}
		}
	}
	
	public static String getTwoDArrayString(Object[][] twoDArray) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				sb.append(twoDArray[i][j]);
				
				if (j + 1 < twoDArray[i].length) {
					sb.append(", ");
				}
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
