package function;

public class Demo10 {
	public static void main(String[] args) {
		aaa();
		return;
	}
	
	public static void aaa() {
		for(int i = 1; i <= 10; i++) {
			if(i == 2) {
				//break;
				return;
				//System.out.println("在吗");
			}
			
			System.out.println(i);
		}
		
		System.out.println("约吗");
		
	}
	
}
