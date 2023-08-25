package section14;

/*
 * 삽입 정렬
 * 
 * 현재 위치 :i ,비교위치 j
 * 1) 삽입정렬은 두번째 인덱스 부터 시작 : i=1
 * 2)현재 인덱스는 별도의 변수에 저장  idx =i
 * 3)비교 인덱스 =현재 인덱스 -1   j=i-1
 * 4)인덱스값<비교인덱스갑 :    idx <-> j
 * 
 * 
 * 
 */
public class Sort02 {
	public static void main(String[] args) {
		int ar[] = { 8, 1, 2, 5, 4, 3, 6, 7 };
		int idx, tmp;
		System.out.println("=========정렬 전===========");

		for (int i = 1; i < ar.length; i++) {
			idx = i;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[j] > ar[idx]) {
					tmp = ar[j];
					ar[j] = ar[idx];
					ar[idx] = tmp;
					idx = j;
					// 중간중간 정렬이 어떻게 진행이 되고 있는지 확인해보기
					for (int k = 0; k < ar.length; k++) {
						System.out.print(ar[k] + " ");
					}
					System.out.println();
				} else {
					break;
				}
			}
		}
		System.out.println("========정렬 후========");

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");

		}
	}

}
