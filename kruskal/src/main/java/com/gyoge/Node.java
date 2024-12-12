package com.gyoge;

public class Node {
	
	private final int data;
	private Node head;
	
	public Node(int d)
	{
		data = d;
		head = this;
	}
	

   @SuppressWarnings("unused")
   public boolean connected(Node node)
   {
       return this.head == node.head;
   }
   
	
   public Node getHead()
   {
      return head;
   }
   
   public void setHead(Node p)
   {
      this.head = p.getHead();
   }
   
	public int getData()
	{
		return data;
	}
}
