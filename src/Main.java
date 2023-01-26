public class Main {
    public static void main(String[] args) {
        People chel = new People(1, "Василий", "Иванов", "Иванович", "м",
                12061976, 0);
        System.out.println(chel.getFio() + " " + chel.getBirthday());
    }
}
