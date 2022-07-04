package com;

public class LinkList {
	public static void main(String[] args) {
		SingleLinkedList sl=new SingleLinkedList();
		 HeroNode h1=new HeroNode(1,"宋江","及时雨");
		 HeroNode h2=new HeroNode(2,"宋江","及时雨");
		 HeroNode h3=new HeroNode(3,"宋江","及时雨");
		 HeroNode h4=new HeroNode(4,"宋江","及时雨");
		 sl.addByOrder(h1);
		 sl.addByOrder(h3);
		 sl.addByOrder(h4);
		 sl.addByOrder(h2);
		 sl.show();
		 System.out.println("++++++++++++++++++++++++++");
		 sl.update(new HeroNode(8,"xiao江","及时雨2"));
		 sl.show();
		 System.out.println("+++++++++++++++++删除++++++++++++++++");
		 sl.delete(6);
		 sl.show();
		 System.out.println("++++++++++++++获取链表长度+++++++++++++");
		 System.out.println(getLength(sl.getHead()));
		 System.out.println("++++++++++++++获取倒数第一个节点++++++++++++++++");
		 System.out.println(findLastIndex(sl.getHead(), 2));
	}
	public static int getLength(HeroNode head) {
		if(head.next==null) {
			return 0;
		}
		int length=0;
		HeroNode temp=head.next;
		while(true) {
			if(temp!=null) {
				length++;
				temp=temp.next;
			}else {
				return length;
			}
		}
	}
	public static HeroNode findLastIndex(HeroNode head,int index) {
		if(head.next==null) {
			return null;
		}
		HeroNode temp=head.next;
		for(int i=0;i<getLength(head)-index;i++) {
			temp=temp.next;
		}
		return temp;
	}
}
class HeroNode{
	int no;
	String name;
	String nickName;
	HeroNode next;
	
	public HeroNode(int no, String name, String nickName) {
		this.no = no;
		this.name = name;
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "HeroNode [no=" + no + ", name=" + name + ", nickName=" + nickName + "]";
	}
	
	
}

class SingleLinkedList{
	private HeroNode head=new HeroNode(0,"","");
	
	public HeroNode getHead() {
		return head;
	}
	public void setHead(HeroNode head) {
		this.head = head;
	}
	public void add(HeroNode heronade) {
		HeroNode temp=head;
		while(true) {
			if(temp.next==null) {
				break;
			}
			temp=temp.next;
		}
		temp.next=heronade;
	}
	public void show() {
		HeroNode temp=head;
		if(head.next==null) {
			System.out.println("链表空");
			return;
		}
		while(true) {
			if(temp.next!=null){
				temp=temp.next;
				System.out.println(temp);
			}else {
				break;
				
			}
		}
		
	}
	public void addByOrder(HeroNode heroNode) {
		HeroNode temp=head;
		boolean flag=false;
		while(true) {
			if(temp.next==null) {
				break;
			}else if(temp.next.no>heroNode.no) {
				break;
			}else if(temp.next.no==heroNode.no) {
				flag=true;
				break;
			}else {
				temp=temp.next;
			}
		}
		if(flag) {
			System.out.println("已存在");
		}else {
			heroNode.next=temp.next;
			temp.next=heroNode;
		}
	}
	public void update(HeroNode heroNode) {
		HeroNode temp=head;
		boolean flag=false;
		if(temp.next==null) {
			return;
		}
		while(true) {
			if(temp.next==null) {
				break;
			}else if(temp.next.no==heroNode.no) {
				flag=true;
				break;
			}else {
				temp=temp.next;
			}
		}
		if(flag) {
			temp.next.name=heroNode.name;
			temp.next.nickName=heroNode.nickName;
		}else {
			System.out.println("不存在");
		}
	}
	public void delete(int n) {
		boolean flag=false;
		HeroNode temp=head;
		while(true) {
			if(temp.next==null) {
				break;
			}else if(temp.next.no==n){
				flag=true;
				break;
			}else {
				temp=temp.next;
			}
		}
		if(flag) {
			temp.next=temp.next.next;
		}else {
			System.out.println("删除不存在");
		}
	}

}