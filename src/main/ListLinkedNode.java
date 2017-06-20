package main;

public class ListLinkedNode<T> {
	private T data;
	private ListLinkedNode<T> next;
	
	public ListLinkedNode(){
		this.data = null;
		this.next = null;
	}
	
	public ListLinkedNode(T data, ListLinkedNode<T> next){
		this.setData(data);
		this.setNext(next);
	}
	
	public T getData() {
		return data;
	}
	
	public ListLinkedNode<T> getNext() {
		return next;
	}
	
	public void setNext(ListLinkedNode<T> next) {
		this.next = next;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
