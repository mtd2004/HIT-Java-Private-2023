package BTVN_B5.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ClassRoom {

    private static ArrayList<Student> students = new ArrayList<>();

    public ClassRoom() {

    }

    public ClassRoom(ArrayList<Student> students) {
        this.students = students;
    }

    public void inputList() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            boolean check = false;
            Student st;
            do {
                check = false;
                System.out.println("input student " + (i + 1));
                st = new Student();
                st.input();
                for (Student s : students) {
                    if (s.getId() == st.getId()) {
                        System.out.println("");
                        System.out.println("INPUT AGAIN");
                        check = true;
                    }
                }
            } while (check);
            students.add(st);
            i++;
        } while (students.get(i - 1).getId() != 555);
    }

    public void outputList() {
        System.out.println("-------------------------------------------------CLASS ROOM-------------------------------------------------");
        System.out.printf("%-20s%-5s%-20s%-20s%-20s%-5s%-15s%-5s", "Name", "Age", "Commune", "District", "City", "ID", "NameClass", "GPA");
        System.out.println();
        for (Student x : students) {
            x.output();
            System.out.println();
        }
    }

    public void sortByGpa() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = students.size() - 1; j > i; j--) {
                if (students.get(j).getGpa() > students.get(j - 1).getGpa()) {
                    Student tg = students.get(j);
                    students.set(j, students.get(j - 1));
                    students.set(j - 1, tg);
                }
            }
        }
    }

    public boolean removeById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input findId: ");
        int FindId = sc.nextInt();
        boolean check1 = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == FindId) {
                students.remove(i);
                check1 = true;
            }
        }
        return check1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassRoom cl = new ClassRoom(students);
        int choice = 0;
        do {
            System.out.println("-------MENU--------");
            System.out.println("1, Input student.");
            System.out.println("2, Show list student.");
            System.out.println("3, Sort by GPA.");
            System.out.println("4, Remove by id.");
            System.out.println("5, Exit.");
            System.out.print("Input choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                cl.inputList();
            } else if (choice == 2) {
                cl.outputList();
            } else if (choice == 3) {
                cl.sortByGpa();
            } else if (choice == 4) {
                cl.removeById();
            } else if (choice == 5) {
                System.out.println("Finished");
            } else {
                System.out.println("Input choice again.");
            }
        } while (choice != 5);

    }

}
