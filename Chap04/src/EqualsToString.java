public class EqualsToString {

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.setData("Tom", 3527832, 23);
        st2.setData("Jane", 3527214, 22);
        st3.setData("Tom", 3527832, 23);
        System.out.println("[st1] " + st1);
        System.out.println("[st2] " + st2);
        System.out.println("[st3] " + st3);
        System.out.println("[st1.equals(st2)?] " + st1.equals(st2));
        System.out.println("[st1.equals(st3)?] " + st1.equals(st3));
        System.out.println("[st2.equals(st3)?] " + st2.equals(st3));
    }

}

class Student {
    String name;
    int id;
    int age;

    public void setData(String name, int id, int age) {
        this.name = new String(name);
        this.id = id;
        this.age = age;
    }

    public boolean equals(Student other) {
        return name.equals(other.name) && id == other.id &&
                age == other.age;
    }

    public String toString() {
        return "STUDENT name(" + name + ") id(" + id + ") age(" + age + ")";
    }
}
