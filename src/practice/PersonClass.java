package practice;

public class PersonClass {
	int age;
	String name;

	public PersonClass() {
		System.out.println("---클래스생성---");
	}
	

	public PersonClass(int age, String name) {
		System.out.println("---클래스 선언과 생성과 초기화---");
		this.age = age;
		this.name = name;
	}
	
	public PersonClass(int age) {
		System.out.println("---클래스 선언과 생성과 초기화 2---");
		this.age = age;
	}

}
