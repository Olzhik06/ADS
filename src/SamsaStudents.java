import java.util.ArrayList;
import java.util.Scanner;

public class SamsaStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the number of students");
        int student_num = sc.nextInt();
        System.out.println("Give the number of samsa");
        int samsa_num = sc.nextInt();
        ArrayList<Integer> student = new ArrayList<>();
        ArrayList<Integer> samsa = new ArrayList<>();
        System.out.println("Give the number for students");
        for (int i = 0; i < student_num; i++) {
            int num = sc.nextInt();
            student.add(num);
        }
        System.out.println("Give the number for samsa");
        for (int i = 0; i < samsa_num; i++) {
            int num = sc.nextInt();
            samsa.add(num);
        }

        for (int i = 0; i < samsa.get(args.length); i++) {
            for (int j = 0; j < student.get(args.length); j++) {
                if (student.get(j) == samsa.get(i)) {
                    student.remove(0);
                    samsa.remove(0);
                }
            }
        }
        System.out.println(student.get(args.length));
    }
}