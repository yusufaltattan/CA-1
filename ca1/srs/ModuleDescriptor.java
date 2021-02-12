public class ModuleDescriptor {
	
	// Properties
	private String code;
	private String name;
	private double[] continuousAssignmentWeights;

	// Get Functions
	public String get_code() {
		return this.code;
	}
	public String get_name() {
		return this.name;
	}
	public double[] get_continuousAssignmentWeights() {
		return this.continuousAssignmentWeights;
	}

	// Set Functions
	public void set_name(String name) {
		this.name = name;
	}
	public void set_code(String code){
		this.code = code;
	}
	public void set_continuousAssignmentWeights(double[] continuousAssignmentWeights){
		this.continuousAssignmentWeights = continuousAssignmentWeights;
	}

	// Constructor
	public ModuleDescriptor(String code, String name, double[] continuousAssignmentWeights) {
		this.code = code;
		this.name = name;
		this.continuousAssignmentWeights = continuousAssignmentWeights;
	}

	// Load Data Staticly
	public static ModuleDescriptor[] getStaticData(){
		// Create Module Descriptors
		ModuleDescriptor RWM = new ModuleDescriptor("ECM0002", "Real World Mathematics", new double[] {0.1, 0.3, 0.6});
		ModuleDescriptor PRG = new ModuleDescriptor("ECM1400", "Programming", new double[] {0.25, 0.25, 0.25, 0.25});
		ModuleDescriptor DS = new ModuleDescriptor("ECM1406", "Data Structures", new double[] {0.25, 0.25, 0.5});
		ModuleDescriptor OOP = new ModuleDescriptor("ECM1410", "Object-Oriented Programming", new double[] {0.2, 0.3, 0.5});
		ModuleDescriptor IS = new ModuleDescriptor("BEM2027", "Information Systems", new double[] {0.1, 0.3, 0.3, 0.3});
		ModuleDescriptor TP = new ModuleDescriptor("PHY2023", "Thermal Physics", new double[] {0.4, 0.6});
		return new ModuleDescriptor[]{RWM, PRG, DS, OOP, IS, TP};
	}
}