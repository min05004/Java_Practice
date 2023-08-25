package section15;

/*
 * 입출력의 모든 메서드는 IOException이 발생할 가능성이 높으므로 예외 처리가 필요하다.
 * 
 * 
 */
import java.io.*;

public class IO02 {
	public static void main(String[] args) {
		//파일 복사 프로그램
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br;
		BufferedWriter bw;
		
		try {
			fr = new FileReader("prac1.txt");
			fw = new FileWriter("result.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			//한 줄을 읽어 오겟다
			String line;
			while((line = br.readLine()) != null) {
				bw.write(line);
				
			}
			bw.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
