package section14;

/*
 * 정렬
 * 1.선택정렬
 * 최소값 혹은 최대값을 선택해서 가장앞에다가 위치하여 선택할 위치를 이동하여 정렬하는 방법
 * 구현이 쉽다, 다른정력에 비해 오래 걸림.
 * 정렬되지않은 인덱스의 맨 앞에서 부터 이를 포함한 그 이후 값 중 가장 작은 값을 찾아간다.
 * 가장 작은 값을 찾으면 그 값을 현재 인덱스의 값과 바꿔준다.
 * 다음 인덱스로 이동하여 위 과정을 반복한다.
 * 
 * 2.삽입정렬
 * 
 * 3.버블정렬
 * 
 */
public class Sort {
	public static void main(String[] args) {
		int min, tmp;
		int ar[] = { 8, 1, 2, 5, 4, 3, 6, 7, };
		System.out.println("======정렬전=====");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			min = i;
			for (int j = i + 1; j < ar.length; j++) {// j값은 i의 다음 위치 부터 위치해 있음
				if (ar[min] > ar[j]) {
					tmp = ar[min];
					ar[min] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		System.out.println("======정렬후=====");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
