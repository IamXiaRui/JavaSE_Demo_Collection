package xr_collection_generic;

/*
 * ���ͷ����Ķ���
 * 
 * */
public class GenericMethodTest {

	public static void main(String[] args) {
		GenericMethod<String> gm = new GenericMethod<String>();

		gm.getB("5");

		gm.getC(5);
		gm.getC("5");

		gm.getD(5);
		gm.getD("5");
	}

}

// �����Ѿ������˷���
class GenericMethod<B> {

	// ������û�ж��巺�� �������ȷ������
	public void getB(B b) {
		System.out.println("B --- " + b);
	}

	// �������Ѿ������˷��� ���ݷ���������
	public <C> void getC(C c) {
		System.out.println("C --- " + c);
	}

	// ��̬���� �����Զ��巽������ ���ܸ������ϵķ���
	public static <D> void getD(D d) {
		System.out.println("D --- " + d);
	}
}
