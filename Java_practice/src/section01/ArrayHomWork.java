package section01;
/*
 * 
 * 숙제 7*7
 * 
 * 
 * 1.2중배열 선언하고
 * 2.for 문으로 1~49 까지 대입하기.
 * 3.출력 순서 지그재그( 1 2 8 15 9 3 ... 순서가 중요!)
 * 
 * 

 1  2  3  4  5  6  7
 8  9  10 11 12 13 14
 15 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30 31 32 33 34 35
 36 37 38 39 40 41 42
 43 44 45 46 47 48 49
 
 1. 2중배열 선언하고
 2. for문으로 1~49까지 대입하기
 3. 아래 모양으로 출력하기!!!!!!!!!!!!!!

1
2 8
15 9 3
4 10 16 22
29 23 17 11 5
6 12 18 24 30 36
43 37 31 25 19 13 7
14 20 26 32 38 44
45 39 33 27 21
28 34 40 46
47 41 35
42 48
49
 
 * 
 */
public class ArrayHomWork {
	public static void main(String[] args) {
		
		/*int nums[][] = {
					{1 , 2 , 3 , 4 , 5 , 6 , 7},
					{8 , 9 , 10 ,11, 12 ,13, 14},
					{15, 16, 17, 18, 19, 20, 21},
					{22, 23, 24, 25, 26, 27, 28},
					{29, 30, 31, 32, 33, 34, 35},
					{36, 37, 38, 39, 40, 41, 42},
					{43, 44, 45, 46, 47, 48, 49},
			
					};
		
		for(int i =0; i <nums.length; i++) {
			if(i%2!=0) { 
//				for(int )
				System.out.println();
			} else {
			
			for(int j=0; j <nums[i].length; j++) {
				System.out.print(nums[i][j]+" "); 
	}
			System.out.println();
	}
	}
	}
}
	
			
*/
		
		int[][]ar = new int[7][7];
		int num = 1 ;
		for(int i =0; i< ar.length; i++) {
			for(int j =0; j<ar[0].length; j++) {
				ar[i][j] = num;
				System.out.print(ar[i][j]+" ");
				num++;
			}
			System.out.println();
		}
			
	}
	}	
		


