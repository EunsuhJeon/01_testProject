package com.kh.first;

public class PrintTest {

	// ��¹� �ǽ�
	public static void main(String[] args) {
		
		System.out.println("println�� �ٹٲ�");
		
		System.out.print("print�� �ٹٲ� x"); // ���ڿ�(����)�� ���� �ֵ���ǥ�� ���´�
		
		System.out.print(12345); // ������ ���� �׳� �����ش�
		
		System.out.print('A'); // ����(�� ����)�� ���� Ȭ����ǥ�� ���´�
		
		// �ٹٲ��� �ϰ������ print ���� ����ϴ� ��쿡��?
		System.out.print("�ٹٲ��� �ϰ�;�!\n");
		System.out.print("�ٹٲ� ������!\n");
		System.out.print(12345+"\n");
		System.out.print('A'+"\n");
		
		
		// \n : ���๮��, �ٹٲ� �����ִ� ����, �� ���� Ű�� ������ �Ͱ� ����.
		// ����+����, ����+���ڿ�, ����+���ڿ��� ���� ���� �ٸ� ���¸� �ٿ��� ��Ÿ���ִ� ��ȣ�� '+'
		// ����(����ǥ ����),����(��������ǥ)���� ���� +"\n" �� ���� ���·� �ۼ����ش�.
		
		
		System.out.print("Hi\n");
		System.out.print("everyone!!\n");
		System.out.print("Hi\neveryone!!\n");
		
		System.out.print("\\n");
		// '\n'�̶�� �ؽ�Ʈ ��ü�� ����ϰ� ���� ��� ���� ���� �ۼ��Ѵ�.
		
		System.out.print(123+"\n"+456+"\n");
		
		System.out.println("\\"); // �������ô� �� ��ü�����δ� ���ڷ� �ν��� ���� �ʱ� ������ ���ڷ� �ν��ϰ� ���� ���� �������ø� �� �� �� ���ش�.
		
	}
}
