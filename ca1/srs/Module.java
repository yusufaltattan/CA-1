public class Module {
	
	// Properties
	private int year;
	private byte term;
	private ModuleDescriptor module;
	private StudentRecord[] records;
	private double finalAverageGrade;

	// Get Functions
	public int getYear() {
		return this.year;
	}
	public byte getTerm() {
		return this.term;
	}
	public ModuleDescriptor getModule() {
		return this.module;
	}
	public StudentRecord[] getRecords() {
		return this.records;
	}
	public double getfinalAverageGrade() {
		this.calculatefinalAverageGrade();
		return this.finalAverageGrade;
	}

	// Set Functions
	public void setYear(int year) {
		this.year = year;
	}
	public void setTerm(byte term) {
		this.term = term;
	}
	public void setModuleDescriptor(ModuleDescriptor module) {
		this.module = module;
	}
	public void setRecords(StudentRecord[] records) {
		this.records = records;
	}
	public void setFinalAverageGrade(double finalAverageGrade) {
		this.finalAverageGrade = finalAverageGrade;
	}

	// Constructors
	public Module(int year, byte term, ModuleDescriptor module, StudentRecord[] records, double finalAverageGrade) {
		this.year = year;
		this.term = term;
		this.module = module;
		this.records = records;
		this.finalAverageGrade = finalAverageGrade;
	}

	// Methods
	public void calculatefinalAverageGrade(){
		// Create a total variable
		double totalGrade = 0;
		// Loop the student records
		for(int i = 0; i < this.records.length; i++){
			// For each student record that is enrolled in this module -- get the student grade
			var singleStudentGrade = this.records[i].getFinalScore();
			// Add to the total variable
			totalGrade = totalGrade + singleStudentGrade;
		}
		// Get the total number of students
		var numberOfStudents = this.records.length;
		// Divide the total grade by the number of students
		double average = totalGrade / numberOfStudents;
		setFinalAverageGrade(average);
	}

}