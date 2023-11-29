package KiemTra;

public abstract class Person {

    private int id;
    private static int count = 0;
    private String name;
    private short age;
    private Address address;

    public Person() {
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person(String name, short age, Address address) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nID : " + id
                + "\nName : " + name
                + "\nAge : " + age
                + "\nAddress : " + address;
    }

    public abstract String getCapacity();
}
