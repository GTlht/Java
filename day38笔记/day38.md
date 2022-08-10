### CSS

~~~
css的样式？
	1.字体样式
		font-family：设置文本的字体
		font-style：用于指定斜体文本
		font-weight：指定字体的粗细
		font-size：设置文本的大小
		font：复合属性
			font 属性是以下属性的简写属性：
                font-style
                font-variant
                font-weight
                font-size/line-height
                font-family
                
        	注意：
        		1.有顺序划分
        		2.font-size 和 font-family 的值是必需的。如果缺少其他值之一，则会使用其默认值
  
	2.文本样式
		color：设置文本的颜色
		text-align：设置文本的水平对齐方式
		text-decoration：设置或删除文本装饰
		text-indent：指定文本第一行的缩进
		line-height：指定行之间的间距
	
	3.背景样式
		background-color：指定元素的背景色
		background-image：指定用作元素背景的图像
		background-repeat：水平方向重复

	4.边框样式
		border-style：指定要显示的边框类型
		border-width：指定四个边框的宽度
		border-color：设置四个边框的颜色
		border-radius：用于向元素添加圆角边框
		border：复合属性
            border-width
            border-style（必需）
            border-color

	5.display属性
		display 属性是用于控制布局的最重要的 CSS 属性
		display 属性规定是否/如何显示元素
		
		display: none;
		display: block; 
		
	6.外边距和内边距(盒子模型)
		div + css来对页面进行布局的
		
		外边距(外补丁)：
			margin-top：设置外上边距
            margin-right：设置外右边距
            margin-bottom：设置外下边距
            margin-left：设置外左边距
		
		内边距(内补丁)：
			padding-top：设置内上边距
            padding-right：设置内右边距
            padding-bottom：设置内下边距
            padding-left：设置内左边距
            
            box-sizing属性：允许我们在元素的总宽度和高度中包括内边距（填充）和边框
            默认情况下，元素的宽度和高度是这样计算的：
				width + padding + border = 元素的实际宽度
				height + padding + border = 元素的实际高度
				
			box-sizing: border-box;
			
	7.浮动
		目的：为了让多个div可以在一行上排列显示
		
		float：设置浮动
			left - 元素浮动到其容器的左侧
            right - 元素浮动在其容器的右侧
            none - 元素不会浮动（将显示在文本中刚出现的位置）。默认值。
		
		clear：清除浮动
            none - 允许两侧都有浮动元素。默认值
            left - 左侧不允许浮动元素
            right- 右侧不允许浮动元素
            both - 左侧或右侧均不允许浮动元素
            
	8.定位
		目的：是为了使用4大属性，top,left,right,bottom
		
		position：设置定位
			相对定位：
				position: relative; 的元素相对于其正常位置进行定位
		
				注意：设置相对定位，是不会对其他的元素造成影响的
				
			绝对定位：
				position: absolute; 的元素相对于最近的定位祖先元素进行定位
				
				注意：设置绝对定位，会对其他的元素造成影响的
~~~

