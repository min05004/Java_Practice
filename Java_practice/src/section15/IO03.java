package section15;

import java.io.*;

/*
 * 객체 직렬화
 * 바이트 단위로 분해
 * 순서에 따라 데이터 전송
 * 전송받은 데이터를 복구
 * 
 * 마샬링 : 데이터를 바이트 단위의 데이터로 변환시키는 작업
 * ObjectOutputStream
 * 기본자료형 
 * Serializable - 인터페이스 구현해야함
 * 
 * 언마샬링 : 객체 스트림을 통해 전달된 바이트 단위의 데이터를 원래의 객체로 복구하는 작업
 * ObjectInputStream
 * 어떤객체 형태로 복구할지 형 변환 명시!
 * 
 * 
 * 
 */
public class IO03 {
	public static void main(String[] args) throws IOException, Exception {

		ms();
		ums();

	}

	public static void ms() {
		try {
			FileOutputStream fos = new FileOutputStream("User.ser");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream out = new ObjectOutputStream(bos);

			User user1 = new User("test", "1234", "가길동");
			out.writeObject(user1);
			out.close(); // 닫아주기!!

			System.out.println("객체 직렬화 완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void ums() throws IOException, Exception {
		FileInputStream fis =new FileInputStream("user.ser");
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream in = new ObjectInputStream(bis);
		
		User user2 = (User)in.readObject();
		user2.toString(); //해당 객체 정보 출력
		in.close();
		System.out.println(user2.toString());
		System.out.println("객체 복원 완료");
	}
}

class User implements Serializable {
	private String id;
	private String pw;
	private String name;

	public User(String id, String pw, String name) {

		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}

}