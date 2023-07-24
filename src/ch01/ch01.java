package ch01;

import java.util.Scanner;

public class ch01 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		System.out.println(score);
		String result = (score >=60)? "합격":"불합격";
		System.out.println(score + "점은" + result + "불합격");
		System.out.println(score + "점은"
				+ ((score % 2 == 0) ? "짝수" : "홀수") + "입니다.");
		
		//짝수, 호수, 0인지 출력하기 -11%2 -> -1 -홀수는 0
		result = (score % 2 == 1) ? "홀수" : (score > 0) ? "짝수" : "0";
		System.out.println(score + "점은" + result + "입니다.");
	}

}
