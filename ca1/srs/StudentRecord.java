public class StudentRecord {

	// Properties
	private Student student;

	private Module module;

	private double[] marks;

	private double finalScore;

	private Boolean isAboveAverage;

	// Get Functions
	public Student getStudent() {
		return this.student;
	}

	public Module getModule() {
		return this.module;
	}

	public double[] getMarks() {
		return this.marks;
	}

	public double getFinalScore() {
		this.calculateFinalScore();
		return this.finalScore;
	}

	public Boolean getisAboveAverage() {
		this.determineIsAboveAverage();
		return this.isAboveAverage;
	}

	// Set Functions
	public void setStudents(Student student) {
		this.student = student;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public void setFinalScore(double finalScore) {
		this.finalScore = finalScore;
	}

	public void setisAboveAverage(Boolean isAboveAverage) {
		this.isAboveAverage = isAboveAverage;
	}

	// Constructors
	public StudentRecord(Student student, Module module, double[] marks) {
		this.student = student;
		this.module = module;
		this.marks = marks;
	}

	// Methods
	public void calculateFinalScore() {
		// Get Module Weights
		double[] gradeWeights = this.module.getModule().get_continuousAssignmentWeights();
		// Create a total final grade variable
		double totalFinalScore = 0;

		for (int i = 0; i < this.marks.length; i++) {
			// Get the current mark
			var currentMark = this.marks[i];
			// Get the weight at the same index
			var currentWeight = gradeWeights[i];
			// Add to the total final score
			totalFinalScore = totalFinalScore + (currentWeight * currentMark);
		}
		// Set final score
		setFinalScore(totalFinalScore);
	}

	// Determine is Above Average
	public void determineIsAboveAverage() {
		// this function should check the average of the module and check if this
		// student grade is above average
		var moduleAverage = this.module.getfinalAverageGrade();
		if (this.getFinalScore() > moduleAverage) {
			setisAboveAverage(true);
		} else {
			setisAboveAverage(false);
		}
	}
}