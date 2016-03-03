package xr_collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map �����е�keySet������ʹ��
 * 
 * */
public class MapKeySetTest {

	public static void main(String[] args) {
		// new���������
		Map<String, String> map = new HashMap<String, String>();

		// ���Ԫ�� ע�� ����add����
		map.put("1", "xia");
		map.put("22", "rui");
		map.put("333", "xiarui");
		map.put("4444", "iamxiarui");

		// �Ȼ�ȡ���м���Set����
		Set<String> keySet = map.keySet();

		// �õ�Set���ϵĵ�����
		Iterator<String> it = keySet.iterator();

		// ͨ�������� ��ȡ�����еļ���ֵ
		while (it.hasNext()) {
			String keyStr = it.next();
			// ͨ������ֵ��ȡ�����еļ�ֵ
			String nameStr = map.get(keyStr);
			System.out.println("key --- " + keyStr + " name --- " + nameStr);

		}
	}

}
