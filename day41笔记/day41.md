### BOM(浏览器对象模型)

~~~
什么是BOM(浏览器对象模型)?
	浏览器对象模型（Broswer Object Model）
	在面向对象思想中，万物皆对象，所以把浏览器中的各个组成部分给单独拆开，都封装成了各自的对象，统称为浏览器对象模型
	
	有哪几部分组成呢？
		Navigator对象：浏览器对象
		*Window对象：浏览器窗口对象
		*Location对象：地址栏对象
		*History对象：历史栏对象
		Document对象：文档对象
		Screen对象：浏览器参数对象
		
Window对象？
	注意：window对象中的方法不用写对象名调用，可以直接调用(省略对象名)
	
	常见的方法？
		1.和弹出框相关的方法
			alert()：显示带有一段消息和一个确认按钮的警告框
			confirm()：显示带有一段消息以及确认按钮和取消按钮的对话框
			prompt()：显示可提示用户输入的对话框
			
		2.开关窗口和关闭窗口相关的方法
			open()：打开一个新的浏览器窗口或查找一个已命名的窗口
			close()：关闭浏览器窗口
		
		3.计时器相关的方法
			setInterval()：按照指定的周期（以毫秒计）来调用函数或计算表达式
			clearInterval()：取消由 setInterval() 设置的 timeout
			
			setTimeout()：在指定的毫秒数后调用函数或计算表达式
			clearTimeout()：取消由 setTimeout() 方法设置的 timeout
			
	常见的属性？
		location：用于窗口或框架的 Location 对象
		history：对 History 对象的只读引用
		document：对 Document 对象的只读引用
		
Location对象？
	常见的方法？
		reload()：重新加载当前文档
	
	常见的属性？
		href：设置或返回完整的 UR
		search：设置或返回从问号 (?) 开始的 URL（查询部分）
		
History对象？
	常见的方法？
		back()：加载 history 列表中的前一个 URL
        forward()：加载 history 列表中的下一个 URL
        go()：加载 history 列表中的某个具体页面
        
	常见的属性？
		length：返回浏览器历史列表中的 URL 数量
~~~

### DOM(文档对象模型)

~~~
什么是DOM(文档对象模型)？
	文档对象模型（Document Object Model）
	在面向对象思想中，万物皆对象，所以把文档中的各个组成部分给单独拆开，都封装成了各自的对象，统称为文档对象模型
	
	有哪几部分组成呢？
		*Document对象
		*Element对象
		Attribute对象
		Text对象
		Comment对象
		*Node对象
		
DOM数的分类？
	HTML DOM
	XML DOM

Document对象？
	1.获取标签对象相关方法
		getElementById()：根据id获取标签对象
		getElementsByName()：根据name属性获取标签对象们
		getElementsByTagName()：根据标签名获取标签对象们
		getElementsByClassName()：根据class属性获取标签对象们
	
	2.创建相关方法
		createElement()：创建元素节点
		createTextNode()：创建文本节点
		
		注意：创建出来的标签和文本都是游离状态的

Element对象？
	getAttribute()：返回属性的值
	removeAttribute()：删除指定的属性
	setAttribute()：添加新属性
	
Node对象？
	appendChild()：向节点的子节点列表的结尾添加新的子节点
	removeChild()：删除（并返回）当前节点的指定子节点
	
	parentNode	返回节点的父节点
~~~

### js对样式的操作

~~~
方式一：
	<html>
        <head>
            <meta charset="utf-8">
            <title>js的样式操作</title>
            <script>
                function aaa() {
                    var div = document.getElementById("div");
                    div.style = "border:1px solid red;font-size:200px;color:yellowgreen";
                }
            </script>
        </head>
        <body>
            <div id="div">约吗</div>
            <input type="button" value="添加样式" onclick="aaa()">
        </body>
    </html>
    
    -----------------------------------------------------------------------------------
    
    <html>
        <head>
            <meta charset="utf-8">
            <title></title>
            <title>js的样式操作</title>
            <script>
                function aaa() {
                    var div = document.getElementById("div");

                    div.style.border = "1px solid red";
                    div.style.fontSize = "200px";
                    div.style.color = "yellowgreen";

                }
            </script>
        </head>
        <body>
            <div id="div">约吗</div>
            <input type="button" value="添加样式" onclick="aaa()">
        </body>
    </html>

方式二：
	<html>
        <head>
            <meta charset="utf-8">
            <title>js的样式操作</title>
            <style>
                .aaa {
                    border: 1px solid red;
                    font-size: 200px;
                    color: yellowgreen;
                }
            </style>
            <script>
                function aaa() {
                    var div = document.getElementsByTagName("div")[0];
                    div.setAttribute("class", "aaa");
                }
            </script>
        </head>
        <body>
            <div>约吗</div>
            <input type="button" value="添加样式" onclick="aaa()">
        </body>
    </html>

方式三：
	<html>
        <head>
            <meta charset="utf-8">
            <title>js的样式操作</title>
            <style>
                .aaa {
                    border: 1px solid red;
                    font-size: 200px;
                    color: yellowgreen;
                }
            </style>
            <script>
                function aaa() {
                    var div = document.getElementsByTagName("div")[0];
                    div.className = "aaa";
                }
            </script>
        </head>
        <body>
            <div>约吗</div>
            <input type="button" value="添加样式" onclick="aaa()">
        </body>
    </html>

~~~

