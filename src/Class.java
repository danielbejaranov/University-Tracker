import java.util.ArrayList;

public class Class {
    private int id;
    private String name;
    private String classroom;
    private ArrayList<Student> students;
    private Teacher teacher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Class(int id, String name, String classroom, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addGroupOfStudents(ArrayList<Student> groupOfStudents) {
        students.addAll(groupOfStudents);
    }

    public String print() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }

    public String printStudents() {
        StringBuilder classInfo = new StringBuilder("Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", students=[");

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            classInfo.append(student.getName()).append(" (ID: ").append(student.getId()).append(")");

            if (i < students.size() - 1) {
                classInfo.append(", ");
            }
        }

        classInfo.append("], teacher=").append(teacher.getName()).append(" (ID: ").append(teacher.getId()).append(")}");

        return classInfo.toString();
    }
}
