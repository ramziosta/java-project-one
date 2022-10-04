public class Main {
    public static void main(String[] args) {

        Person ramzi = new Person("ramzi", "osta", "employee","Developer",  55);
        ramzi.setId(5);
        ramzi.setFirstName("Jojo");
        System.out.println(ramzi.getFirstName());
    }
}