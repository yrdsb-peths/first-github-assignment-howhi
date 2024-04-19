public class Student
{
	public String firstName;
    	public String lastName;
    	public int volunteerHours;
    
	
    	public Student(String firstName, String lastName, int volunteerHours)
    	{
    		this.firstName = firstName;
		this.lastName = lastName;
		this.volunteerHours = volunteerHours;
    	}

	public String toString()
	{
		return firstName + " " + lastName + " has " + volunteerHours + " volunteer hours.";
	}


}
