package ai_resume_screening;

// Generic class to process resumes for specific job roles
public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing resume for: " + jobRole.getCandidateName());
        jobRole.evaluateResume();
    }
}
