package in.co.oop.encapsulation;

public class Course {

	private long courseId;
	private String courseName;
	private String duration;
	private double fees;
	private String trainerName;

	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFees() {
		return this.fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getTrainerName() {
		return this.trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

}
