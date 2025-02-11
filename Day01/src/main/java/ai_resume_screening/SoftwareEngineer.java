package ai_resume_screening;

// Software Engineer role
public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public void evaluateResume() {
        System.out.println(getCandidateName() + " is applying for Software Engineer with " + getExperienceYears() + " years of experience.");
    }
}
