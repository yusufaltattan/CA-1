public class University {

	// Properties
	private ModuleDescriptor[] moduleDescriptors;
	private Student[] students;
	private Module[] modules;

	// Get Functions
	public ModuleDescriptor[] getmoduleDescriptors() {
		return this.moduleDescriptors;
	}

	public Student[] getStudents() {
		return this.students;
	}

	public Module[] getModules() {
		return this.modules;
	}

	// Set Functions
	public void setmoduleDescriptors(ModuleDescriptor[] moduleDescriptors) {
		this.moduleDescriptors = moduleDescriptors;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void setModules(Module[] modules) {
		this.modules = modules;
	}

	/**
	 * @return The number of students registered in the system.
	 */
	public int getTotalNumberStudents() {
		// TODO - needs to be implemented
		var x = getStudents();
		return x.length;
	}

	/**
	 * @return The student with the highest GPA.
	 */
	public Student getBestStudent() {
		// Returns student with highest GPA
		int index = 0;
		for(int i = 0; i < this.students.length; i++) {
			if (this.students[index].getgpa() < this.students[i].getgpa()) {
				index = i;
			} 
		}
		return this.students[index];
	}
	/**
	 * @return The module with the highest average score.
	 */
	public Module getBestModule() {
		// Returns module with highest final average
		int index = 0;
		for(int i = 0; i < this.modules.length; i++) {
			if (this.modules[index].getfinalAverageGrade() < this.modules[i].getfinalAverageGrade()) {
				index = i;
			} 
		}
		return this.modules[index];
	}
	public ModuleDescriptor getModuleDescriptorByCode(String code) {
		for (int i = 0; i < this.moduleDescriptors.length; i++) {
			if (this.moduleDescriptors[i].get_code() == code) {
				return this.moduleDescriptors[i];
			}
		}
		return null;
	}

	public Student getStudentByID(int ID) {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i].getID() == ID) {
				return this.students[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO - needs to be implemented

		// Initialize Data

		// Creating University
		University myUniversity = new University();

		// Set the Module Descriptors since they are base classes
		myUniversity.setmoduleDescriptors(ModuleDescriptor.getStaticData());

		// Set the Students also since they are base classes
		myUniversity.setStudents(Student.getStaticData());

		// Initialize Modules
		// CODE - YEAR - TERM
		// ECM1400 - 2019 - 1
		// PHY2023 - 2019 - 1
		// BEM2027 - 2019 - 2
		// ECM1400 - 2019 - 2
		// ECM1406 - 2020 - 1
		// ECM1410 - 2020 - 1
		// ECM0002 - 2020 - 2
		Module[] modules = { new Module(2019, (byte) 1, myUniversity.getModuleDescriptorByCode("ECM1400"), null, 0),
				new Module(2019, (byte) 1, myUniversity.getModuleDescriptorByCode("PHY2023"), null, 0),
				new Module(2019, (byte) 2, myUniversity.getModuleDescriptorByCode("BEM2027"), null, 0),
				new Module(2019, (byte) 2, myUniversity.getModuleDescriptorByCode("ECM1400"), null, 0),
				new Module(2020, (byte) 1, myUniversity.getModuleDescriptorByCode("ECM1406"), null, 0),
				new Module(2020, (byte) 1, myUniversity.getModuleDescriptorByCode("ECM1410"), null, 0),
				new Module(2020, (byte) 2, myUniversity.getModuleDescriptorByCode("ECM0002"), null, 0) };
		// Set Modules to the university
		myUniversity.setModules(modules);

		// Create Student Records
		var studentRecord1ECM1400 = new StudentRecord(myUniversity.getStudentByID(1000), myUniversity.getModules()[0],
				new double[] { 9, 10, 10, 10 });
		var studentRecord2ECM1400 = new StudentRecord(myUniversity.getStudentByID(1001), myUniversity.getModules()[0],
				new double[] { 8, 8, 8, 9 });
		var studentRecord3ECM1400 = new StudentRecord(myUniversity.getStudentByID(1002), myUniversity.getModules()[0],
				new double[] { 5, 5, 6, 5 });
		var studentRecord4ECM1400 = new StudentRecord(myUniversity.getStudentByID(1003), myUniversity.getModules()[0],
				new double[] { 6, 4, 7, 9 });
		var studentRecord5ECM1400 = new StudentRecord(myUniversity.getStudentByID(1004), myUniversity.getModules()[0],
				new double[] { 10, 9, 10, 9 });
		// Set the Student Records for First Module (ECM1400)
		StudentRecord[] studentRecords = { studentRecord1ECM1400, studentRecord2ECM1400, studentRecord3ECM1400,
				studentRecord4ECM1400, studentRecord5ECM1400 };
		myUniversity.getModules()[0].setRecords(studentRecords);

		// Calculate Final Average for First Module (ECM1400)
		System.out.println("Average grade for " + myUniversity.getModules()[0].getModule().get_name() + " is " + myUniversity.getModules()[0].getfinalAverageGrade());

		// Method 1
		//System.out.println(studentRecord5ECM1400.getStudent().printTranscript());
		// Method 2
		//System.out.println(myUniversity.getStudentByID(1004).printTranscript());

		// PHY2023
		var studentRecord1PHY2023 = new StudentRecord(myUniversity.getStudentByID(1005), myUniversity.getModules()[1],
				new double[] { 9, 9 });
		var studentRecord2PHY2023 = new StudentRecord(myUniversity.getStudentByID(1006), myUniversity.getModules()[1],
				new double[] { 6, 9 });
		var studentRecord3PHY2023 = new StudentRecord(myUniversity.getStudentByID(1007), myUniversity.getModules()[1],
				new double[] { 5, 6 });
		var studentRecord4PHY2023 = new StudentRecord(myUniversity.getStudentByID(1008), myUniversity.getModules()[1],
				new double[] { 9, 7 });
		var studentRecord5PHY2023 = new StudentRecord(myUniversity.getStudentByID(1009), myUniversity.getModules()[1],
				new double[] { 8, 5 });
		// Set the Student Records for Second Module (PHY2023)
		studentRecords = new StudentRecord[] { studentRecord1PHY2023, studentRecord2PHY2023, studentRecord3PHY2023,
				studentRecord4PHY2023, studentRecord5PHY2023 };
		myUniversity.getModules()[1].setRecords(studentRecords);

		// Calculate Final Average for Second Module (PHY2023)
		System.out.println("Average grade for " + myUniversity.getModules()[1].getModule().get_name() + " is "
				+ myUniversity.getModules()[1].getfinalAverageGrade());

		// BEM2027
		var studentRecord1BEM2027 = new StudentRecord(myUniversity.getStudentByID(1000), myUniversity.getModules()[2], 
				new double[] {10, 10, 9.5, 10});
		var studentRecord2BEM2027 = new StudentRecord(myUniversity.getStudentByID(1001), myUniversity.getModules()[2], 
				new double[] {7, 8.5, 8.2, 8});
		var studentRecord3BEM2027 = new StudentRecord(myUniversity.getStudentByID(1002),myUniversity.getModules()[2], 
				new double[] {6.5, 7.0, 5.5, 8.5});
		var studentRecord4BEM2027 = new StudentRecord(myUniversity.getStudentByID(1003),myUniversity.getModules()[2], 
				new double[] {5.5, 5, 6.5, 7});
		var studentRecord5BEM2027 = new StudentRecord(myUniversity.getStudentByID(1004),myUniversity.getModules()[2], 
				new double[] {7, 5, 8, 6});
		// Set the student record for Third Module (BEM2027)
		studentRecords = new StudentRecord[] { studentRecord1BEM2027, studentRecord2BEM2027, studentRecord3BEM2027,
			studentRecord4BEM2027, studentRecord5BEM2027 };
		myUniversity.getModules()[2].setRecords(studentRecords);

		// Calculate Final Average for Third Module (BEM2027)
		System.out.println("Average grade for " + myUniversity.getModules()[2].getModule().get_name() + " is "
				+ myUniversity.getModules()[2].getfinalAverageGrade());

		// ECM1400
		var studentRecord1ECM14002 = new StudentRecord(myUniversity.getStudentByID(1005),myUniversity.getModules()[3], 
				new double[] {9, 10, 10, 10});
		var studentRecord2ECM14002 = new StudentRecord(myUniversity.getStudentByID(1006),myUniversity.getModules()[3], 
				new double[] {8, 8, 8, 9});
		var studentRecord3ECM14002 = new StudentRecord(myUniversity.getStudentByID(1007),myUniversity.getModules()[3], 
				new double[] {5, 5, 6, 5});
		var studentRecord4ECM14002 = new StudentRecord(myUniversity.getStudentByID(1008),myUniversity.getModules()[3], 
				new double[] {6, 4, 7, 9});
		var studentRecord5ECM14002 = new StudentRecord(myUniversity.getStudentByID(1009),myUniversity.getModules()[3], 
				new double[] {10, 9, 8, 9});
		// Set the student record for Fourth Module (ECM1400)
		studentRecords = new StudentRecord[] { studentRecord1ECM14002, studentRecord2ECM14002, studentRecord3ECM14002,
			studentRecord4ECM14002, studentRecord5ECM14002 };
		myUniversity.getModules()[3].setRecords(studentRecords);

		// Calculate Final Average for Fourth Module (ECM1400)
		System.out.println("Average grade for " + myUniversity.getModules()[3].getModule().get_name() + " is "
				+ myUniversity.getModules()[3].getfinalAverageGrade());

		// ECM1406
		var studentRecord1ECM1406 = new StudentRecord(myUniversity.getStudentByID(1000),myUniversity.getModules()[4], 
				new double[] {10, 10, 10});
		var studentRecord2ECM1406= new StudentRecord(myUniversity.getStudentByID(1001),myUniversity.getModules()[4], 
				new double[] {8, 7.5, 7.5});
		var studentRecord3ECM1406 = new StudentRecord(myUniversity.getStudentByID(1002),myUniversity.getModules()[4], 
				new double[] {9, 7, 7});
		var studentRecord4ECM1406 = new StudentRecord(myUniversity.getStudentByID(1003),myUniversity.getModules()[4], 
				new double[] {9, 8, 7});
		var studentRecord5ECM1406 = new StudentRecord(myUniversity.getStudentByID(1004),myUniversity.getModules()[4], 
				new double[] {2, 7, 7});
		var studentRecord6ECM1406 = new StudentRecord(myUniversity.getStudentByID(1005),myUniversity.getModules()[4], 
				new double[] {10, 10, 10});
		var studentRecord7ECM1406 = new StudentRecord(myUniversity.getStudentByID(1006),myUniversity.getModules()[4], 
				new double[] {8, 7.5, 7.5});
		var studentRecord8ECM1406 = new StudentRecord(myUniversity.getStudentByID(1007),myUniversity.getModules()[4], 
				new double[] {10, 10, 10});
		var studentRecord9ECM1406 = new StudentRecord(myUniversity.getStudentByID(1008),myUniversity.getModules()[4], 
				new double[] {9, 8, 7});
		var studentRecord10ECM1406 = new StudentRecord(myUniversity.getStudentByID(1009),myUniversity.getModules()[4], 
				new double[] {8, 9, 10});
		
		// Set the student record for Fifth Module (ECM1406)
		studentRecords = new StudentRecord[] { studentRecord1ECM1406, studentRecord2ECM1406, studentRecord3ECM1406,
			studentRecord4ECM1406, studentRecord5ECM1406, studentRecord6ECM1406, studentRecord7ECM1406, 
			studentRecord8ECM1406, studentRecord9ECM1406, studentRecord10ECM1406};
		myUniversity.getModules()[4].setRecords(studentRecords);

		// Calculate Final Average for Fifth Module (ECM1406)
		System.out.println("Average grade for " + myUniversity.getModules()[4].getModule().get_name() + " is "
				+ myUniversity.getModules()[4].getfinalAverageGrade());

		// ECM1410
		var studentRecord1ECM1410 = new StudentRecord(myUniversity.getStudentByID(1000),myUniversity.getModules()[5], 
				new double[] {10, 9, 10});
		var studentRecord2ECM1410 = new StudentRecord(myUniversity.getStudentByID(1001),myUniversity.getModules()[5], 
				new double[] {8.5, 9, 7.5});
		var studentRecord3ECM1410 = new StudentRecord(myUniversity.getStudentByID(1002),myUniversity.getModules()[5], 
				new double[] {10, 10, 5.5});
		var studentRecord4ECM1410 = new StudentRecord(myUniversity.getStudentByID(1003),myUniversity.getModules()[5], 
				new double[] {7, 7, 7});
		var studentRecord5ECM1410 = new StudentRecord(myUniversity.getStudentByID(1004),myUniversity.getModules()[5], 
				new double[] {5, 6, 10});
		// Set the student record for Sixth Module (ECM1410)
		studentRecords = new StudentRecord[] { studentRecord1ECM1410, studentRecord2ECM1410, studentRecord3ECM1410,
			studentRecord4ECM1410, studentRecord5ECM1410};
		myUniversity.getModules()[5].setRecords(studentRecords);

		// Calculate Final Average for Sixth Module (ECM1410)
		System.out.println("Average grade for " + myUniversity.getModules()[5].getModule().get_name() + " is "
				+ myUniversity.getModules()[5].getfinalAverageGrade());

		// ECM0002
		var studentRecord1ECM0002 = new StudentRecord(myUniversity.getStudentByID(1005),myUniversity.getModules()[6], 
				new double[] {8, 9, 8});
		var studentRecord2ECM0002 = new StudentRecord(myUniversity.getStudentByID(1006),myUniversity.getModules()[6], 
				new double[] {6.5, 9, 9.5});
		var studentRecord3ECM0002 = new StudentRecord(myUniversity.getStudentByID(1007),myUniversity.getModules()[6], 
				new double[] {8.5, 10, 8.5});
		var studentRecord4ECM0002 = new StudentRecord(myUniversity.getStudentByID(1008),myUniversity.getModules()[6], 
				new double[] {7.5, 8, 10});
		var studentRecord5ECM0002 = new StudentRecord(myUniversity.getStudentByID(1009),myUniversity.getModules()[6], 
				new double[] {10, 6, 10});
		// Set the student record for Seventh Module (ECM0002)
		studentRecords = new StudentRecord[] { studentRecord1ECM0002, studentRecord2ECM0002, studentRecord3ECM0002,
			studentRecord4ECM0002, studentRecord5ECM0002};
		myUniversity.getModules()[6].setRecords(studentRecords);

		// Calculate Final Average for Seventh Module (ECM1406)
		System.out.println("Average grade for " + myUniversity.getModules()[6].getModule().get_name() + " is "
				+ myUniversity.getModules()[6].getfinalAverageGrade());

		// TODO create and initialise the university

		// Print Reports
		System.out.println("The UoK has " + myUniversity.getTotalNumberStudents() + " students.");


		// best module
		System.out.println("The best module is:");
		System.out.println(myUniversity.getBestModule().getModule().get_name());

		// best student
		System.out.println("The best student is:");
		System.out.println(myUniversity.getBestStudent().getName());
		System.out.println(myUniversity.getBestStudent().printTranscript());
	}
}
