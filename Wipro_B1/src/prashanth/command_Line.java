package prashanth;

class Student {
    String name;
    int english;
    int maths;
}

public class command_Line {

    public static void main(String[] args) {

        String studentName;
        int englishMarks;
        int mathsMarks;

        Student s = new Student();
        s.name = studentName;
        s.english = englishMarks;
        s.maths = mathsMarks;

        int total = s.english + s.maths;
        float percentage = (total / 200.0f) * 100;

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Student: " + s.name);
        System.out.println("English: " + s.english);
        System.out.println("Maths: " + s.maths);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        s = null;
    }
}
