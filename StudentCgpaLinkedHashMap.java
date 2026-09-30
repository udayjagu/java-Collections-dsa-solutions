import java.util.*;

public class StudentCgpaLinkedHashMap {

    /*
    Problem: Store and Display Student CGPA using LinkedHashMap

    Description:
    Store student names and their CGPA using a LinkedHashMap,
    then display the student details in the same order in which
    they were entered.

    Approach:
    - Create a LinkedHashMap with student name as the key
      and CGPA as the value.
    - Read the number of students from the user.
    - Store each student's name and CGPA in the map.
    - Use keySet() to traverse the map.
    - LinkedHashMap maintains insertion order, so students
      are displayed in the order they were entered.

    Time Complexity: O(n)
    Space Complexity: O(n)
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        LinkedHashMap<String, Double> studentCgpa = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Enter Name : ");
            String name = sc.next();

            System.out.print("Enter CGPA : ");
            double cgpa = sc.nextDouble();

            studentCgpa.put(name, cgpa);
        }

        System.out.println("\n----- Student Details -----");
        System.out.println("Name\tCGPA");

        for (String name : studentCgpa.keySet()) {
            System.out.println(name + "\t" + studentCgpa.get(name));
        }

        sc.close();
    }
}
