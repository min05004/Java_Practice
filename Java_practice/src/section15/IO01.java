package section15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * input / output
 * 
 * 프로그램에 데이터가 들어오고 나가는것.
 * 
 * Stream 스트림
 * 단 방향이다.(한쪽 방향으로)
 * FIFO구조 - 선입선출
 * 출력단위에 따라 바이트 기반과 문자단위로 분류된다.
 * 1byte 바이트 기반 - InputStream /OutputStream
 *  read() /입력
 *  write() / 출력
 *  
 *  대상에 따라서 적절한 스트림 활용가능.
 *  
 *  바이트 보조 기반 스트림.
 *  - 성능을 향상시키는 역할
 *  - Fiter , BufferedInputStream
 *  
 *  예)FileInputStream fis = null;
		fis = new FileInputStream("피일위치")
 *      BufferedInputStream bis = new BufferedInputStream(fis)
 * 
 * char 문자 기반 - Reader /Writer 
 *  
 * 
 */
public class IO01 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		fis = new FileInputStream("prac.txt"); // 예외를 발생시킬수 있기 때문에 오류처리를 해야함., 꼭 존재하는 파일과 연결
		fos = new FileOutputStream("result.txt"); // 존재하지않으면 파일 생성, 존재하면 파일 덮어쓰기.

		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int data;
		// 한 바이트씩 가지고 오는 작업을 반복하겠다. data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐때까지.
		while ((data = fis.read()) != -1) {
			// -1 : End of File 파일의 끝을 만나기 전까지 다 불러온다.

			bos.write(data);
		}
		//파일과의 연결을 닫는 작업
		
		bos.close();
		bis.close();

	}

}
