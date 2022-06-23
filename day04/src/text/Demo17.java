package text;

public class Demo17 {
	//17.看程序说结果，请不要提前运行？
	public class Test01 {
		public static void main(String[] args) {
			int x = 1,y = 1;
			if(x++==2(false) & ++y==2(true))	{//x=2 y=2 
				x =7;
			}
			System.out.println("x="+x+",y="+y); //x=2,y=2
			
			int a = 1,b = 1;

			if(a++==2(false) && ++b==2(true)) {//a=2 b=1
				a =7;
			}
			System.out.println("a="+a+",b="+b);//a=2,b=1
		}
	}
		
	public class Test02 {
		public static void main(String[] args) {
			int x = 1,y = 1;
			if(x++==1(true) | ++y==1(false))	{//x=2  y=2
				x =7;//x=7
			}
			System.out.println("x="+x+",y="+y);//x=7,y=2
			
			int a = 1,b = 1;

			if(a++==1(true) || ++b==1(false)) {//a=2 b=1
				a =7;//a=7
			}
			System.out.println("a="+a+",b="+b);//a=7,b=1
		}
			
	}
	
	public class Test03 {
		public static void main(String[] args) {
			boolean c = true;

			if(c==false) 
				System.out.println("a");
			else if(c)
				System.out.println("b");//控制台输出b
			else if(!c)
				System.out.println("c");
			else
				System.out.println("d");
		}
	}

}
