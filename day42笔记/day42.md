### JavaScript

~~~
js的事件处理？
	1.点击事件
		onclick：当用户单击元素时发生此事件
		ondblclick：当用户双击元素时发生此事件
	
	2.加载事件
		onload：在对象已加载时，发生此事件
	
	3.焦点事件
		onfocus：在元素获得焦点时发生此事件
		onblur：当元素失去焦点时发生此事件
		
		focus()：获取焦点
		blur()：失去焦点
		
	4.键盘事件
		onkeydown：当用户正在按下键时，发生此事件
		onkeypress：当用户按下键时，发生此事件
		onkeyup：当用户松开键时，发生此事件
		
	5.鼠标事件
		onmousedown：用户在元素上按下鼠标按钮时，发生此事件
		onmousemove：当指针在元素上方移动时，发生此事件
		onmouseout：当用户将鼠标指针移出元素或其中的子元素时，发生此事件
		onmouseover：当指针移动到元素或其中的子元素上时，发生此事件
		onmouseup：当用户在元素上释放鼠标按钮时，发生此事件
		
	6.表单事件
		onselect：用户选择文本后（对于<input>和<textarea>）发生此事件
		onchange：当form元素的内容、选择的内容或选中的状态发生改变时，发生此事件
					针对单选框，复选框和下拉框
		onsubmit：在提交表单时发生此事件
			表单提交方式？
				方式一：
					<html>
                        <head>
                            <meta charset="utf-8">
                            <title>表单事件</title>
                            <script>
                                function aaa() {
                                    alert("约吗");

                                    //return false;
                                    return true;
                                }
                            </script>
                        </head>
                        <body>
                            <form action="success.html" method="get" onsubmit="return aaa()">
                                用户名：<input type="text" name="username"><br>
                                密码：<input type="password" name="password"><br>
                                <input type="submit" value="注册">
                            </form>
                        </body>
                    </html>
                    
           		方式二：
           			<html>
                        <head>
                            <meta charset="utf-8">
                            <title>表单事件</title>
                            <script>
                                window.onload = function() {
                                    var form = document.getElementById("form");
                                    form.onsubmit = function() {
                                        alert("约吗");

                                        //return true;
                                        return false;
                                    }
                                }
                            </script>
                        </head>
                        <body>
                            <form action="success.html" method="get" id="form">
                                用户名：<input type="text" name="username"><br>
                                密码：<input type="password" name="password"><br>
                                <input type="submit" value="注册">
                            </form>
                        </body>
                    </html>
                方式三：
                	<html>
                        <head>
                            <meta charset="utf-8">
                            <title>表单事件</title>
                            <script>
                                function submit() {
                                    //进行校验
                                    //提交表单
                                    var form = document.getElementById("form");
                                    //form.submit();
                                }

                                function aaa() {
                                    //进行校验
                                    //提交表单
                                    var form = document.getElementById("form");
                                    form.submit();
                                }
                            </script>
                        </head>
                        <body>
                            <form action="success.html" method="get" id="form">
                                用户名：<input type="text" name="username"><br>
                                密码：<input type="password" name="password"><br>
                                <input type="button" value="注册" onclick="aaa()">
                            </form>
                            <!-- <input type="submit" value="注册" onclick="submit()"> -->
                        </body>
                    </html>
~~~

