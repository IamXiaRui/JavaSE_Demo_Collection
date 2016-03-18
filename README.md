#Java中的集合

###博客地址
http://www.iamxiarui.com/2016/03/17/java：集合1-基本概念/

##Collection类

###基本概念

１、集合是存储对象最常用的一种方式。

２、数组虽然可以存储对象，但是长度是固定的；而集合的长度是可变的，数组中可以存数基本数据类型，集合只能存储对象。

３、集合只能用于存储对象，可以是不同类型的对象，长度可变。

４、集合类是ｊａｖａ中工具包中的成员，使用的时候需要导入工具包：ｊａｖａ．ｕｔｉｌ．＊；

５、集合框架中有很多容器，每个容器对数据存存储方式都不同，这种存储方式叫做数据结构。

６、集合和数组一样，存放的是对象的地址，并不是对象实体。

###Ｃｏｌｌｅｃｔｉｏｎ共性方法

１、增加：ａｄｄ（Ｏｂｊｅｃｔ　ｏ）　：　参数是任意对象。

２、删除：ｒｅｍｏｔｅ（Ｏｂｊｅｃｔ　ｏ）　：　参数是任意对象。

ｃｌｅａｒ（）　：　清空集合

３、判断：对象仍然是Ｏｂｊｅｃｔ

	boolean	contains(Object o) 
	          如果此列表中包含指定的元素，则返回 true。

	boolean	isEmpty() 
	          如果此列表中没有元素，则返回 true

４、交集：取多个集合中相同的元素。如果没有则为空

	boolean	retainAll(Collection<?> c) 
	          仅保留此 collection 中那些也包含在指定 collection 的元素（可选操作）。

	boolean	removeAll(Collection<?> c) 
	          移除此 collection 中那些也包含在指定 collection 中的所有元素（可选操作）。

###迭代器

定义：集合取出元素的方式，这种方式定义在集合的内部，可以直接访问集合内部的元素，也就是内部类。这些内部类都符合一个规则，即Ｉｔｅｒａｔｏｒ。

	Iterator<E>	iterator() 
	          返回在此 collection 的元素上进行迭代的迭代器。

１、返回的一个迭代器接口，一般是在循环中使用，循环得到数据。

	boolean	hasNext() 
	          如果仍有元素可以迭代，则返回 true。
	
	E next() 
	          返回迭代的下一个元素。

	void remove() 
	          从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。

示例代码：

	Iterator it = al.iterator();
	while(it.hasNext()){
		sop(it.next());
	}

２、也可以使用ｆｏｒ循环，因为迭代器使用后不需要再使用，ｗｈｉｌｅ循环导致迭代器对象一直处于内存中，ｆｏｒ循环结束后，对象便销毁，节省内存。

	for(Iterator it = al.iterator();it.hasNext();){
		sop(it.next());
	}

3、注意，在迭代时循环中每ｎｅｘｔ（）一次，就要判断ｈａｓＮｅｘｔ（）一次，所以应该避免在迭代循环内部同时出现多个ｎｅｘｔ（）。

##List类

###基本概念

１、Ｃｏｌｌｅｃｔｉｏｎ中的子类，Ｌｉｓｔ中元素是有顺序的（存入取出顺序一致），可以重复。因为该集合体系中有索引。

２、Ｌｉｓｔ中凡是可以操作角标的方法都是该体系特有的方法。

###特有方法

１、增

	void add(int index, E element) 
	          在列表的指定位置插入指定元素（可选操作）。

	boolean	addAll(int index, Collection<? extends E> c) 
	          将指定 collection 中的所有元素都插入到列表中的指定位置（可选操作）。

２、删

	E	remove(int index) 
	          移除列表中指定位置的元素（可选操作）。

３、改

	E	set(int index, E element) 
	          用指定元素替换列表中指定位置的元素（可选操作）。

４、查

	E	get(int index) 
	          返回列表中指定位置的元素。

	List<E>	subList(int fromIndex, int toIndex) 
	          返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。

	int	indexOf(Object o) 
	          返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。

实例代码：

	/*
	 * List的所有特有方法 参数均带有角标
	 * 
	 * 
	 * */
	public class ListTest {

		public static void main(String[] args) {

			ArrayList al = new ArrayList();
	
			// 增加元素
			al.add("demo1");
			al.add("demo2");
			al.add("demo3");
			al.add("demo4");
			al.add("demo5");
			System.out.println("原来集合：" + al);
	
			// 删除元素
			al.remove(1);
			System.out.println("删减后的集合：" + al);
	
			// 修改元素
			al.set(2, "demo6");
			System.out.println("改正后的集合：" + al);
	
			// 返回集合中一小段的元素
			System.out.println("集合区域的元素：" + al.subList(1, 3));
	
			// 返回元素位置
			System.out.println("集合元素位置：" + al.indexOf("demo3"));
	
			// 返回元素内容
			System.out.print("得到集合元素：");
			for (int x = 0; x < al.size(); x++) {
				System.out.println("size(" + x + ") = " + al.get(x) + " ");
			}
	
			// 迭代器得到集合元素
			System.out.print("迭代器得到集合元素：");
			Iterator it = al.iterator();
			while (it.hasNext()) {
				System.out.print(" " + it.next());
			}
		}
	}

###Ｌｉｓｔ特有的迭代器

	ListIterator<E>	listIterator() 
	          返回此列表元素的列表迭代器（按适当顺序）。
	ListIterator<E>	listIterator(int index) 
	          返回列表中元素的列表迭代器（按适当顺序），从列表的指定位置开始。

１、ＬｉｓｔＩｔｅｒａｔｏｒ是Ｉｔｅｒａｔｏｒ的子接口。

２、在迭代时，不能通过集合对象的方法操作集合中的元素，会发生ＣｏｎｃｕｒｒｅｎｔＭｏｄｉｆｉｃａｔｉｏｎＥｘｃｅｐｔｉｏｎ异常。

３、该接口只能通过Ｌｉｓｔ集合的ｌｉｓｔＩｔｅｒａｔｏｒ方法获取。

	// 必须使用这个列表迭代器
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			Object obj = li.next();
			if (obj.equals("demo3")) {
				li.set("demo5");
			}
		}
	System.out.print("  " + al);

###ＡｒｒａｙＬｉｓｔ

１、Ｌｉｓｔ的子类，底层的数据结构使用的是数组结构。线程不同步。

２、其特点是查询很快，增删改很慢。

３、其默认的长度为１０，如果超过这个范围，则新ｎｅｗ一个５０％增长速度的数组，再将原数据ｃｏｐｙ进来。


###ＬｉｎｋｅｄＬｉｓｔ

１、Ｌｉｓｔ的子类，底层的数据结构使用的链表结构。

２、特点是增删改很快，但是查询的速度很慢。

３、ｇｅｔＦｉｒｓｔ（）或者ｇｅｔＬａｓｔ（）是获取元素，但不删除，如果不存在这个元素，则会出现异常NoSuchElementException，但是下面的方法则返回ｎｕｌｌ：

	E	peekFirst() 
	          获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。

	E	peekLast() 
	          获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。


４、ｒｅｍｏｖｅＦｉｒｓｔ（）或者ｒｅｍｏｖｅＬａｓｔ（）是获取元素并删除，如果不存在这个元素，则会出现异常NoSuchElementException，但是下面的方法则返回ｎｕｌｌ：

	E	pollFirst() 
	          获取并移除此列表的第一个元素；如果此列表为空，则返回 null。

	E	pollLast() 
	          获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。


	/*
	 * 用LinkedList 模仿堆栈 和 队列的数据结构
	 * 堆栈 后进先出
	 * 队列 先进先出
	 * */
	public class LinkedListTest {
		public static void main(String[] args) {
			LinkedList li = new LinkedList();
	
			addList(li);
			System.out.println("原集合： " + li);
	
			System.out.print("堆栈： ");
			Iterator it = li.iterator();
			while (it.hasNext()) {
				stackList(li);
			}
	
			addList(li);
			System.out.print("\n原集合： " + li);
	
			System.out.print("\n队列： ");
			while (it.hasNext()) {
				queueList(li);
			}
		}
	
		public static void addList(LinkedList li) {
			li.addFirst("demo1");
			li.addFirst("demo2");
			li.addFirst("demo3");
			li.addFirst("demo4");
		}
	
		// 模仿堆栈 获取并移除此列表的第一个元素
		public static void stackList(LinkedList li) {
			System.out.print("  " + li.pollFirst());
		}
	
		// 模仿队列 获取并移除此列表的最后一个元素
		public static void queueList(LinkedList li) {
			System.out.print("  " + li.pollLast());
		}
	}




###Ｖｅｃｔｏｒ

１、Ｌｉｓｔ的子类，底层的数据结构使用的是数组数据结构。线程同步。

２、已经被ＡｒｒａｙＬｉｓｔ替代了。

３、Ｖｅｃｔｏｒ中的枚举：枚举就是其特有的取出方式。

	Enumeration<E>	elements() 
	          返回此向量的组件的枚举。

	Ｅｎｕｍｅｒａｔｉｏｎ类似与迭代器Ｉｔｅｒａｔｏｒ：应该优先考虑迭代器。

	boolean	hasMoreElements() 
	          测试此枚举是否包含更多的元素。

	E	nextElement() 
	          如果此枚举对象至少还有一个可提供的元素，则返回此枚举的下一个元素。

实例代码：

	Enumeration en = v.elements();
	
	while(en.hasMoreElements()){
		sop(en.nextElement());
	}


##Set类

###基本概念

１、Ｃｏｌｌｅｃｔｉｏｎ中的子类，Ｓｅｔ中的元素是没有顺序的（存入取出顺序不一致），不可以重复。

２、Ｓｅｔ集合的功能和Ｃｏｌｌｅｃｔｉｏｎ的功能是一致的。

３、Ｓｅｔ方法取出元素只有一种方式：迭代器。



###ＨａｓｈＳｅｔ

１、底层的数据结构是哈希表。线程非同步．

２、哈希表按照哈希值来存储，存储顺序不一定与添加顺序一致。哈希值如果相同，则比较是否是同一对象。

３、ａｄｄ（）方法返回的是布尔型，因为必须保证元素的唯一性，只有是ｔｒｕｅ的时候才能添加。

	boolean	add(E e) 
	          如果此 set 中尚未包含指定元素，则添加指定元素。

４、Ｈａｓｈｓｅｔ如何保证元素的唯一性呢？是通过元素的两个方法：ｈａｓｈＣｏｄｅ（）和ｅｑｕａｌｓ来完成。如果元素的Ｈａｓｈｃｏｄｅ值一致的，才会判断ｅｑｕａｌｓ是否为ｔｒｕｅ，如果不同不需要判断。

５、一般需要复写ＨａｓｈＳｅｔ中的两个方法：

	public int hashCode()　返回此 set 的哈希码值。
	
	public boolean equals(Object o)　　比较指定对象与此 set 的相等性。

示例代码：

	// 复写hashCode方法 给定相同的hashCode
	public int hashCode() {
		return 60;
	}

	// 复写equals方法 相同元素返回false
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		// 强制类型转换
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}


###ＴｒｅｅＳｅｔ

１、可以对Ｓｅｔ中的元素进行排序。底层数据结构是二叉树。

２、排序的第一种方式：ＴｒｅｅＳｅｔ中的对象必须具有比较性：

public interface Comparable<T>　：　此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。

	int	compareTo(T o) 
	          比较此对象与指定对象的顺序。

返回： 负整数、零或正整数，根据此对象是小于、等于还是大于指定对象。

注意：Ｓｔｒｉｎｇ类已经具备了比较性，实现了接口。

	class People implements Comparable {
	
	．．．
	
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
	｝

３、保证元素的唯一性的依据是：ｃｏｍｐａｒｅＴｏ方法中的ｒｅｔｕｒｎ　０；

４、排序第二种方式：让集合自身具备比较性，在初始化集合时，就有了比较方式。当两种方式同时存在时，以比较器为主。

TreeSet(Comparator<? super E> comparator) 
          构造一个新的空 TreeSet，它根据指定比较器进行排序。

　

	// 实现比较器
	class xrCompare implements Comparator {

		public int compare(Object o1, Object o2) {
			People p1 = (People) o1;
			People p2 = (People) o2;
	
			int num = p1.getName().compareTo(p2.getName());
	
			//判断次要顺序 很重要 ！
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

##泛型
###基本概念
１、是一个类型安全机制，解决安全问题。

２、可以将运行时期出现的异常问题转移到编译时期，让运行时期的问题减少。

３、避免了强制转换的繁琐问题。

４、格式：通过＜＞来定义要操作的引用数据类型。必须是引用数据类型，不能是基本数据类型，比如int 必须 改成 Integer.

###自定义泛型

１、泛型类：当类中的引用数据类型不确定的时候，可以定义泛型类。

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

２、泛型方法：在类中的方法上定义出泛型；

特别的：当静态方法不可以访问类上定义的泛型，如果静态方法操作的引用数据类型不能确定，可以将泛型定义在静态方法上。


	// 类上已经定义了泛型
	class GenericMethod<B> {
	
		// 方法上没有定义泛型 则根据类确定泛型
		public void getB(B b) {
			System.out.println("B --- " + b);
		}
	
		// 方法上已经定义了泛型 根据方法泛型来
		public <C> void getC(C c) {
			System.out.println("C --- " + c);
		}
	
		// 静态方法 必须自定义方法泛型 不能根据类上的泛型
		public static <D> void getD(D d) {
			System.out.println("D --- " + d);
		}
	}

３、泛型接口：定义接口的泛型方法

	// 定义接口的泛型
	interface Intet<T> {
		void show(T t);
	}
	
	// 类实现接口 并自定义泛型
	class GenericInterface<T> implements Intet<T> {
	
		@Override
		public void show(T t) {
			System.out.println("show --- " + t);
		}
	}


###泛型限定

１、　不明确具体泛型类型的时候，用＜？＞来表示：？是通配符，也就是占位符。


２、泛型限定：　
？　ｅｘｔｅｎｄｓ　Ｅ　：　上限，可以接受Ｅ类型或者Ｅ的子类型。

？　ｓｕｐｅｒ　Ｅ　：　下限，可以接受Ｅ类型或者Ｅ的父类型。


	// 泛型限定了继承Book所有子类 包括Book
		public static void getAllSale(ArrayList<? extends Book> list) {
			Iterator<? extends Book> it = list.iterator();
			while (it.hasNext()) {
				System.out.print("  " + it.next().getSale());
			}
		}

##Map

###基本概念

１、Ｍａｐ集合存储的是键值对。成对出现，而且要保证键的唯一性。

２、子类对象特点：
Ｈａｓｈｔａｂｌｅ：地产呢过是哈希表数据结构，不可以存入空键空值，该集合是线程同步的。效率低。
ＨａｓｈＭａｐ：底层是哈希表数据结构，可以存入空键空值，集合不同步。效率高。
ＴｒｅｅＭａｐ：底层是二叉树数据结构，线程不同步，可以用与给Ｍａｐ中的键进行排序。

３、Ｓｅｔ底层使用的就是Ｍａｐ集合。

４、两种取出方式：ｋｅｙＳｅｔ、ｅｎｔｒｙＳｅｔ。


###基本方法

１、添加元素

	V	put(K key, V value) 
	          将指定的值与此映射中的指定键关联（可选操作）。

	void	putAll(Map<? extends K,? extends V> m) 
	          从指定映射中将所有映射关系复制到此映射中（可选操作）。

当添加相同键的时候，会一直覆盖原有键对应的值。

２、删除元素

	void	clear() 
	          从此映射中移除所有映射关系（可选操作）。

	V	remove(Object key) 
	          如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。

３、判断元素

	boolean	containsKey(Object key) 
	          如果此映射包含指定键的映射关系，则返回 true。

	boolean	containsValue(Object value) 
	          如果此映射将一个或多个键映射到指定值，则返回 true。

	boolean	isEmpty() 
	          如果此映射未包含键-值映射关系，则返回 true。

其实也可以通过ｇｅｔ方法的返回值ｎｕｌｌ来判断一个键是否存在。

４、获取元素

	V	get(Object key) 
	          返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。

	int	size() 
	          返回此映射中的键-值映射关系数。

	Collection<V>	values() 
	          返回此映射中包含的值的 Collection 视图。

###两种取出方式

１、ｋｅｙＳｅｔ：将Ｍａｐ中所有的键存入到Ｓｅｔ集合，因为Ｓｅｔ具备迭代器，可以取出所有的键，再根据ｇｅｔ方法可以获取每一个键所对应的值。

	Set<K>	keySet() 
	          返回此映射中包含的键的 Set 视图。

步骤：１、先获取Ｍａｐ中所有的键的Ｓｅｔ集合；
２、然后通过Ｓｅｔ中的迭代器方法，获取到所有的键的值；
３、通过键值来得到所有键值对应的值

	public static void main(String[] args) {
			// new出子类对象
			Map<String, String> map = new HashMap<String, String>();
	
			// 添加元素 注意 不是add方法
			map.put("1", "xia");
			map.put("22", "rui");
			map.put("333", "xiarui");
			map.put("4444", "iamxiarui");
	
			// 先获取所有键的Set集合
			Set<String> keySet = map.keySet();
	
			// 得到Set集合的迭代器
			Iterator<String> it = keySet.iterator();
	
			// 通过迭代器 获取到所有的键的值
			while (it.hasNext()) {
				String keyStr = it.next();
				// 通过键的值获取到所有的键值
				String nameStr = map.get(keyStr);
				System.out.println("key --- " + keyStr + " name --- " + nameStr);
			}
		}


２、ｅｎｔｒｙＳｅｔ（）将Ｍａｐ集合中的映射关系取出放入Ｓｅｔ集合。
	Set<Map.Entry<K,V>>	entrySet() 
	          返回此映射中包含的映射关系的 Set 视图。

步骤：１、将Ｍａｐ集合中的映射关系取出，存入Ｓｅｔ集合中。

２、然后通过Ｓｅｔ中的迭代器方法，获取到所有的键的值；

３、再通过映射关系中的方法得到键值对。

	K	getKey() 
	          返回与此项对应的键。
	V	getValue() 
	          返回与此项对应的值。


示例代码：

	public static void main(String[] args) {
			// new出子类对象
			Map<String, String> map = new HashMap<String, String>();
	
			// 添加元素 注意 不是add方法
			map.put("1", "xia");
			map.put("22", "rui");
			map.put("333", "xiarui");
			map.put("4444", "iamxiarui");
	
			// 先获取所有键值映射的关系的Set集合
			Set<Map.Entry<String, String>> entrySet = map.entrySet();
	
			// 得到Set集合的迭代器
			Iterator<Map.Entry<String, String>> it = entrySet.iterator();
	
			// 通过迭代器 获取到所有的键值关系
			while (it.hasNext()) {
				Map.Entry<String, String> mapStr = it.next();
				// 通过键值关系集合的方法 获取到所有的键 和 值
				String numStr = mapStr.getKey();
				String nameStr = mapStr.getValue();
				System.out.println("key --- " + numStr + " name --- " + nameStr);
			}
		}

###ＴｒｅｅＭａｐ

需要自定义比较器，并实现比较器的接口：

	TreeMap<Student, String> tm = new TreeMap<Student, String>(new StudentCom());
	
	．．．
	
	// 添加自定义比较器
	
	class StudentCom implements Comparator<Student> {
	
		@Override
		public int compare(Student s1, Student s2) {
			// 按照姓名排序
			int num = s1.getName().compareTo(s2.getName());
	
			if (num == 0) {
				return new Integer(s1.getAge()).compareTo(s2.getAge());
			}
			return num;
		}
	
	}

当数据之间存在着映射关系时，就可以使用Ｍａｐ集合。

###Ｍａｐ扩展

集合里面可有装有集合，也就是一对多的映射关系。

示例代码：

		// 第一个小集合
		HashMap<Integer, String> hm_one = new HashMap<Integer, String>();
		hm_one.put(01, "xia");
		hm_one.put(02, "rui");

		// 第二个小集合
		HashMap<Integer, String> hm_two = new HashMap<Integer, String>();
		hm_two.put(01, "xiarui");
		hm_two.put(02, "iamxiarui");

		// 两个集合的大集合
		HashMap<String, HashMap<Integer, String>> hm = new HashMap<String, HashMap<Integer, String>>();
		hm.put("物联网一班", hm_one);
		hm.put("物联网二班", hm_two);


##Ｃｏｌｌｅｃｔｉｏｎｓ

Ｃｏｌｌｅｃｔｉｏｎｓ是Ｃｏｌｌｅｃｔｉｏｎ的子类。

###重点方法：

１、ｓｏｒｔ　：　排序

	static 	sort(List<T> list) <T extends Comparable<? super T>> 	          
		根据元素的自然顺序 对指定列表按升序进行排序。

	void public static <T extends Comparable<? super T>> void sort(List<T> list)
	根据元素的自然顺序 对指定列表按升序进行排序。列表中的所有元素都必须实现 Comparable 接口。此外，列表中的所有元素都必须是可相互比较的

注意：此方法不能给Ｓｅｔ排序。

	static 	sort(List<T> list, Comparator<? super T> c) <T> void	          
		根据指定比较器产生的顺序对指定列表进行排序。

	public static <T> void sort(List<T> list, Comparator<? super T> c)　
	根据指定比较器产生的顺序对指定列表进行排序。此列表内的所有元素都必须可使用指定比较器相互比较

示例代码：

	public static void main(String[] args) {
			List<String> list = new ArrayList<String>();
	
			list.add("asd");
			list.add("fgafg");
			list.add("afvcxzv");
			list.add("sthhgn");
			list.add("ghahfn");
	
			sop("排序前 ：");
			sop(list);
	
			// 直接调用其静态方法
			Collections.sort(list);
			sop("排序后 ：");
			sop(list);
	
			// 加入比较器的静态方法
			Collections.sort(list, new CollectionsCom());
			sop("按照字符串长度排序后 ：");
			sop(list);
	
		}

２、ｍａｘ　　ｍｉｎ　：　返回指定元素

	static 	max(Collection<? extends T> coll) <T extends Object & Comparable<? super T>> 	          
	根据元素的自然顺序，返回给定 collection 的最大元素。

	T static max(Collection<? extends T> coll, Comparator<? super T> comp) <T> T	  
	根据指定比较器产生的顺序，返回给定 collection 的最大元素。

	static 	min(Collection<? extends T> coll) <T extends Object & Comparable<? super T>> 	          
	根据元素的自然顺序 返回给定 collection 的最小元素。

	T static min(Collection<? extends T> coll, Comparator<? super T> comp) <T> T根据指定比较器产生的顺序，返回给定 collection 的最小元素。

实例代码：

		// 返回最大元素
		String max_one = Collections.max(list);
		sop("最大元素为 ： " + max_one);

		// 返回带比较器的最大元素
		String max_two = Collections.max(list, new CollectionsCom());
		sop("最大长度元素为 ： " + max_two);

３、利用二分查找法，找出指定元素：

	static 	binarySearch(List<? extends Comparable<? super T>> list, T key) <T> int使用二分搜索法搜索指定列表，以获得指定对象。

	static 	binarySearch(List<? extends T> list, T key, Comparator<? super T> c) <T> int	          
	使用二分搜索法搜索指定列表，以获得指定对象。

实例代码：

	// 加入比较器的二分查找
	public static int getBinarySearch(List<String> list, String key, Comparator<String> com) {
		int max, mid, min;
		max = list.size() - 1; // 元素的最大长度
		min = 0;

		while (min <= max) {
			mid = (max + min) >> 1; // >>1 相当于 /2

			String str = list.get(mid);

			int num = com.compare(str, key);
			if (num > 0) {
				max = mid - 1; // 中间值大于需要找的值 左移最大值
			} else if (num < 0) {
				min = mid + 1; // 中间值小于需要找的值 右移最小值
			} else
				return mid; // 中间位置直接找到

		}
		return -min - 1; // 返回 (-(插入点) - 1)。插入点 ：即第一个大于此键的元素索引；
	}

４、逆转集合中的元素的顺序

	static void	reverse(List<?> list) 
	          反转指定列表中元素的顺序。

	static 	reverseOrder() <T> Comparator<T>	          
	返回一个比较器，它强行逆转实现了 Comparable 接口的对象 collection 的自然顺序。

	static 	reverseOrder(Comparator<T> cmp) <T> Comparator<T>	          
	返回一个比较器，它强行逆转指定比较器的顺序。

示例代码：

	// 添加比较器的逆转
	TreeSet<String> ts2 = new TreeSet<String>(Collections.reverseOrder(new CollectionsCom_three()));

５、线程安全的集合

	static 	synchronizedList(List<T> list) <T> List<T>	          
	返回指定列表支持的同步（线程安全的）列表。
	
	static 	synchronizedMap(Map<K,V> m) <K,V> Map<K,V>	          
	返回由指定映射支持的同步（线程安全的）映射。
	
	static 	synchronizedSet(Set<T> s) <T> Set<T>	          
	返回指定 set 支持的同步（线程安全的）set。


###Ａｒｒａｙｓ

操作数组的工具类，全部都是静态方法。

１、把数组变成Ｌｉｓｔ集合

	static 	asList(T... a) <T> List<T>	         
	返回一个受指定数组支持的固定大小的列表。

	Ｌｉｓｔ＜Ｓｔｒｉｎｇ＞　ｌｉｓｔ　＝　Ａｒｒａｙｓ．ａｓＬｉｓｔ（ａｒｒ）；

好处：可以使用集合的思想和方法来操作数组中的元素。

>>注意：１、将数组变成集合后，不可以使用集合的增删方法，因为数组的长度是固定的。否则会报ＵｎｓｕｐｐｒｏｔｅｄＯｐｅｒａｔｉｏｎＥｘｃｅｐｔｉｏｎ异常。

>>２、如果数组中的元素都是对象，那么变成集合的时候，数组中的元素就直接转成集合中的元素；如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在。


２、集合转换成数组

	Object[]	toArray() 
	          返回包含此 collection 中所有元素的数组。

	<T> T[]	toArray(T[] a) 
	          返回包含此 collection 中所有元素的数组；返回数组的运行时类型与指定数组的运行时类型相同。

>>注意：１、当指定类型的数组长度小于集合的长度，该方法内部会创建一个新的数组，长度为集合的长度。当指定类型的数组长度大于集合的长度，就不会新建数组，而是使用传递进来的数组。所以创建一个刚好的数组最优。

>>２、集合变成数组的好处：限定了对元素的操作。


















