package txt;
/*9.�����������󣬲��ô���ʵ��
	1.������Ŀ������ 
		���ԣ�
			���� ���� ���� ����
		��Ϊ��
			����work
	2.�������Ա��
		���ԣ�
			���� ���� ����
		��Ϊ��
			����work

	3.Ҫ��:���ϳ�ȡһ������,���������඼�̳��������,���е�����д�ڸ����У�������д�����еķ���
	
		��д������:�����������Ĳ���*/
public class Demo13 {
	public static void main(String[] args) {
		Code1 c=new Code1();
		c.work();
		Manager1 m=new Manager1();
		m.work();
	}

}
class Code1{
	String name;
	int id;
	double salary;
	public void work() {
		System.out.println("����Ա����");
	}
}
class Manager1 extends Code1{
    double bonus;
    @Override
    public void work() {
		System.out.println("��Ŀ������");
	}
}














