package txt;

import java.util.Scanner;

/*10.�����������󣬲��ô���ʵ��
	1.����¼��༶����
	2.����¼��İ༶������������
	3.ͨ������¼�뽫�༶ÿ���˵ķ���¼�뵽����������
	4.Ҫ��:
		(1)��ӡ�ð༶�Ĳ���������
		(2)��ӡ�ð༶��ƽ����
		(3)��ʾ��ʽ����:
			������༶����:
			����¼��:100
			�������һ��ѧԱ����
			����¼�룺20
			������ڶ���ѧԱ�ķ���
			����¼�룺98
			����̨���:
				����������:19
				�༶ƽ����:87*/
public class Demo10 {
	public static void main(String[] args) {
		double[] arr=init();
		System.out.println("����������:"+getFail(arr));
		System.out.println("�༶ƽ����"+getAvg(arr));
	}
	
	//¼��༶����
	public static double[] init() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������༶������");
		int num=sc.nextInt();
		double[] arr=new double[num];
		for(int i=1;i<=num;i++) {
			System.out.println("�������"+i+"��ѧԱ������");
			arr[i-1]=sc.nextDouble();
		}
		return arr;
	}
	//��ȡ����������
	public static int getFail(double[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<60) {
				count++;
			}
		}
		return count;
	}
	//��ȡ�༶ƽ����
	public static int getAvg(double[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	
	}
}
