import java.util.Scanner;

public class CountTheNumberOfStudentsPassing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents;
        do {
            System.out.println("Nhập vào số sinh viên:");
            numberOfStudents = scanner.nextInt();
            if (numberOfStudents > 30) {
                System.out.println("Số sinh viên tối đa là 30");
            }
        } while (numberOfStudents > 30);


    }
}
