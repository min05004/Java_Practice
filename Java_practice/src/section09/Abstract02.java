package section09;

public class Abstract02 {
	public static void main(String[] args) {
		
	Pokemon pokemon = new Pikachu(); // 자식클래스의 값이 부모클래스에 대입 업캐스팅
	System.out.println("이 포켓몬은 : "+ pokemon.getName());
	pokemon.attack();
	pokemon.sound();
	
	pokemon = new Kobuk(); //같은 명령임에도 불구하고 들어있는 값이 무엇이가에 따라서 다른 동작을 하고 있는것 다형성!! 
	System.out.println("이 포켓몬은 : "+ pokemon.getName());
	pokemon.attack();
	pokemon.sound();
	
	}

}
abstract class Pokemon {
	String name;
	abstract void attack();
	abstract void sound();
	public String getName() {
		return this.name;
	}
	
}
class Pikachu extends Pokemon{
	Pikachu(){
		this.name="피카츄";
	}
	@Override
	void attack() {
		System.out.println("전기공격");
		
	}

	@Override
	void sound() {
		System.out.println("피카아아아");
		
	}
	
}

class Kobuk extends Pokemon{

	Kobuk(){
		this.name="꼬부기";
	}
	@Override
	void attack() {
		System.out.println("물대포");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북꼬북!");
		
	}
	
}