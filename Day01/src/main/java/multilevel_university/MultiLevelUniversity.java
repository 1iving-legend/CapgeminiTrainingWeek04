package multilevel_university;

import java.util.*;

public class MultiLevelUniversity {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("multilevel_university.Course: " + course.getCourseName() + " | Department: " + course.getDepartment());
            course.evaluate();
        }
    }

    public static void main(String[] args) {
        // Create different types of courses
        ExamCourse examCourse = new ExamCourse("Mathematics", "Science");
        AssignmentCourse assignmentCourse = new AssignmentCourse("Programming", "Computer Science");
        ResearchCourse researchCourse = new ResearchCourse("AI Research", "Artificial Intelligence");

        // Create generic multilevel_university.Course objects
        Course<ExamCourse> course1 = new Course<>(examCourse);
        Course<AssignmentCourse> course2 = new Course<>(assignmentCourse);
        Course<ResearchCourse> course3 = new Course<>(researchCourse);

        // Display individual course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        System.out.println("\nDisplaying all courses using wildcard:");

        // Using a list with wildcard to display all course types
        List<CourseType> allCourses = Arrays.asList(examCourse, assignmentCourse, researchCourse);
        displayAllCourses(allCourses);
    }
}
