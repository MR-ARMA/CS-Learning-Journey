import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

class CustomException extends Exception {
   public CustomException(String message) {
       super(message);
   }
}

class Student {
   private String name;
   private int score;

   public Student(String name, int score) {
       this.name = name;
       this.score = score;
   }

   public String getName() {
       return name;
   }

   public int getScore() {
       return score;
   }

   @Override
   public String toString() {
       return "Student{" +
               "name='" + name + '\'' +
               ", score=" + score +
               '}';
   }
}

public class Main {
   public static void validateInput(int input) throws IllegalArgumentException, CustomException {
       if (input < 0) {
           throw new IllegalArgumentException("Input cannot be negative.");
       } else if (input > 100) {
           throw new CustomException("Input exceeds maximum limit.");
       }
   }

   public static void main(String[] args) {
       try {
           validateInput(-5);
           validateInput(150);
           validateInput(50);
       } catch (IllegalArgumentException | CustomException e) {
           System.out.println(e.getMessage());
       }

       School school = new School();
       school.addStudent(new Student("John", 85));
       school.addStudent(new Student("Jane", 90));
       school.addStudent(new Student("Tom", 95));

       school.printStudents();

       int[] scores = {85, 90, 95};
       Arrays.sort(scores);
       System.out.println("Sorted scores: " + Arrays.toString(scores));

       Date currentDate = new Date();
       System.out.println("Current date: " + currentDate);
   }
}

class School {
   private ArrayList<Student> students;

   public School() {
       this.students = new ArrayList<>();
   }

   public void addStudent(Student student) {
       this.students.add(student);
   }

   public void printStudents() {
       for (Student student : students) {
           System.out.println(student);
       }
   }
}
