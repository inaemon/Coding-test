package baekjoon;

import java.util.Scanner;

// 백준 곱셈
// https://www.acmicpc.net/problem/2588
public class Main02Operation2{
	public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   int num1;
	   int num2;
	   int temp;
	   int multif;
	   
	   num1 = input.nextInt();
	   num2 = input.nextInt();
	   multif = 0;
	   
	   /*
	    * i=10		: num2의 1의 자리를 (10으로 나눈 나머지를) num1의 모든 자릿수와 곱
	    * i=100		: num2의 10의 자리를 (100으로 나눈 나머지를) num1의 모든 자릿수와 곱
	    * i=1000	: num2의 100의 자리를 (1000으로 나눈 나머지를) num1의 모든 자릿수와 곱
	    */
	   for(int i=10; i<10000; i*=10) {		// 세 자리 수라서 1의 자리, 10의 자리, 100의 자리
		   temp = num1 * (num2%i/(i/10));	// num1에 num2의 i/10의 자리를 곱
		   multif += temp*i/10;
		   
		   // (num2%i)			: 해당 자릿수 이하 모든 수
		   // (num2%i/(i/10)	: 딱 해당 자릿수만
//		   System.out.println(num2%i+"  "+num2%i/(i/10));
		   System.out.println(temp);
	   }
	   System.out.println(multif);
	}
}