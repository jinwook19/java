package practice;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 識情,持失,段奄鉢
		// 識情
		PersonClass person1;
		
		// 持失
		person1 = new PersonClass();
		
		// 段奄鉢
		person1.age=10;
		person1.name="jinwook";
		
		System.out.println(person1.age);
		
		//2. 識情引 持失, 段奄鉢
		// 識情引 持失
		PersonClass person2 = new PersonClass();
		
		// 段奄鉢
		person2.age=20;
		person2.name="south";
		
		System.out.println(person2.age);
		
		//3. 識情引 持失引 段奄鉢
		PersonClass person3 = new PersonClass(30,"seoul");
		System.out.println(person3.age);
		
		
		//4. 識情引 持失引 段奄鉢 2
		PersonClass person4 = new PersonClass(40);
		System.out.println(person4.age);
		
		
	}

}
