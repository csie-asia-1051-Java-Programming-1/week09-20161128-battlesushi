package hw;
import java.util.Scanner;
/*
 * Topic:讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列
 * 讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 105021030 張廷毓
 */
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		fun(sc.nextInt());
	}
	public static void fun(int a) {
		int num=0,i=1;
		while(num<a){
			num=num+i;
			if(num<a)
			System.out.print(i+" + ");
			else if(num==a)
				System.out.print(i+" ="+a);
			else
				System.out.print(i+"  不等於"+a+"   No");
			i++;
		}
			
			
	}
}
