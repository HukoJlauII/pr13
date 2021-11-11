import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    protected ArrayList<Student> iDNumber=new ArrayList<>();

    public void setiDNumber(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }
    public Student setRandStudent()
    {
        Student temp=new Student();
        String[] names={"Maxim","Artyom","Mikhail","Ivan","Aleksander","Dmitriy","Andrei","Egor"};
        temp.setName(names[(int)(Math.random()*names.length)]);
        temp.setGroup((int)(Math.random()*29+1));
        temp.setCourse((int)(Math.random()*4+1));
        temp.setAvg((int)(Math.random()*50+51));
        return temp;
    }
    public  void setArray()
    {
        for (int i=0;i<10;i++)
        {
            iDNumber.add(this.setRandStudent());
        }
    }

    public void outArray()
    {
        for (Student s:iDNumber)
        {
            System.out.println(s);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAvg(),o2.getAvg());
    }

    public void quicksort(int low,int high){
        if (iDNumber.size() == 0)
            return;
        if (low >= high)
            return;
        Student average=iDNumber.get(low + (high - low) / 2);
        int i = low, j = high;
        while (i <= j) {
            while (compare(iDNumber.get(i), average) > 0)
                i++;
            while (compare(iDNumber.get(j), average) < 0)
                j--;
            if (i <= j) {

                Collections.swap(iDNumber,i,j);

                i++;
                j--;}}
        if (low < j)
            quicksort(low, j);
        if (high > i)
            quicksort(i, high);
    }
}
