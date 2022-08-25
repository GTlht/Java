package com.xml.parse.jsoup;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Demo02 {
	public static void main(String[] args) throws Exception {
		//获取Document对象
		Document document = Jsoup.parse(new File(Demo02.class.getClassLoader().getResource("student.xml").getPath()), "utf-8");
		
		//根据选择器来获取标签对象
		/*Elements elements = document.select("#9527");
		for (Element element : elements) {
			System.out.println(element);
		}*/
		
		/*Elements elements = document.select("name");
		for (Element element : elements) {
			System.out.println(element);
		}*/
		
		Elements elements = document.select(".aaa");
		for (Element element : elements) {
			System.out.println(element);
		}
	}
}
