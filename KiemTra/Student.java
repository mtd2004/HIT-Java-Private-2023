package KiemTra;

public class Student extends Person {

    private double scores;

    public Student() {
    }

    public Student(double scores, String name, short age, Address address) {
        super(name, age, address);
        this.scores = scores;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nScores : " + scores
                + "\nCapacity : " + getCapacity();
    }

    @Override
    public String getCapacity() {
        if (this.scores >= 9) {
            return "Xuat Sac";
        } else if (this.scores >= 8 && this.scores < 9) {
            return "Gioi";
        } else if (this.scores >= 6.5 && this.scores < 8) {
            return "Kha";
        } else {
            return "Trung Binh Yeu";
        }
    }

}
