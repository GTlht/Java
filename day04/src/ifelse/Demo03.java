package ifelse;

public class Demo03 {
	public static void main(String[] args) {
		int i = 0;
		int j = 3;
		if(j > 5) {
			i = 1;
		} else if(j > 4) {
			i = 2;
		} else if(j > 3) {
			i = 3;
		} else if(j > 2) {
			i = 4;
		} else if(j > 1) {
			i = 5;
		} else {
			
		}
		System.out.println(i);
	}
}
