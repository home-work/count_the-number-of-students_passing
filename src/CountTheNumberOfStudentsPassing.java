import java.util.Scanner;

public class CountTheNumberOfStudentsPassing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kiểm tra số lượng sinh viên được nhập tối đa là 30
        int numberOfStudents;
        do {
            System.out.println("Nhập vào số sinh viên:");
            numberOfStudents = scanner.nextInt();
            if (numberOfStudents > 30) {
                System.out.println("Số sinh viên tối đa là 30");
            }
        } while (numberOfStudents > 30);

        //Nhập điểm cho sinh viên
        int[] pointOfStudent = new int[numberOfStudents];
        int count = 0;
        for (int i = 0; i < pointOfStudent.length; i++) {
            do {
                System.out.println("Nhập vào điểm sinh viên thứ " + (i + 1));
                pointOfStudent[i] = scanner.nextInt();
                if (pointOfStudent[i] < 0 || pointOfStudent[i] > 10) {
                    System.out.println("Nhập lại điểm của sinh viên thứ " + (i + 1));
                }
                if (pointOfStudent[i] >= 5) {
                    count++;
                }
            } while (pointOfStudent[i] < 0 || pointOfStudent[i] > 10);
        }

        //Hiển thị số lượng sinh viên đã thi đỗ
        System.out.println("Số lượng sinh viên thi đỗ là: " + count);

    }
}
