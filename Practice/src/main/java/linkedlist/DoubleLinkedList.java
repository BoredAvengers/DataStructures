package linkedlist;

public class DoubleLinkedList {
	
	
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
