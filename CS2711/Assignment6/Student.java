public class Student{
	private int studentNum;
	private String name;
	private double gpa;
	public Student(int s, String n, double g){
		studentNum=s;
		name=n;
		gpa=g;
	}
	public int getStudentNum(){
		return studentNum;
	}
	public String getName(){
		return name;
	}
	public double getGPA(){
		return gpa;
	}
}