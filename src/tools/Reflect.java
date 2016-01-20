package tools;

import java.lang.reflect.Field;

import javax.swing.JLabel;

/**
 * ����
 */
public class Reflect {
	public static void setAllComponentsName(Object f) {
		// ��ȡf�����Ӧ���е�����������
		Field[] fields = f.getClass().getDeclaredFields();
		for (int i = 0, len = fields.length; i < len; i++) {
			// ����ÿ�����ԣ���ȡ������
			String varName = fields[i].getName();
			try {
				// ��ȡԭ���ķ��ʿ���Ȩ��
				boolean accessFlag = fields[i].isAccessible();
				// �޸ķ��ʿ���Ȩ��
				fields[i].setAccessible(true);
				// ��ȡ�ڶ���f������fields[i]��Ӧ�Ķ����еı���
				Object o = fields[i].get(f);
				String className = fields[i].getType().getName();
				// ȥ������
				className = className
						.substring(className.lastIndexOf(".") > 0 ? className
								.lastIndexOf(".") + 1 : 0);

				System.out.println("����Ķ����а���һ�����µı�����" + varName + " = " + o
						+ "  ���ͣ�" + className + " ����Ȩ��" + accessFlag);
				// �ָ����ʿ���Ȩ��
				fields[i].setAccessible(accessFlag);
			} catch (IllegalArgumentException ex) {
				ex.printStackTrace();
			} catch (IllegalAccessException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// ���Դ���������ȡһ��JLabel�����������е��������������Ա���
		setAllComponentsName(new JLabel("����"));
	}
}
