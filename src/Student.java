import java.util.Formatter;

public class Student {
    protected String Name;

    protected int Course;
    protected int Group;
    protected int Avg;

    public Student() {
    }

    public Student(String name, int course, int group, int avg) {
        Name = name;
        Course = course;
        Group = group;
        Avg = avg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCourse() {
        return Course;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        Group = group;
    }

    public int getAvg() {
        return Avg;
    }

    public void setAvg(int avg) {
        Avg = avg;
    }

    @Override
    public String toString() {
        Formatter f=new Formatter();
        f.format("Student %10s | Course %d | Group %2d | Average mark %3d",Name,Course,Group,Avg);
        return f.toString();
    }
}
