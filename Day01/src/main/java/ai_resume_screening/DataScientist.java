package ai_resume_screening;

// Data Scientist role
public class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears) {
        super(candidateName, experienceYears);
    }

    @Override
    public void evaluateResume() {
        System.out.println(getCandidateName() + " is applying for Data Scientist with " + getExperienceYears() + " years of experience.");
    }
}
