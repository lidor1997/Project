package studentPractice;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class StudentGradeAnalyzer<E> {
	private Map<String, List<Integer>> studentGrades;
	public StudentGradeAnalyzer() {
		studentGrades= new HashMap<>();
		
	}
	public void addGrades(String studentName, List<Integer> grades) {
	    if(!studentGrades.containsKey(studentName)) {
	    	studentGrades.put(studentName, grades);
	    }
	    else {
	    	List<Integer> existingGrades = studentGrades.get(studentName);
	    	existingGrades.addAll(grades);
	    	 studentGrades.put(studentName, existingGrades);
	    	}
		}
	public void removeGrades(String studentName) {
		List<Integer> existingGrades = studentGrades.get(studentName);
	    existingGrades.clear(); // Clear all grades
	    studentGrades.put(studentName, existingGrades);
	}

	public List<Integer> getUnionOfGrades(List<String> studentNames) {
	    
		List<Integer> allGrades= new ArrayList<>();
		for(String key: studentGrades.keySet()) {
			List<Integer> existingGrades = studentGrades.get(key);
	    	allGrades.addAll(existingGrades);
		}
		Collections.sort(allGrades);
		return allGrades;
	 
	}
	public double calculateAverageGrade(String studentName) {
	    int countGrades=0;
	    int grades=0;
	    double average=0;
	    List<Integer> existingGrades = studentGrades.get(studentName);
	    for(Integer grade: existingGrades){
	    	grades+=grade;
	    	countGrades++;
	    	
	    }
	    average= (double)grades/countGrades;
	    return average;
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


