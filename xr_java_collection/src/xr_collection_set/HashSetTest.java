package xr_collection_set;

/*
 * HashSet �����ظ�Ԫ�ص�ʵ��
 * 
 * */
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		hs.add(new Person("name1", 10));
		hs.add(new Person("name2", 20));
		hs.add(new Person("name3", 30));
		hs.add(new Person("name1", 10)); // ��ͬԪ��

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			// ǿ��ת������
			Person p = (Person) it.next();
			sop(p.getName() + "----" + p.getAge());
		}
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}
}

class Person {
	private String name;
	private int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// ��дhashCode���� ������ͬ��hashCode
	public int hashCode() {
		return 60;
	}

	// ��дequals���� ��ͬԪ�ط���false
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		// ǿ������ת��
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}
}
