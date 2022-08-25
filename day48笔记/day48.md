### XML

~~~
xml的约束文档？
	xml约束的分类？
		dtd约束文档
		schema约束文档
		
	dtd约束文档的使用？
		1.创建一个xml文件，写文档声明
		2.在xml文件中引入约束文档
			引入方式一：
				<!DOCTYPE 根元素 [元素声明]>
				
				<?xml version="1.0"?>
                <!DOCTYPE note [
                  <!ELEMENT note (to,from,heading,body)>
                  <!ELEMENT to      (#PCDATA)>
                  <!ELEMENT from    (#PCDATA)>
                  <!ELEMENT heading (#PCDATA)>
                  <!ELEMENT body    (#PCDATA)>
                ]>
                <note>
                  <to>George</to>
                  <from>John</from>
                  <heading>Reminder</heading>
                  <body>Don't forget the meeting!</body>
                </note>
			
			引入方式二：
				<!DOCTYPE 根元素 SYSTEM "文件名">
				
				note.dtd：
				<!ELEMENT note (to,from,heading,body)>
                <!ELEMENT to (#PCDATA)>
                <!ELEMENT from (#PCDATA)>
                <!ELEMENT heading (#PCDATA)>
                <!ELEMENT body (#PCDATA)>
                
                note.xml：
                <?xml version="1.0"?>
                <!DOCTYPE note SYSTEM "note.dtd">
                <note>
                <to>George</to>
                <from>John</from>
                <heading>Reminder</heading>
                <body>Don't forget the meeting!</body>
                </note> 
                
			引入方式三：
				<!DOCTYPE 根元素 PUBLIC "约束文件名" "URL">
			
		3.通过约束文档写xml标签
		
	schema约束文档的使用？
		注意：schema约束文档本身也是一个xml文件
	
		1.创建一个xml文件，写文档声明
		2.在xml文件中引入约束文档
			原始的note.xml：
				<?xml version="1.0"?>
                <note>
                <to>George</to>
                <from>John</from>
                <heading>Reminder</heading>
                <body>Don't forget the meeting!</body>
                </note>
               
            note.xsd约束文档：
            	<?xml version="1.0"?>
                <xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
                targetNamespace="http://www.w3school.com.cn"
                xmlns="http://www.w3school.com.cn"
                elementFormDefault="qualified">
                    <xs:element name="note">
                        <xs:complexType>
                            <xs:sequence>
                                <xs:element name="to" type="xs:string"/>
                                <xs:element name="from" type="xs:string"/>
                                <xs:element name="heading" type="xs:string"/>
                                <xs:element name="body" type="xs:string"/>
                            </xs:sequence>
                        </xs:complexType>
                    </xs:element>
                </xs:schema>
                    
             关联之后的note.xml：
             	<?xml version="1.0"?>
                <note
                xmlns="http://www.w3school.com.cn"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xsi:schemaLocation="http://www.w3school.com.cn note.xsd">

                <to>George</to>
                <from>John</from>
                <heading>Reminder</heading>
                <body>Don't forget the meeting!</body>
                </note> 
                    
        	a.找到根标签
        	b.在根标签中写默认的名称空间：
        		xmlns="约束文档中的targetNamespace属性值"
    		c.在根标签中引入约束文档：
    			schemaLocation="约束文档中的targetNamespace属性值 约束文档的名字"
    		d.在根标签中写schemaLocation属性的名称空间：
    			xmlns:xis="约束文档中xmlns:xs名称空间的值 + -instance"
			e.在schemaLocation属性的前面加上名称空间引用：
            	xsi:schemaLocation=........
            	
		3.通过约束文档写xml标签
		
xml的解析？
	什么是xml解析？
		就是通过一些解析技术，将xml文件中的数据获取到，应用到程序中
		
	xml的解析思想？
		1.DOM(Document Object model)解析
			先将整个xml文档加载进内存，形成一个dom树，通过document对象可以操作dom树中的每个组件，通过增删改查来操作
			
			优点：因为将xml加载进了内存，形成了dom树，操作起来比较简单方便，而且功能强大一些，比较灵活
			缺点：如果dom数太大了会占内存
			
		2.SAX(Simple API for XML)解析
			逐行扫描，逐行操作
			
			优点：因为是逐行扫描，逐行获取数据，扫描完一行就扔一行，所以不占内存
			缺点：因为是扫描一行，扔一行，所以操作不可逆的，而且只能进行查询操作，不能进行增删改操作
	
	常见xml的解析器？
		JAXP：JavaEE技术之一，既有dom解析方式也有sax解析方式，但是代码复杂
		DM4J：开源组织提供的一套非常棒的xml解析工具，自带一套API
		Jousp：它主要是用来解析html，爬虫小程序中使用的解析器，由于html和xml是一样的都是标签组成的，所以也可以解析xml
		
	DOM4J解析xml？
		注意：想要使用dom4j，要先导入相关的jar
		
		常用API：
			SAXReader：
				public SAXReader()：创建解析器对象
				public Document read(InputStream is)：加载配置文件，获取document对象
				
			Document：
				public Element getRootElement()：获取根标签对象
				public List selectNodes(String xpath)：根据xpath表达式获取节点对象们
				public Node selectSingleNode(String xpath)：根据xpath表达式获取单个节点对象
				
			Element：
				public String getName()：获取标签名
				public List elements()：获取子标签对象们
				public String getText()：获取标签的文本内容
				public Element element(String name)：根据标签名获取标签对象
				public String attributeValue(String name)：根据属性名获取属性值
	
			Node：
				public String getName()：获取节点的名字
				public String getText()：获取节点的文本内容
				
	Jsoup解析xml？
		注意：想要使用jsoup，要先导入相关的jar
		
		常见API：
			Jsoup：
				public static Document parse(File file, String charset)：加载配置文件，获取document对象
			
			Document：
				public Element getElementById(String id)：根据id属性值获取标签对象
				public Elements getElementsByTag(String name)：根据标签名获取标签对象们
				public Elements getElementsByAttribute(String name)：根据属性名获取标签对象们
				public Elements getElementsByAttributeValue(String key, String value)：根据属性名和属性值获取标签对象们
				public Elements getElementsByClass(String name)：根据class属性获取标签对象们
			
			Element：
				public String html()：获取文本内容(包含html标签和纯文本)
				public String text()：获取文本内容(纯文本)
				public String attr(String name)：根据属性名获取属性值
				
		快速方式？
			方式一：选择器
				Document：
					public Elements select("选择器")：根据选择器获取标签对象们
				
			方式二：xpath
				JXDocument：
					public JXDocument(Document)：绑定document，获取jxdocument对象
					public List selN(String xpath)：根据xpath表达式获取节点对象们
					public JXNode selNOne(String xpath)：根据xpath表达式获取单一节点对象
					
				JXNode：
					public Element getElement()：将节点对象转换成标签对象
			
~~~

