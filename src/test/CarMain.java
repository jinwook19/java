package test;

import practice.PersonClass;

public class CarMain {

	public static void main(String[] args) {
		//1. ����,����,�ʱ�ȭ
		// ����
		CarClass car1;
		// ����
		car1 = new CarClass();
		// �ʱ�ȭ
		car1.color="�Ķ���";
		car1.modelname="�׷���";
		car1.size="����";
		car1.weight=2000;
		
		System.out.println(car1.color + car1.modelname + car1.size + car1.weight);
		//2. ����� ����, �ʱ�ȭ
		//����� ����
		CarClass car2 = new CarClass();
		//�ʱ�ȭ
		car2.color="�Ķ���";
		car2.modelname="�׷���";
		car2.weight=3000;
		
		System.out.println(car2.color);
		//3. ����� ������ �ʱ�ȭ
		CarClass car3 = new CarClass("������","����","�׷���",2000);
		System.out.println(car3.color);
	}


}
