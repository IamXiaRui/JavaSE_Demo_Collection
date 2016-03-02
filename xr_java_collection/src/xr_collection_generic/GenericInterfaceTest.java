package xr_collection_generic;

/*
 * �Զ��巺�ͽӿ�
 * 
 * 
 * */
public class GenericInterfaceTest {

	public static void main(String[] args) {
		// ������ж��ֲ�ͬ�ķ���
		GenericInterface<String> gi_one = new GenericInterface<String>();

		gi_one.show("123");

		GenericInterface<Integer> gi_two = new GenericInterface<Integer>();

		gi_two.show(123);
	}
}

// ����ӿڵķ���
interface Intet<T> {
	void show(T t);
}

// ��ʵ�ֽӿ� ���Զ��巺��
class GenericInterface<T> implements Intet<T> {

	@Override
	public void show(T t) {
		System.out.println("show --- " + t);
	}

}
