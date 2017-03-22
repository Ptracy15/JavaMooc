
/**
 *
 * @author paul
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Grade {

    private Scanner scanner;
    private ArrayList<Integer> scores;
    private int[] grades;

    public Grade(Scanner scanner) {
        this.scanner = scanner;
        this.scores = new ArrayList<Integer>();
        this.grades = new int[6];
        for (int i = 0; i < this.grades.length; i++) {
            this.grades[i] = 0;
        }
    }

    public void getScores() {
        System.out.println("Type exam scores, -1 completes: ");
        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }
            if (score >= 0 && score <= 60) {
                scores.add(score);
            }
        }
    }

    public int giveGrade(int score) {
        if (score < 30) {
            return 0;
        } else if (score < 35) {
            return 1;

        } else if (score < 40) {
            return 2;
        } else if (score < 45) {
            return 3;
        } else if (score < 50) {
            return 4;
        } else {
            return 5;
        }
    }

    public void countGrades() {
        for (int score : scores) {
            int grade = giveGrade(score);
            for (int i = 0; i < grades.length; i++) {
                if (grade == i) {
                    this.grades[i]++;
                }
            }
        }
    }

    public boolean isAccepted(int grade) {
        return !(grade == 0);
    }

    public double getAcceptancePercentage() {
        double numberOfScores = 0;
        for (int i = 0; i < this.grades.length; i++) {
            numberOfScores += this.grades[i];
        }

        if (numberOfScores == 0) {
            return 0.0;
        }
        return (numberOfScores - this.grades[0]) * 100 / numberOfScores;
    }

    public void print() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Acceptance percentage: " + getAcceptancePercentage());
    }
}
