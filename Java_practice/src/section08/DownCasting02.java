package section08;

import section08.Animal.ZooKeeper;

public class DownCasting02 {
	public static void main(String[] args) {
		//Animal lion= new Lion();
		//Animal rabbit= new Rabbit();
		//Animal moinkey= new Monkey();
		 
		
		//ZooKeeper james = new ZooKeeper();
		//james.feed(lion);
	
		
	}

}
class Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
	class Lion extends Animal{
		public String toString(){
			return"사자";
		}
	}
	class Rabbit extends Animal{
		public String toString(){
			return"토끼";
		}
	}
	class Monkey extends Animal{
		public String toString(){
			return"원숭이";
		}
	}
	class ZooKeeper{
	void feed(Animal animal) {
		System.out.println(animal + " 에게 먹이주기");
	}
	}
}