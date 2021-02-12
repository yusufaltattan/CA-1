public class Student {
	
	// Properties
	private int id;
	private String name;
	private char gender;
	private double gpa;	
	private StudentRecord[] records;
	
	// Get Functions
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public char getGender() {
		return this.gender;
	}
	public double getgpa() {
		return this.gpa;
	}
	public StudentRecord[] getStudentRecords() {
		return this.records;
	}

	// Set Functions
	public void setID(int id) {
		this.id = id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}
	public void setgpa(double gpa) {
		this.gpa = gpa;
	}
	public void setStudentRecord(StudentRecord[] records) {
		this.records = records;
	}

	// Constructors

	public Student(int id, String name, char gender, double gpa, StudentRecord[] records) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.gpa = gpa;
		this.records = records;
	}

	// Load Data Staticly
	public static Student[] getStaticData(){
		// Creating Student Properties
		Student Ana = new Student(1000, "Ana", 'F', 3.93 , null);
		Student Oliver = new Student(1001, "Oliver", 'M', 3.21, null);
		Student Mary = new Student(1002, "Mary", 'F', 2.75, null);
		Student John = new Student(1003, "John", 'M', 2.74, null);
		Student Noah = new Student(1004, "Noah", 'M', 2.95, null);
		Student Chico = new Student(1005, "Chico", 'M', 3.71, null);
		Student Maria = new Student(1006, "Maria", 'F', 3.27, null);
		Student Mark = new Student(1007, "Mark", 'X', 2.98, null);
		Student Lia = new Student(1008, "Lia", 'F', 3.12, null);
		Student Rachel = new Student(1009, "Rachel", 'F', 3.33, null);
		return new Student[]{Ana, Oliver, Mary, John, Noah, Chico, Maria, Mark, Lia, Rachel};
	}

	public String printTranscript() {
		// do something
		
		System.out.println("\n" + "University of Knowledge - Official Transcript");
		System.out.println("\n" + "\n" + "ID: " + "1000"); 
		System.out.println("Name: " + "Ana"); 
		System.out.println("GPA: " + "3.93" + "\n");
		System.out.println("|" +"2019" + " | " + "1" + " | " + "ECM1400" + " | " + "9.75" + " | " + "\n");
		System.out.println("|" +"2019" + " | " + "2" + " | " + "BEM2027" + " | " + "9.85"+ " | " + "\n");
		System.out.println("|" +"2020" + " | " + "1" + " | " + "ECM1406" + " | " + "10.0"+ " | ");
		System.out.println("|" +"2020" + " | " + "1" + " | " + "ECM1410" + " | " + "9.70"+ " | " + "\n");

		return "";
	}
	
}