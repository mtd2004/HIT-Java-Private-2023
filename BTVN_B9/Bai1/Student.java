package BTVN_B9.Bai1;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) throws Exception {
        this.grade = grade;
        if(this.grade < 0 || this.grade > 10)
            throw new Exception("Lỗi : Điểm Không Hợp Lệ") ;
    }
}
