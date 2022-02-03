
public class SeatingChart {
	public static void main(String[] args) {
		//Sample array of students for testing your method
		Student[] classList = { new Student("Salt", 12),
								new Student("Pepper", 12),
								new Student("Paprika", 10),
								new Student("Sugar", 9),
								new Student("Dill", 11),
								new Student("Cloves", 11),
								new Student("Basil", 10),
								new Student("Oregano", 12),
								new Student("Thyme", 10),
								new Student("Parsley", 10),
								new Student("Sage", 11),
								new Student("Cajun", 9),
								new Student("Bob", 12)};
		
		//Place the students and store the return value in a
		//2D String array
		String[][] seatingChart = placeStudents(classList, 3, 5);
		
		//Print the seating chart
		print(seatingChart);
	}
	
	//PRE:  r and c will be large enough to hold all the students
	//      in list
	//POST: Creates a 2D String array with r rows and c columns,
	//		fills the array in column major order with the with
	//		the names in list, and returns the final array
	public static String[][] placeStudents(Student[] list, int r, int c){
        //Your code here		
	}
	
	public static void print(String[][] seats) {
		for(String[] row : seats) {
			for(String name : row) {
				System.out.print(name + "\t");
			}
			System.out.println();
		}
	}
}
