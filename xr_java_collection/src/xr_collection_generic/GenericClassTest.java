package xr_collection_generic;

/*
 * 自定义泛型类
 * 
 * */
public class GenericClassTest {

	public static void main(String[] args) {
		// 初始化
		Generic<Man> g = new Generic<Man>();
		Man man = new Man();
		g.setP(man);
		man = g.getP();
	}
}

class Man {
	private String name;
	private int age;

}

class Women {
	private String name;
	private int age;

}

// 自定义泛型
class Generic<Person> {
	private Person p;

	public Person getP() {
		System.out.println(p);
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

}