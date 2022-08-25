package com.xml.parse.jsoup;

import java.io.File;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Demo01 {
	public static void main(String[] args) throws Exception {
		//获取Document对象
		Document document = Jsoup.parse(new File(Demo01.class.getClassLoader().getResource("student.xml").getPath()), "utf-8");
		
		//获取标签对象
		//Element element = document.getElementById("9528");
		//System.out.println(element);
		//System.out.println(element.html());
		//System.out.println(element.text());
		
		/*Elements elements = document.getElementsByTag("name");
		for (Element element : elements) {
			System.out.println(element);
		}*/
		
		/*Elements elements = document.getElementsByAttribute("id");
		for (Element element : elements) {
			System.out.println(element);
		}*/
		
		/*Elements elements = document.getElementsByAttributeValue("id", "9528");
		for (Element element : elements) {
			System.out.println(element);
		}*/
		
		Elements elements = document.getElementsByClass("aaa");
		for (Element element : elements) {
			System.out.println(element);
			System.out.println(element.attr("class"));
		}
	}
}
