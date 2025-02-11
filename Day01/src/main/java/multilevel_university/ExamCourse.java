package multilevel_university;

// Exam-based course
public class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " (Exam-Based) is evaluated through written exams.");
    }
}
