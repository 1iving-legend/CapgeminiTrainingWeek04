package multilevel_university;

// Research-based course
public class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " (Research-Based) is evaluated through research projects.");
    }
}
