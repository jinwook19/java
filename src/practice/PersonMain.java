package practice;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ����,����,�ʱ�ȭ
		// ����
		PersonClass person1;
		
		// ����
		person1 = new PersonClass();
		
		// �ʱ�ȭ
		person1.age=10;
		person1.name="jinwook";
		
		System.out.println(person1.age);
		
		//2. ����� ����, �ʱ�ȭ
		// ����� ����
		PersonClass person2 = new PersonClass();
		
		// �ʱ�ȭ
		person2.age=20;
		person2.name="south";
		
		System.out.println(person2.age);
		
		//3. ����� ������ �ʱ�ȭ
		PersonClass person3 = new PersonClass(30,"seoul");
		System.out.println(person3.age);
		
		
		//4. ����� ������ �ʱ�ȭ 2
		PersonClass person4 = new PersonClass(40);
		System.out.println(person4.age);
		
		
	}

}
