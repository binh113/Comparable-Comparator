import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("kien", 30, "HT");
        Student student01 = new Student("Nam", 26, "HN");
        Student student02 = new Student("Anh", 38, "HT");
        Student student03 = new Student("Tung", 38, "HT");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student01);
        list.add(student02);
        list.add(student03);
        Collections.sort(list);
        for (Student st : list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        list.sort(ageComparator);
        System.out.println("so sanh theo tuoi:");
        for (Student st : list) {
            System.out.println(st.toString());
        }
    }
}
