package linkedlist;

import java.util.LinkedList;
import java.util.List;

/**
 *  Test class to check Doubly Linked List
 * @author roopesh and aerk
 * 
 */

public class DoubleLinkedList extends LinkedList{
	
	
	private class Node{
		
		private String data = null;
		public Node(String data) {
			this.setData(data);
		}


		public String getData() {
			return data;
		}


		public void setData(String data) {
			this.data = data;
		}
		
		
		
	}
	
	 
	 Node head = null;
	 Node tail = null;
	
	 public void add(String data) {
		 
		 //New Node 
		 Node newNode = new Node (data);
		 
		 if(head == null) {
			 head = newNode;
			 tail = newNode;
		 }else {
			 tail = newNode; 
		 }
		 
	 }
	 
	 
	 
	 
	 public void remove(String data) {
		 
		 
	 }
	 
	 public void search(String data) {
		 
	 }
	


}
