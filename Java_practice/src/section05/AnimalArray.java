package section05;

public class AnimalArray {
	public static void main(String[] args) {
		Animal animal [] = new Animal[3];
		for(int i=0; i<3; i++) {
			animal[i]= new Animal();
		}
		
		animal[0].kind ="고양이";
		animal[0].name ="나르";
		animal[0].age =1;

		animal[1].kind ="강아지";
		animal[1].name ="초코";
		animal[1].age =3;
		
		animal[2].kind ="고양이";
		animal[2].name ="니코";
		animal[2].age =1;
		
		
		for(int i=0; i<3;i++)
		{
			animal[i].info();
		}
	}

}

	class Animal {
		String kind;
		String name;
		int age;
		void info() {
			System.out.println("kind : "+kind);
			System.out.println("name : "+name);
			System.out.println("age : "+age);
		}
		
		
	}