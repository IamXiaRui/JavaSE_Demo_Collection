package xr_collection_set;

/*
 * TreeSet�е���������
 * 
 * ������������ ������ͬ�Ǹ�����������
 * 
 * */
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();

		// TreeSet �еĶ������߱��Ƚ��� ����û�бȽ��� ��ᱨ�쳣
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

// ע�⣺�˶������ʵ��Comparable�ӿ� ʹ��߱��Ƚ���
class People implements Comparable {
	private String name;
	private int age;

	People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// ʵ�ֽӿ��еķ���
	public int compareTo(Object obj) {

		if (!(obj instanceof People)) {
			throw new RuntimeException("ѧ�������д�");
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