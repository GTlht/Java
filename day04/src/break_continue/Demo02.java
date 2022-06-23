package break_continue;

public class Demo02 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
            if(i == 2) {
                //break;
            	continue;
                //System.out.println(i);//编译报错，因为永远都执行不到
            }
        }
	}
}
