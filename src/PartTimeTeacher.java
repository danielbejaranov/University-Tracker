public class PartTimeTeacher extends Teacher{
    private int activeHoursPerWeek;

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public PartTimeTeacher(int id, String name, double baseSalary, int activeHoursPerWeek) {
        super(id, name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() * activeHoursPerWeek;
    }
}
