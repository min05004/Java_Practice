package section14;

/*
 * 버블 정렬
 * 인접한 두개의 수를 비교해서 뒤로보냄.
 * -가장 큰게 뒤로 오게 됨.
 * 
 * 뒤에있는 i 값 : 제일 큰 값이 올 위치가 i
 * ->범위 : 배열 끝~0
 * 
 * j : 비교할 인덱스
 * -> 범위 ; 0~i
 * 
 * 
 * 
 */
public class Sort03 {
	public static void main(String[] args) {
		int ar[] = { 6, 4, 7, 9, 1 };
		int tmp;
		System.out.println("====== 정렬 전=======");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
		for (int i = ar.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (ar[j] > ar[j + 1]) {
					tmp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = tmp;
					// 정렬 과정
					for (int k = 0; k < ar.length; k++) {
						System.out.print(ar[k] + " ");
					}
					System.out.println();
				}

			}
		}
		System.out.println("===== 정렬 후 =====");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();

	}
}