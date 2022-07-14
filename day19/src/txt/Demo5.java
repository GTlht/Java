package txt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*5.分析以下需求，并用代码实现：
	(1)定义一个学生类Student，属性：姓名(String name)、班级班号(String no)、成绩(double score)
	(2)将若干Student对象存入List集合，并统计每个班级的总分和平均分
		思路：
			a.采用面向对象的思想
			b.不推荐使用Map<String,List<Student>> 操作不方便
			c.推荐使用Map<String，ClassRoom>
			*/
public class Demo5 {
	public static void main(String[] args) {
		List<Students> list=new ArrayList<Students>();
		Map<String, ClassRoom> map=new HashMap<String, ClassRoom>();
		list.add(new Students("java01",new ClassRoom("zhangsan",98.0,1)));
		list.add(new Students("java01",new ClassRoom("lisi",90.5,1)));
		list.add(new Students("java02",new ClassRoom("xiaowang",88.5,1)));
		list.add(new Students("java02",new ClassRoom("libai",92.5,1)));
		for (Students stus : list) {
			if(map.containsKey(stus.getNo())) {
				ClassRoom value=map.get(stus.getNo());
				value.setScore(stus.getClassRoom().getScore()+value.getScore());
				value.setCount(stus.getClassRoom().getCount()+value.getCount());
				map.put(stus.getNo(),value );
			}else {
				map.put(stus.getNo(), stus.getClassRoom());
			}
		}
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key+"班"+"总分："+map.get(key).getScore()+"平均分："+map.get(key).getScore()/map.get(key).getCount());
		}
	}

}
class ClassRoom{
	private String name;
	private double score;
	private int count;//统计班级人数
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public ClassRoom(String name, double score,int count) {
		super();
		this.name = name;
		this.score = score;
		this.count = count;
	}
	@Override
	public String toString() {
		return "ClassRoom [name=" + name + ", score=" + score + "]";
	}
	
	
}
class Students{
	private String no;
	private ClassRoom classRoom;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public ClassRoom getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(ClassRoom classRoom) {
		this.classRoom = classRoom;
	}
	public Students(String no, ClassRoom classRoom) {
		super();
		this.no = no;
		this.classRoom = classRoom;
	}
	@Override
	public String toString() {
		return "Students [no=" + no + ", classRoom=" + classRoom + "]";
	}
	
	
}
