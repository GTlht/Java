package com.xml.parse.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//解析器对象
		SAXReader reader = new SAXReader();
		
		//加载xml配置文件，获取document对象
		Document document = reader.read(Demo02.class.getClassLoader().getResourceAsStream("student.xml"));
		
		//根据xpath表达式来获取标签对象
		/*List<Node> nodes = document.selectNodes("/students");
		for (Node node : nodes) {
			//System.out.println(node);
			System.out.println(node.getName());
		}*/
		
		/*List<Node> nodes = document.selectNodes("//student");
		for (Node node : nodes) {
			System.out.println(node.getName());
		}*/
		
		/*List<Node> nodes = document.selectNodes("//name");
		for (Node node : nodes) {
			System.out.println(node.getName());
			System.out.println(node.getText());
		}*/
		
		/*List<Node> nodes = document.selectNodes("//age");
		for (Node node : nodes) {
			System.out.println(node.getName());
			System.out.println(node.getText());
		}*/
		
		/*Node node = document.selectSingleNode("/students");
		System.out.println(node.getName());*/
		
		/*Node node = document.selectSingleNode("//student");
		System.out.println(node);*/
		
		/*Node node = document.selectSingleNode("//student[2]");
		System.out.println(node);*/
		
		/*Node node = document.selectSingleNode("//name");
		System.out.println(node.getText());*/
		
		Node node = document.selectSingleNode("(//name)[1]");
		System.out.println(node.getText());
	}
}
