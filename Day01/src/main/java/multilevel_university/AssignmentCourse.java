package multilevel_university;

// Assignment-based course
public class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " (Assignment-Based) is evaluated through assignments.");
    }
}
