/*
Problem: Store and Display Student CGPA in Reverse Order using TreeMap

Description:
Store student names and their CGPA using a TreeMap,
then display the student details in descending alphabetical
order of student names.

Approach:
- Create a TreeMap with student name as the key
  and CGPA as the value.
- Use Collections.reverseOrder() as the comparator
  to maintain keys in descending order.
- Read and store each student's name and CGPA.
- Traverse the keySet() to display the student details.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class StudentCgpaReverseTreeMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        TreeMap<String, Double> studentCgpa =
                new TreeMap<>(Collections.reverseOrder());

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
