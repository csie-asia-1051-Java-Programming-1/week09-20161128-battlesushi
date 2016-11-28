package ex;
import java.util.*;
/*
 * Topic: 請設計一樂透亂數選號程式，由 1~42 中選出 6個不重覆的數字組合並輸出。 請使用已下方式,(setSeed就是設定亂數種子，可以使每次跑出的亂數序列，都會是一樣的)
 例如:輸入 23323456會得到 39  17  32  13  41  15 
	Random randnum = new Random();
	randnum.setSeed(23323456)
 * Date: 2016/11/28
 * Author: 105021030 張廷毓
 */
public class ex01 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Random randnum= new Random();
			int a=sc.nextInt();
			randnum.setSeed(a);
			int data[]=new int[6];
			boolean flag=false;
			int i=0,j;
			while(i<6){
				data[i]=randnum.nextInt(42)+1;
				j=i-1;
				while(flag==false&&j>=0){
					if(data[i]==data[j]){
						flag=true;
					}
					j--;
				}
				if(flag==false)
					i++;
			}
			
			for(int k=0;k<6;k++){
				System.out.print(data[k]+"  ");
			}
			
			
			
		}
}

