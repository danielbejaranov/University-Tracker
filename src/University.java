import java.util.ArrayList;

public class University {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Class> classes;

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Class> classes) {
        this.classes = classes;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addClass(Class c) {
        classes.add((c));
    }

    public void addGroupOfTeacher (ArrayList<Teacher> groupOfTeachers) {
        teachers.addAll(groupOfTeachers);
    }

    public void addGroupOfStudents (ArrayList<Student> groupOfStudents) {
        students.addAll(groupOfStudents);
    }
    public void addGroupOfClasses (ArrayList<Class> groupOfClasses) {
        classes.addAll(groupOfClasses);
    }
}
