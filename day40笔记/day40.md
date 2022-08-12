### JavaScript

~~~
ECMAScript(js的基础语法)？
	数据类型，常量，变量，运算符，流程控制语句，数组，方法，对象...
	
	1.注释
	2.常量
	3.数据类型
	4.变量
 	5.运算符
 	6.流程控制语句
 	8.方法(函数)
 	9.数组
 		Java中数组：
 			定义格式：
 				int[] arr = new int[5];
 				int[] arr = new int[]{1,2,3,4};
 				int[] arr = {1,2,3,4};
 				
 		Js中数组：
 			js中的数组更像java中的集合
 		
 			定义格式：
                格式一：
                    var arr = [1,2,3,4];

                    1,2,3,4都是数组中的元素

                格式二：
                    var arr = new Array(1,2,3,4);

                    1,2,3,4都是数组中的元素

                格式三：
                    var arr = new Array(3);

                    3是数组的长度
 				
 			数组的遍历？
 				方式一：普通for
 					var arr = [11,12,13,14,15];
			
                    for(var i = 0; i < arr.length; i++) {
                        document.write(arr[i] + "<br>");
                    }
 					
 				方式二：for...in
 					var arr = [11,12,13,14,15];

                    for(var i in arr) {
                        document.write(arr[i] + "<br>");
                    }
 		
 			数组中属性和方法？
 				属性：
 					length：数组的长度
 					
 				方法：
 					join()：将数组的所有元素连接成一个字符串
 					pop()：删除数组的最后一个元素，并返回该元素
 					push()：将新元素添加到数组的末尾，并返回新的长度
 	
    10.对象
    	a.Array
    	b.Date
    		方法：
    			getTime()：返回自 1970 年 1 月 1 日午夜以来与指定日期的毫秒数
    			toLocaleDateString()：使用区域设置约定将 Date 对象的日期部分作为字符串返回
    			toLocaleTimeString()：使用区域设置约定将 Date 对象的时间部分作为字符串返回
    			toLocaleString()：使用区域设置约定将 Date 对象转换为字符串
    	c.String
    		方法：
    			charAt()：返回在指定位置的字符
    			concat()：连接字符串
    			indexOf()：检索字符串
    	d.Math
    		方法：
    			abs(x)：返回 x 的绝对值
    			ceil(x)：返回 x，向上舍入为最接近的整数
    			floor(x)：返回 x，向下舍入为最接近的整数
				random()：返回 0 到 1 之间的随机数
					练习：获取1-100之间的随机整数
						Math.floor((Math.random() * 100) + 1)
						
						Math.random() -> [0, 1)
						Math.random() * 100 -> [0, 100)
						Math.random() * 100) + 1 -> [1, 101)
						Math.floor((Math.random() * 100) + 1) -> [1, 100]
						
		e.RegExp
			什么是正则表达式？
				正则表达式就是一个字符串，只不过里面的内容不能瞎写，要按照指定的规则去写
			
			正则表达式的作用？
				对表单进行校验
				
			常见的正则表达式规则？
				\\：代表一个反斜线
				[abc]： a、b 或 c中的任意一个
				[a-zA-Z]：a 到 z 或 A 到 Z中的任意一个
				.：任何一个字符
				\d：数字：[0-9]
				[0-9]：0-9之中的任意一个
				\w：单词字符：[a-zA-Z_0-9] 
				[a-zA-Z_0-9]：a-z或A-Z或者0-9或_之中的任意一个
				^：行的开头 
				$：行的结尾 
				X?：X，一次或一次也没有 
                X*：X，零次或多次 
                X+：X，一次或多次 
                X{n}：X，恰好 n 次 
                X{n,}：X，至少 n 次 
                X{n,m}：X，至少 n 次，但是不超过 m 次 
               
            正则表达式对象的创建？
				方式一：var reg = new RegExp("正则表达式");
				
				方式二：var reg = /正则表达式/;
				
			怎么进行正则校验？
				test(被校验的字符串)
				
			练习题？
				对手机号进行校验？
					方式一：
						var reg = new RegExp("^1[3-9]\\d{9}$");
						var flag = reg.test("15658585858");
						alert(flag);
						
					方式二：
						var reg = /^1[3-9]\d{9}$/;
                        var flag = reg.test("11658585858");
                        alert(flag);
 
		f.Global
			注意：Global对象中的方法是不需要对象调用的，可以直接使用这里面的方法
	
			encodeURI()：对 URI 进行编码
			decodeURI()：解码 URI
			encodeURIComponent()：对 URI 组件进行编码
            decodeURIComponent()：解码 URI 组件
            eval()：评估字符串并像脚本代码一样执行它
            isNaN()：确定值是否是非法数字
            parseInt()：解析字符串并返回整数
~~~

### DOM(文档对象模型)

~~~
获取标签对象？
	格式：var 变量名 = document.getElementById("标签的id属性值");
	
	1.script标签在想要获取标签对象的那个标签的下面
		<html>
            <head>
                <meta charset="utf-8">
                <title>获取标签对象</title>
            </head>
            <body>
                <div id="aaa"></div>
                <input id="bbb"/>
            </body>
            <script>
                //获取div标签对象
                var div = document.getElementById("aaa");
                alert(div);//[object HTMLDivElement]

                //获取input标签对象
                var input = document.getElementById("bbb");
                alert(input);//[object HTMLInputElement]
            </script>
        </html>
	
	2.script标签在想要获取标签对象的那个标签的上面
		<html>
            <head>
                <meta charset="utf-8">
                <title>获取标签对象</title>
                <script>
                    //当页面加载完才会执行方法体中的内容
                    window.onload = function() {
                        //获取div标签对象
                        var div = document.getElementById("aaa");
                        alert(div);

                        var input = document.getElementById("bbb");
                        alert(input);
                    }
                </script>
            </head>
            <body>
                <div id="aaa"></div>
                <input id="bbb" />
            </body>
        </html>
        
操作标签的文本数据？
	1.获取标签的文本数据
		<html>
            <head>
                <meta charset="utf-8">
                <title>操作标签的文本数据</title>
                <script>
                    //当页面加载完才会执行方法体中的内容
                    window.onload = function() {
                        //获取div标签对象
                        var div = document.getElementById("aaa");

                        //获取div标签的文本数据
                        var str = div.innerHTML;
                        alert(str);
                    }
                </script>
            </head>
            <body>
                <div id="aaa">约吗</div>
            </body>
        </html>
	
	2.设置标签的文本数据
		<html>
            <head>
                <meta charset="utf-8">
                <title>操作标签的文本数据</title>
                <script>
                    //当页面加载完执行方法体中的内容
                    window.onload = function() {
                        //获取div标签对象
                        var div = document.getElementById("div");
                        //设置标签的文本数据
                        div.innerHTML = "滚犊子";
                    }
                </script>
            </head>
            <body>
                <div id="div">约吗</div>
            </body>
        </html>
	
	3.追加标签的文本数据
		<html>
            <head>
                <meta charset="utf-8">
                <title>操作标签的文本数据</title>
                <script>
                    //当页面加载完执行方法体中的内容
                    window.onload = function() {
                        //获取div标签对象
                        var div = document.getElementById("div");
                        //追加文本数据
                        div.innerHTML += "滚犊子";
                    }
                </script>
            </head>
            <body>
                <div id="div">约吗</div>
            </body>
        </html>
	
操作标签样式？
	方式一：
		<html>
            <head>
                <meta charset="utf-8">
                <title>操作标签样式</title>
                <script>
                    //当页面加载完执行方法体中的内容
                    window.onload = function() {
                        //获取标签对象
                        var div = document.getElementById("aaa");

                        //给div标签对象施加样式
                        div.style = "border:1px solid red; font-size:100px; color:yellowgreen";
                    }
                </script>
            </head>
            <body>
                <div id="aaa">约吗</div>
            </body>
        </html>
	
	方式二：
		<html>
            <head>
                <meta charset="utf-8">
                <title>操作标签样式</title>
                <script>
                    //当页面加载完执行方法体中的内容
                    window.onload = function() {
                        //获取标签对象
                        var div = document.getElementById("aaa");

                        //给div标签对象施加样式
                        div.style.border = "1px solid red";
                        div.style.fontSize = "100px";
                        div.style.color = "yellowgreen";
                    }
                </script>
            </head>
            <body>
                <div id="aaa">约吗</div>
            </body>
        </html>
		
js的事件处理？
	方式一：html的单击事件属性
		<html>
            <head>
                <meta charset="utf-8">
                <title>js事件处理</title>
                <script>
                    function aaa() {
                        alert("你好贱");
                    }
                </script>
            </head>
            <body>
                <input type="button" value="点我啊" onclick="aaa()"/>
            </body>
        </html>
	
	方式二：js原生代码动态绑定鼠标单击事件
		<html>
            <head>
                <meta charset="utf-8">
                <title>js的事件处理</title>
                <script>
                    //当页面加载完执行方法体中的内容
                    window.onload = function() {
                        //获取标签对象
                        var bt = document.getElementById("bt");

                        //给bt对象动态绑定鼠标单击事件
                        bt.onclick = function() {
                            alert("臭不要脸");
                        }
                    }
                </script>
            </head>
            <body>
                <input type="button" value="点我啊" id="bt"/>
            </body>
        </html>

~~~

