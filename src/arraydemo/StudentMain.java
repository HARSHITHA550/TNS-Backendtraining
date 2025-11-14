package arraydemo;

//record user defined class
//java 16+
record StudentRecord(String name,int id,double percentage) {}
public	class StudentMain {
	public static void main(String[] args) {
		StudentRecord[] s = {new StudentRecord("Harshitha",21,92.4),new StudentRecord("Likitha",24,94.4)};
		
		
	}

}
