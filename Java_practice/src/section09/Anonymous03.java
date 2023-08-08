package section09;

public class Anonymous03 {
	public static void main(String[] args) {
		Abstract ab = new Abstract() {

			@Override
			void f2() {
					System.out.println("abstract extends f2()");				
						//추상클래스는 상속
			}
			};
			ab.f2();
}
}
abstract class Abstract{
	abstract void f2();
}
