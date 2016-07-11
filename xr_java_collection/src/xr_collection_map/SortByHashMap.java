package xr_collection_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap��������
 * 
 * @author iamxiarui
 *
 */
public class SortByHashMap {

	/**
	 * ������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, Person> personMap = new HashMap<Integer, Person>();
		personMap.put(1, new Person("����", 21));
		personMap.put(4, new Person("Ǯ��", 24));
		personMap.put(3, new Person("����", 23));
		personMap.put(2, new Person("����", 22));

		System.out.println(personMap);
		HashMap<Integer, Person> sortHashMap = sortHashMap(personMap);
		System.out.println(sortHashMap);
	}

	/**
	 * ��HashMap����
	 * 
	 * @param personMap
	 * @return
	 */
	private static HashMap<Integer, Person> sortHashMap(HashMap<Integer, Person> personMap) {

		// �����õ�map �ļ�ֵ�Լ���
		Set<Entry<Integer, Person>> entrySet = personMap.entrySet();
		// ��set ����תΪList���ϣ�Ϊʲô��Ϊ��ʹ�ù���������򷽷�
		List<Entry<Integer, Person>> list = new ArrayList<Entry<Integer, Person>>(entrySet);
		
		Collections.sort(list, new Comparator<Entry<Integer, Person>>() {
			@Override
			public int compare(Entry<Integer, Person> o1, Entry<Integer, Person> o2) {
				// ����Ҫ�����User��age �ĵ��������
				return o2.getValue().getAge() - o1.getValue().getAge();
			}
		});
		
		// ����һ���µ������HashMap����ļ���
		LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<Integer, Person>();
		// ��List�е����ݴ洢��LinkedHashMap��
		for (Entry<Integer, Person> entry : list) {
			linkedHashMap.put(entry.getKey(), entry.getValue());
		}
		// ���ؽ��
		return linkedHashMap;
	}
}

/**
 * �Զ���Person��
 * 
 * @author iamxiarui
 *
 */
class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
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
		this.age = age;
	}
}
