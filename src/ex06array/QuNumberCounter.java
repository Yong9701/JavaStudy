package ex06array;

public class QuNumberCounter {
	/*
	 문제1)다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각 정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.
	 샘플코드]
		 int[] answer = { 1,4,4,3,1,4,4,2,1,3,2};
		 int[] counter = new int[4];
	 */
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		// answer 배열의 각 원소를 읽어서 counter 배열에 카운트
        for (int i = 0; i < answer.length; i++) {
            int num = answer[i];
            counter[num - 1]++;
        }

        // 결과 출력
        for (int i = 0; i < counter.length; i++) {
            System.out.printf("count[%d] => %d\n", i, counter[i]);
        }
	}

}
