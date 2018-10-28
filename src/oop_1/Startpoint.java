package oop_1;

public class Startpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a =10;
		int b= 20;
		 a=b;
		b=100;*/
		
		Person person1 = new Person();
		person1.setFirstName("Md");
		person1.setMiddlename("nasir");
		person1.setLastname("uddin");
		String person1FllName = person1.getFullName();
		
		Person person2 = new Person();
		
		person2.setFirstName("Mehedi");
		person2.setMiddlename("Hasan");
		person2.setLastname("Shouvo");
		String person2FllName = person2.getFullName();
		//person2= person1;
		//person1 = null;
		
		
		Person person3 = new Person();
		
		person3.setFirstName("Md");
		person3.setMiddlename("Mahmudul");
		person3.setLastname("hasan");
		String person3FllName = person3.getFullName();
		
		
		int num[] =new int [3];
		Person persons [] = new Person[3];
		persons[0] = person1;
		persons[1] = person2;
		persons[2] = person3;
		
		for(Person aperson : persons) {
			
			System.out.println(aperson.getFullName());
		}
		
		
		
		
		
		

	}

}
