package baekjoon;

import java.util.Scanner;

// 백준 나머지
// https://www.acmicpc.net/problem/10430
public class Main02Operation3{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   int A, B, C;
	   int result;
	   
	   A = input.nextInt();
	   B = input.nextInt();
	   C = input.nextInt();
	   
	   result = (A+B)%C;
	   System.out.println(result);
	   
	   result = ((A%C) + (B%C))%C;
	   System.out.println(result);
	   
	   result = (A*B)%C;
	   System.out.println(result);
	   
	   result = ((A%C) * (B%C))%C;
	   System.out.println(result);
	}
}