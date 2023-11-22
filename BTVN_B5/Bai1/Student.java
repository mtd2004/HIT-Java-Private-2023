package BTVN_B5.Bai1;

import java.util.Scanner;

public class Student extends Person {

    private int id;
    private String nameClass;
    private float gpa;
    final float criteria = 2;

    public Student() {
        super();
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        } else {
            this.gpa = 0;
        }
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("input id: ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.print("input NameClass: ");
        setNameClass(sc.nextLine());
        System.out.print("input gpa: ");
        setGpa(sc.nextFloat());
        sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-5d%-15s%.2f", this.getId(), this.getNameClass(), this.getGpa());
    }

    public boolean checkFall() {
        if (this.gpa < 2) {
            return false;
        }
        return true;
    }
}
