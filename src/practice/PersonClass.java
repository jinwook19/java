package practice;

public class PersonClass {
	int age;
	String name;

	public PersonClass() {
		System.out.println("---Ŭ��������---");
	}
	

	public PersonClass(int age, String name) {
		System.out.println("---Ŭ���� ����� ������ �ʱ�ȭ---");
		this.age = age;
		this.name = name;
	}
	
	public PersonClass(int age) {
		System.out.println("---Ŭ���� ����� ������ �ʱ�ȭ 2---");
		this.age = age;
	}

}
