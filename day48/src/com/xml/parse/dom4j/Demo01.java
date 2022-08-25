package com.xml.parse.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//创建解析器对象
		SAXReader reader = new SAXReader();
		
		//加载xml配置文件，获取document对象
		Document document = reader.read(Demo01.class.getClassLoader().getResourceAsStream("student.xml"));
		
		//获取根标签对象
		Element root = document.getRootElement();
		
		/*System.out.println(root);
		System.out.println(root.getName());*/
		
		//获取根标签的子标签对象们
		/*List<Element> elements = root.elements();
		for (Element element : elements) {
			System.out.println(element);
			System.out.println(element.getName());
			List<Element> elements2 = element.elements();
			for (Element element2 : elements2) {
				System.out.println(element2.getName());
				System.out.println(element2.getText());
			}
		}*/
		
		//获取标签对象
		Element element = root.element("student");
		System.out.println(element.getName());
		System.out.println(element.attributeValue("id"));
	}
}
