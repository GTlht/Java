package txt;

/*	��һ�������ַ���
		��ʽһ��
		��ʽ����
		��ʽ����
		*/
public class Demo10 {
	public static void main(String[] args) {
		System.out.println("+++++++++++++++++��һ��+++++++++++");
		String str = "sjdfenrviuaenwo";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println("\n+++++++++++++++++++�ڶ���+++++++++++++++++++++++");
		 for (int i = 0; i < str.length(); i++) {
	            System.out.print(str.substring(i, i + 1)+ " ");
	        }
		System.out.println("\n++++++++++++++++++������+++++++++++++++");
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
