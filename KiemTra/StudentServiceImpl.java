package KiemTra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    List<Student> list ;

    public StudentServiceImpl() {
        this.list = new ArrayList<>() ;
    }

    public StudentServiceImpl(List<Student> list) {
        this.list = list ;
    }
    
    @Override
    public void addStudent(Student t) {
        list.add(t);
        System.out.println("Da Them Sinh Vien Thanh Cong");
    }

    @Override
    public void deleteStudent(int id) {
        boolean check = false;
        Student temp = new Student();
        for (Student x : list) {
            if (x.getId() == id) {
                check = true;
                temp = x;
            }
        }
        if (check) {
            list.remove(temp);
            System.out.println("Da Xoa Sinh Vien Thanh Cong");
        } else {
            System.out.println("Khong Tim Thay Thong Tin Sinh Vien");
        }
    }

    @Override
    public void searchStudent(String name) {
        boolean check = false;
        Student res = new Student();
        for (Student temp : list) {
            if (temp.getName().equals(name)) {
                check = true;
                res = temp;
            }
        }
        if (check) {
            System.out.println(res.toString());
        } else {
            System.out.println("Khong Tim Thay Thong Tin Sinh Vien");
        }
    }

    @Override
    public void sortedStudent() {
        Collections.sort(list , (o2 , o1) -> Double.compare(o2.getScores(), o1.getScores())) ;
    }

    @Override
    public void showAllStudent() {
        if (list.isEmpty()) {
            System.out.println("Danh Sach Sinh Vien Rong");
        } else {
            System.out.println("Danh Sach Sinh Vien : ");
            for (Student temp : list) {
                System.out.println(temp.toString());
            }
        }
    }

}
