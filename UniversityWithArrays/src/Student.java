
public class Student {

	private String name;
	private String id;
	//ιδιότητα που συσχετίζει τον φοιτητή με το μάθημα που παρακολουθεί
	//αναφορά τύπου Course δηλαδή το myCourse μπορεί να δείξει σε ένα αντικείμενο τύπου μάθημα
	private Course[ ] courses;
	private int numberOfCourses = 0;
	
	public void printInfo() {
		System.out.println("Name :"+ name );
		System.out.println("Id: " + id);
		for(int i=0;  i<numberOfCourses; i++) {
			courses[i].printCourseDetails();
		System.out.println("----------------------");
	}
	}
	
	public void addCourse(Course aCourse) {
		if(numberOfCourses <8) {
		   courses[numberOfCourses] = aCourse;
		   numberOfCourses++;
		   System.out.println("Student successfully enrolled in a course");
		}
	   else 
			System.out.println("No more number of courses ");
	   
	}
	
	public Student(String aName, String someId) {
		name = aName;
		id = someId;
		courses = new Course[8];
	}

    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
}


	


