package com;

public class RoundQu {
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.show();
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println(q.getQu());
		System.out.println(q.getQu());
		System.out.println(q.getQu());
		System.out.println(q.getQu());
	}

}
class Queue{
	private int maxSize;
	private int front;
	private int rear;
	private int[] arr;
	
	
	public Queue(int maxsize) {
		maxSize=maxsize;
		arr=new int[maxSize];
		front=0;
		rear=0;
	}
	public boolean isFull() {
		return (rear+1)%maxSize==front;
	}
	public boolean isEmpty() {
		return front==rear;
	}
	public void add(int n ) {
		if(isFull()) {
			System.out.println("¬˙¡À");
			return;
		}
		arr[rear]=n;
		rear++;
	}
	public int getQu() {
		if(isEmpty()) {
			System.out.println("ø’¡À");
			return -1;
		}
		int temp=arr[front];
		front++;
		return temp;
	}
	public void show() {
		if(isEmpty()) {
			System.out.println("ø’¡À");
			return;
		}
		int i=front;
		int j=rear;
		while(i!=j){
			System.out.println(arr[i%maxSize]+" ");
			i++;
		}
	}
}