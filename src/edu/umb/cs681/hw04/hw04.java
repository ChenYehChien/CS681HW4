package edu.umb.cs681.hw04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class hw04 {
	private static List<Student> stList = new ArrayList<Student>();
	
	private static void studentsCreation() {
		//(String name, int id, int age, char gender, float height, float weight)
		Student A = new Student("Sam"    , 1, 27, 'M', 175.0f, 76.0f);
		Student B = new Student("Jeff"   , 2, 26, 'M', 184.0f, 88.0f);
		Student C = new Student("Jerry"  , 3, 23, 'M', 180.5f, 72.0f);
		Student D = new Student("Selina" , 4, 24, 'F', 164.0f, 52.0f);
		Student E = new Student("Jessica", 5, 22, 'F', 158.0f, 43.0f);
		
		stList.add(A);
		stList.add(B);
		stList.add(C);
		stList.add(D);
		stList.add(E);
	}
	
	public static void main(String[] args) {
		studentsCreation();
		
		//average height of male students
		Float totalHeight = stList.stream()
								  .filter((Student st) -> st.getGender() == 'M')
								  .map((Student st) -> st.getHeight())
								  .reduce((result, nextElement) -> {
									  return result + nextElement;
								  })
								  .get();
		Long cntMale = stList.stream()
							 .filter((Student st) -> st.getGender() == 'M')
							 .count();
		
		float avgHeight = totalHeight / cntMale;
		
		System.out.println("Average Height (M): " + avgHeight);
		System.out.println("---------------------------------");
		
		//number of students whose name starts with 'J' and is a female
		Long cntStOfJF = stList.stream()
							   .filter((Student st) -> (st.getName().charAt(0) == 'J') && (st.getGender() == 'F'))
							   .count();
		
		System.out.println("Number of students whose name starts with 'J' and is a female : " + cntStOfJF);
		System.out.println("---------------------------------");
		
		//minimum BMI
		Double minBMI = stList.stream()
							.map((Student st) -> st.getWeight() / Math.pow((st.getHeight() / 100), 2))
							.min(Comparator.comparing(a -> a))
							.get();
		
		System.out.println("Minimum BMI: " + minBMI);
							
		
		
		
		
		
		
	}
}


