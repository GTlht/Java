package text;
/*15.世界最高峰是珠穆朗玛峰(8844.43米=8844430毫米),假如有一张足够大的纸，它的厚度是0.1毫米，
请问，需要折叠多少次，可以折成珠穆朗玛峰的高度
*/
public class Demo15 {
	public static void main(String[] args) {
		double tall=0.1;
		int i=0;
		while(tall<8844430) {
			tall*=2;
			i++;
		}
		System.out.println(i);
	}

}
