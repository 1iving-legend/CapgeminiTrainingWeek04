package ai_resume_screening;

import java.util.*;

public class AIResumeScreeningSystem {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Screening resume...");
        resume.processResume();
    }


    public static void processMultipleResumes(List<? extends JobRole> jobRoles) {
        System.out.println("\nProcessing multiple resumes...");
        for (JobRole jobRole : jobRoles) {
            jobRole.evaluateResume();
        }
    }

    public static void main(String[] args) {
        // Create different job roles
        SoftwareEngineer se = new SoftwareEngineer("Alice", 5);
        DataScientist ds = new DataScientist("Bob", 3);
        ProductManager pm = new ProductManager("Charlie", 7);

        // Create generic ai_resume_screening.Resume objects
        Resume<SoftwareEngineer> resume1 = new Resume<>(se);
        Resume<DataScientist> resume2 = new Resume<>(ds);
        Resume<ProductManager> resume3 = new Resume<>(pm);

        // Screen individual resumes
        screenResume(resume1);
        screenResume(resume2);
        screenResume(resume3);

        // Process multiple resumes using wildcard method
        List<JobRole> allResumes = Arrays.asList(se, ds, pm);
        processMultipleResumes(allResumes);
    }
}
