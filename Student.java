import java.util.ArrayList;
import java.util.List;
class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;

	public Student(String index, String firstName, String lastName, List<Integer> labPoints) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getLabPoints() {
		return labPoints;
	}

	public void setLabPoints(List<Integer> labPoints) {
		this.labPoints = labPoints;
	}

	public double getAverage() {
		//TODO
		double sum = 0;
		for(int i =0; i < labPoints.size(); i++) {
			suma = suma + labPoints.get(i);
		}
		return suma;
	}

	public boolean hasSignature() {
		//TODO
		if(labPoints.size() > 8)
			return true;
		else
			return false;
	}
}
