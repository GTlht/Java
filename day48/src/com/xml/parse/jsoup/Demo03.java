package com.xml.parse.jsoup;

import java.io.File;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;

public class Demo03 {
	public static void main(String[] args) throws Exception {
		//获取document对象
		Document document = Jsoup.parse(new File(Demo02.class.getClassLoader().getResource("student.xml").getPath()), "utf-8");
		
		//获取JXDocument对象
		JXDocument jxDocument = new JXDocument(document);
		
		//通过xpath表达式获取标签对象们
		/*List<JXNode> jxNodes = jxDocument.selN("//age");
		for (JXNode jxNode : jxNodes) {
			System.out.println(jxNode);
			System.out.println(jxNode.getElement().text());
		}*/
		
		//通过xpath表达式获取单一的标签对象
		JXNode jxNode = jxDocument.selNOne("//age");
		System.out.println(jxNode);
		System.out.println(jxNode.getElement().text());
	}
}
