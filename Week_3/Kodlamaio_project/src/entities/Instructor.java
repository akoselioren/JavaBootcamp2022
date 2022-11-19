package entities;

public class Instructor {
	private int instructorId;
	private String instructorFirstName;
	private String instructorLastName;
	private int instructorAge;

	public Instructor() {
	}

	public Instructor(int instructorId, String instructorFirstName, String instructorLastName, int instructorAge) {
		this.instructorId = instructorId;
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
		this.instructorAge = instructorAge;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorLastName() {
		return instructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}

	public int getInstructorAge() {
		return instructorAge;
	}

	public void setInstructorAge(int instructorAge) {
		this.instructorAge = instructorAge;
	}

}
