package text;
/*16.������һ�����ֿ�ʼ����������Ҫ���������ǰ���7����7�ı���ʱ��Ҫ˵����
����ʹ�ó����ڿ���̨��ӡ��1-100֮���������߱ع����������*/
public class Demo16 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int a=i%7;
			int ge=i%10;
			int shi=i/10;
			int bai=i/100;
			if(a==0) {
				System.out.println(i);
			}else if(ge==7) {
				System.out.println(i);
			}else if(shi==7) {
				System.out.println(i);
			}else if(bai==7) {
				System.out.println(i);
			}
		}
	}

}
