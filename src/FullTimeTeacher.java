public class FullTimeTeacher extends Teacher{
    private int experienceYears;

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public FullTimeTeacher(int id, String name, double baseSalary, int experienceYears) {
        super(id, name, baseSalary);
        this.experienceYears = experienceYears;
    }
}
