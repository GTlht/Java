### HTML

~~~
html常见的标签？
	1.结构体标签
	2.文本标签
	3.图片标签
		<img/>
		
		常见的属性？
			src属性：设置图片的路径
				路径的分类：
					相对路径：不以盘符开始的路径
						./：相对于当前目录下
							注意：./可以省略不写
						../：相对于上一级目录下
					绝对路径：以盘符开始的路径
					
			alt属性：图片的说明
			title属性：图片的说明
			width属性：设置图片的宽度
			height属性：设置图片的高度
				注意：一般情况下我们不会同时设置高度和宽度的，因为这样设置会导致图片不清晰，我们只需要单独设置宽度或者高度即可
			align属性：设置图片位置
				left：居左
				right：居右
			border属性：设置图片的边框粗细
	4.列表标签
		a.有符号有序号
			<ol type="I">
                <li>哈哈</li>
                <li>呵呵</li>
                <li>嘿嘿</li>
                <li>嘻嘻</li>
                <li>嘤嘤</li>
            </ol>
            
		b.有符号无序号
			<ul type="square">
                <li>哈哈</li>
                <li>呵呵</li>
                <li>嘿嘿</li>
                <li>嘻嘻</li>
                <li>嘤嘤</li>
            </ul>
            
		c.无符号无序号
			<dl>
                <dt>热门游戏</dt>
                <dd>和平精英</dd>
                <dd>王者荣耀</dd>
                <dd>奇迹暖暖</dd>
                <dd>荒野大嫖客</dd>
            </dl>

	5.特殊符号
		&nbsp; 空格
		&lt; 小于号
		&gt; 大于号
		
	6.块级标签
		<div></div>
		<span></span>
		
		可以使用div + css对页面进行布局
		
	7.语义化标签
		<header></header>
		<footer></footer>

	8.超链接标签
		<a></a>

		常见的属性？
			href属性：链接到的位置，也就是跳转路径
			target属性：打开链接方式
				_self：默认值，默认在当前页面打开链接窗口
				_blank：打开一个新的链接窗口

		a.外部链接
			<a href="http://www.woniuxy.com" target="_self">来蜗牛吧</a>
            <a href="http://www.woniuxy.com" target="_blank">来蜗牛吧</a>
            <a href="http://www.baidu.com" target="_blank">去百度</a>

		b.内部连接
			<a href="demo06.html">到demo06.html</a>
			<a href="../img/5.jpg">看图片</a>

		c.空连接
			<a href="#">点我啊</a>
			
		d.下载链接
			<a href="../img/5.jpg" download>下载大美女</a>
			
		e.锚点链接
			<div id="top"></div>
			<a href="#top">回到顶部</a>
			
		f.图片链接
			<a href="http://www.baidu.com">
                <img src="../img/5.jpg" title="这是一个大美女" />
            </a>
           
	9.表格标签
    	表格标签：<table></table>
    	
    	常见的属性：
    		border属性：设置表格的边框的粗细
    		width属性：设置表格的宽度
    		height属性：设置表格的高度
    		align属性：设置表格的位置
    		cellspacing属性：设置外边线和内边线之间的距离
    		cellpadding属性：设置内边线和内容之间的距离
    		bgColor属性：设置表格背景颜色
    	
    	行标签：<tr></tr>
    		常见的属性：
    			bgColor属性：设置行的背景颜色
    	
    	列标签：<td></td>，<th></th>
    		常见的属性：
    			bgColor属性：设置列的背景颜色
    			
    	表格标题标签：<caption></caption>
    	
    	表格语义化标签：
    		<thead></thead>
    		<tbody></tbody>
    		<tfoot></tfoot>
    		
    	合并单元格：
    		合并行：rowspan
    		合并列：colspan
    		
    	注意事项？
    		表格和表格之间的嵌套，里面的表格要放在外面的表格的td标签的里面
    		table > tr > td > table 
    		
	10.表单标签
		表单标签：<form></form>
			注意：表单是一个看不到摸不到的东西
			作用：可以收集用户输入的各种数据，可以和服务器进行数据的交互
			
		常见的表单项？
			1.文本框
				<input/>
				
				常见的属性？
					type属性：设置文本框的类型
						type="text" 普通文本框
						type="password" 密码框
						type="radio" 单选框
						type="date" 日期框
						type="checkbox" 多选框
						type="email" 邮箱框(自带邮箱校验功能)
						type="file" 文件框
						type="color" 颜色框
						type="number" 数字框
						type="hidden" 隐藏框
						type="button" 普通按钮框
						type="submit" 按钮(自带提交功能)
						type="reset" 按钮(自带重置功能)
						
					checked属性：
						设置哪个被选中，只能用在单选框和多选框上面
						
					placeholder属性：
						设置文本框提示内容
						
			2.下拉框标签
				<select></select>
				<option></option>
				
				常见的属性？
					selected属性：设置哪个option默认被选中
					
			3.文本域
				<textarea></textarea>
~~~

