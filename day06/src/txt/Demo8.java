package txt;
/*�����������󣬲��ô���ʵ��(ÿ��С������Ҫ��װ�ɷ���)
	1.�ж����������Ƿ����(������С��)
	2.��ȡ�������нϴ��ֵ(������С��)
	3.��ȡ�������н�С��ֵ(������С��)
	4.�ܷ���һ������ʵ��2��3����������*/
public class Demo8 {
	public static void main(String[] args) {
		//1.�ж����������Ƿ����(������С��)
		int a=9;
		double b=3.8;
		if(isDeng(a,b)) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
		//2.��ȡ�������нϴ��ֵ(������С��)
		System.out.println("�ϴ�ֵ��"+getMax(a,b));
		//3.��ȡ�������н�С��ֵ(������С��)
		System.out.println("��Сֵ��"+getMin(a,b));
		//4.�ܷ���һ������ʵ��2��3����������
		getZui(a,b);
	}
	//1.�ж����������Ƿ����(������С��)
	public static boolean isDeng(int i,double j) {
		if(i==j) {
			return true;
		}else {
			return false;
		}
	}
	
	//2.��ȡ�������нϴ��ֵ(������С��)
	public static Object getMax(int a,double b) {
		return (a>b? a:b);
	}
	
	//3.��ȡ�������н�С��ֵ(������С��)
	public static Object getMin(int a,double b) {
		return (a<b? a:b);
	} 
	//4.�ܷ���һ������ʵ��2��3����������
	public static void getZui(int a,double b) {
		if(a>b) {
			System.out.println("�ϴ�ֵ�ǣ�"+a+"  ��Сֵ�ǣ�"+b);
		}
	} 

}
