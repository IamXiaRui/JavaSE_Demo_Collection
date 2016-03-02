package xr_collection_set;

/*
 * TreeSet �ڶ�������ʽ
 * 
 * ����ʵ�ֱȽ����ӿ�
 * 
 * */
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest_Two {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new xrCompare());

		// TreeSet �еĶ������߱��Ƚ��� ����û�бȽ��� ��ᱨ�쳣
		ts.add(new People("man01", 10));
		ts.add(new People("man02", 50));
		ts.add(new People("man02", 30));
		ts.add(new People("man003", 20));
		ts.add(new People("man05", 10));

		Iterator it = ts.iterator();

		while (it.hasNext()) {
			People p = (People) it.next();
			System.out.println(p.getName() + "-----" + p.getAge());
		}
	}

}

class xrCompare implements Comparator {

	public int compare(Object o1, Object o2) {
		People p1 = (People) o1;
		People p2 = (People) o2;

		int num = p1.getName().compareTo(p2.getName());

		if (num == 0) {
			if (p1.getAge() > p2.getAge()) {
				return 1;
			}
			if (p1.getAge() == p2.getAge()) {
				return 0;
			}
			return -1;
		}

		return num;
	}

}