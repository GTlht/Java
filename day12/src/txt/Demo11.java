package txt;
/*题二：已知String s = "afdsaAdsafaSAFDASsafd"，要求将首字母变成大写，其余字母都变成小写？
*/
public class Demo11 {
	public static void main(String[] args) {
		String s = "afdsaAdsafaSAFDASsafd";
		System.out.println(s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase());
	}

}
