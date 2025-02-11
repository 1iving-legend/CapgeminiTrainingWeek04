package multilevel_university;

// Generic class to manage courses
public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void displayCourseDetails() {
        System.out.println("multilevel_university.Course: " + courseType.getCourseName() + " | Department: " + courseType.getDepartment());
        courseType.evaluate();
    }
}
