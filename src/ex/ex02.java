package ex;
import java.util.*;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021030 張廷毓
 */
public class ex02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<data> studList=new ArrayList<data>();
		studList.add(new data("ruby","1052"));
		studList.add(new data("ozpin","3581"));
		studList.add(new data("neo","8975"));
		System.out.print("請依序輸入三個成績:");
		for(int i=0;i<3;i++){
		studList.get(i).setCh(sc.nextInt());
		studList.get(i).setEng(sc.nextInt());
		studList.get(i).setMath(sc.nextInt());
		studList.get(i).setAvg();
		}
		float data[]=new float[3];
		float tmp;
		for(int i=0;i<3;i++){
			data[i]=studList.get(i).getAvg();
		}
		for(int i=0;i<3-1;i++){
			for(int j=0;j<3-1-i;j++){
				if(data[j]<data[j+1]){
					tmp=data[j];
					data[j]=data[j+1];
					data[j+1]=tmp;
				}
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(data[i]==studList.get(j).getAvg())
					studList.get(j).showInfo();
			}
		}
	}
}
class data{
private String id,name;
private int ch,eng,math;
private float avg;
	public data(String id1,String name1){
		id=id1;
		name=name1;
	}
	public void setCh(int ch1){
		ch=ch1;
	}
	public int getCh(){
		return ch;
	}
	public void setEng(int eng1){
		eng=eng1;
	}
	public int getEng(){
		return eng;
	}
	public void setMath(int math1){
		math=math1;
	}
	public int getMath(){
		return math;
	}
	public void setAvg(){
		avg=(ch+eng+math)/3f;
	}
	public float getAvg(){
		return avg;
	}
	public void showInfo(){
		System.out.println(id+"\t"+name+"\t"+ch+"\t"+eng+"\t"+math+"\t"+avg);
	}	
}