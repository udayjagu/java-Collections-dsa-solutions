/*
Problem: Store and Display Student CGPA using TreeMap

Description:
Store student names and their CGPA using a TreeMap,
then display the student details in ascending order of
student names.

Approach:
- Create a TreeMap with student name as the key
  and CGPA as the value.
- Read the number of students from the user.
- Store each student's name and CGPA in the map.
- TreeMap automatically sorts the keys in ascending order.
- Traverse the keySet() to display the student details.

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

public class StudentCgpaTreeMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        TreeMap<String, Double> studentCgpa = new TreeMap<>();

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
