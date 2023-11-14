import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents, sumMarks, currentMark;
        double avgMark;
        int i;

        sumMarks = 0;
        i = 0;

        System.out.print("Введите количество студентов в группе: ");
        countStudents = scanner.nextInt();

        while (i < countStudents) {
            System.out.print(String.format("Введите оценку %d студента из %d студентов", i + 1, countStudents));

            currentMark = scanner.nextInt();

            sumMarks += currentMark;

            i++;
        }

        avgMark = (double) sumMarks / countStudents;

        System.out.println(String.format("Средняя арифметическая оценка группы = %.2f", avgMark));


    }
}