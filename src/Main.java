import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingStudentsByGPA students=new SortingStudentsByGPA();
        students.setArray();
        System.out.println("--------------------------Task2-----------------------------");
        System.out.println("Array without sorting");
        students.outArray();
        System.out.println("------------------------------------------------------------");
        students.quicksort(0,9);
        System.out.println("Array with sorting");
        students.outArray();
        System.out.println("--------------------------Task3-----------------------------");
        List<Student> l1=new ArrayList<>();
        for (int i=0;i<3;i++)
        {
            l1.add(students.setRandStudent());
        }

        List<Student> l2=new ArrayList<>();
        for (int i=0;i<3;i++)
        {
            l2.add(students.setRandStudent());
        }

        List<Student> l12=new ArrayList<>(l1);
        l12.addAll(l2);
        System.out.println("Array without sorting");
        for (Student s:l12)
        {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------");
        l12.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGroup()-o2.getGroup();
            }
        });

        System.out.println("Array with sorting by groups");
        for (Student s:l12)
        {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------");

    }
}
