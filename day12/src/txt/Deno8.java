package txt;
/*8.���󣺶���һ����������int�����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷���������
		����̨�����������磺����Ϊint[] arr = {1,2,3};,ִ�з������������Ϊ��[1,2,3]*/
public class Deno8 {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		print(arr);
		

	}
	public static void print(int[]arr) {
		String resultString="[";
		for(int i=0;i<arr.length;i++){
			if(i < arr.length-1){
				resultString += arr[i] +","; 
			}else{
				resultString += arr[i] + "]";
			}	
		}
		System.out.println(resultString);
	}

}
