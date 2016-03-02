package xr_collection_set;

/*
 * TreeSet中的排序问题
 * 
 * 根据年龄排序 年龄相同是根据姓名排序
 * 
 * */
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		// TreeSet 中的对象必须具备比较性 假如没有比较性 则会报异常
		ts.add(new People("man01", 10));
		ts.add(new People("man02", 50));
		ts.add(new People("man003", 20));
		ts.add(new People("man05", 10));

		Iterator it = ts.iterator();

		while (it.hasNext()) {
			People p = (People) it.next();
			System.out.println(p.getName() + "-----" + p.getAge());
		}
	}

}

// 注意：此对象必须实现Comparable接口 使其具备比较性
class People implements Comparable {
	private String name;
	private int age;

	People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 实现接口中的方法
	public int compareTo(Object obj) {

		if (!(obj instanceof People)) {
			throw new RuntimeException("学生对象有错");
		}

		People p = (People) obj;

		if (this.age > p.age) {
			return 1;
		}
		if (this.age == p.age) {
			return this.name.compareTo(p.name);
		}
		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}

}