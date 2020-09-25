package com.revatue.generic.list;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App {
	public static void main(String[] args) {
		LinkedList<String> lst = new LinkedList<String>();
		lst.insert("Hello");
		lst.insert("There");
		lst.insert("Friend");
		
		for (int i = 0; i < lst.getSize(); i++) {
			System.out.println(lst.get(i));
		}
		
		Iterator itr = lst.getIterator();
		while (itr.hasNext()) {
			System.out.println(itr.getData);
			itr.next();
		}
	}
}
