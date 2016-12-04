package hw;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Topic: 設計Student與Course 兩個 class，Student Class包含下列資訊:
 * 學號、姓名與課程(Course)，Course的class包含 課程名稱、課程代號、課程分數、授謀老師、學分數，
 * 並於主程式讓使用者輸入學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 105021030 張廷毓
 */
public class hw03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> studList=new ArrayList<Student>();
		studList.add(new Student("105066","david"));
		studList.get(0).addCourse("103","程式","周老師");
		studList.get(0).addCourse("213","機率","呂老師");
		
		studList.add(new Student("168386","jason"));
		studList.get(1).addCourse("103","程式","周老師");
		studList.get(1).addCourse("213","機率","呂老師");
		
		studList.add(new Student("172396","steve"));
		studList.get(2).addCourse("103","程式","周老師");
		studList.get(2).addCourse("213","機率","呂老師");
		
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
class Student{
private String id,name;
private ArrayList<Course> couList=new ArrayList<Course>();
	public Student(String id1,String name1){
		id=id1;
		name=name1;
	}
	public void showInfo(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(couList);
		for(int i=0;i<couList.size();i++){
			System.out.println("課程名稱:"+couList.get(i).getName() );
		}
	}
	public void addCourse(String id1,String name1,String teacher){
		couList.add(new Course(id1,name1,teacher));
		
	}
}
class Course{
private String couName,courseID,teacher;
private int score,credits;
private float avg;
	public Course(String id1,String name1,String teacher1){
		couName=name1;
		courseID=id1;
		teacher=teacher1;
	}
	public String getName(){
		return couName;
	}
	public void setCre(int cre){
		credits=cre;
	}
	public int getCre(){
		return credits;
	}
	public void setScore(int sco){
		score=sco;
	}
	public int getScore(){
		return score;
	}
	public void setAvg(int x,int y){
		avg=(x+y)/2f;
	}
	public float getAvg(){
		return avg;
	}
	
}
