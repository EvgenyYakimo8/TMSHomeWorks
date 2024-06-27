package by.tms.lesson15.task3;

public class Student {
    String name, group;
    int course, grades;

    public Student(String name, String group, int course, int grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}
