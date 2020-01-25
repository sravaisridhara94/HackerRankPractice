public class Student {

        private int ID;
        private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
