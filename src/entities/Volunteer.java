package entities;

public class Volunteer implements CheckIn {
    private String name;
    private int age;
    private String CV;

    public Volunteer(String name, int age, String CV) {
        this.name = name;
        this.age = age;
        this.CV = CV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("The volunteer is checked in");
    }
}
