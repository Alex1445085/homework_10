public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

// 1.
    System.out.println("\n1.");
    String firstName = "Ivan";
    String middleName = "Ivanovich";
    String lastName = "Ivanov";
    String fullName = lastName + " " + firstName + " " + middleName;
    System.out.println("Ф. И. О. сотрудника - " + fullName);

// 2.
    System.out.println("\n2.");
    System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

// 3.
    System.out.println("\n3.");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника - " + fullName);
    }
}