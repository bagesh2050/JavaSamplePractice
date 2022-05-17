package com.self.practice.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.self.practice.model.Student;

public class Demo2 {
	public static void main(String[] args) {

		List<Student> studentsList = Arrays.asList(new Student("x", 12, "Delhi"), new Student("y", 15, "Delhi"),
				new Student("z", 13, "Noida"), new Student("x", 13, "Delhi"), new Student("x", 13, "Mumbai"),
				new Student("x", 13, "Mumbai"));

		Comparator<Student> studentComparator = Comparator.comparingInt(Student::getMarks);

		Optional<Student> student = studentsList.stream().max(studentComparator);

		System.out.println("Name=" + student.get().getName() + " marks=" + student.get().getMarks());

		Comparator<Student> studentComparator1 = (o1, o2) -> o2.getMarks() - o1.getMarks();

		Optional<Student> student1 = studentsList.stream().sorted(studentComparator1).findFirst();

		System.out.println("Name=" + student1.get().getName() + " marks=" + student1.get().getMarks());

		Map<String, Long> studentMap = studentsList.stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

		for (Entry<String, Long> student2 : studentMap.entrySet()) {
			System.out.println("Name=" + student2.getKey() + " Student Count=" + student2.getValue());
		}

		Map<String, Double> studentMap2 = studentsList.stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.averagingLong(Student::getMarks)));

		studentMap2.forEach((t, u) -> System.out.println("Name= " + t + " Average Marks=" + u));

		/*
		 * Map<String, List<Student>> studentMap3 = studentsList.stream()
		 * .collect(Collectors.groupingBy(Student::getName, Collectors.filtering(null,
		 * null)));
		 * 
		 * studentMap3.forEach((t, u) -> System.out.println("Name= " + t +
		 * " Average Marks=" + u));
		 */

		Map<String, Set<Student>> studentMap4 = studentsList.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.));
		studentMap4.forEach((t, u) -> System.out.println("City= " + t + " Student=" + u));

	}
}
