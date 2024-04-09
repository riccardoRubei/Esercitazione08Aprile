package interfacce.liste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class myMain {

	public static void main(String[] args) {

		List<String> myList = new ArrayList();
		myList.add("Ciao");
		myList.add("mondo");
		myList.add("Array");
		
		for(int i=0; i<myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		for(String elem:myList) {
			System.out.println(elem);
		}
		
		List<String> myLinkedList = new LinkedList();
		myLinkedList.add("Ciao");
		myLinkedList.add("mondo");
		myLinkedList.add("Linked");
		
		for(int i=0; i<myLinkedList.size(); i++) {
			System.out.println(myLinkedList.get(i));
		}
		
		for(String elem:myLinkedList) {
			System.out.println(elem);
		}
	}

}
