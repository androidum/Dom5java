package dom5;
import java.util.*;

/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что один человек может иметь несколько телефонов. */

public class zadacha1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Список контактов:");
        Map<String, ArrayList<Integer>> list = createPhoneList();
        System.out.print("Выбери из списка: ");
        String name = sc.next();
        System.out.println(list.get(name));
        sc.close();
    }

    private static Map<String, ArrayList<Integer>> createPhoneList() {
        Map<String, ArrayList<Integer>> phonebook = new HashMap<>();
        phonebook.put("Ivanov", addPhoneList(3));
        phonebook.put("Sedorov", addPhoneList(3));
        phonebook.put("Petrov", addPhoneList(1));
        phonebook.put("Smirnov", addPhoneList(2));
        phonebook.put("Nikolaev", addPhoneList(1));
        Set<Map.Entry<String, ArrayList<Integer>>> set = phonebook.entrySet();
        for (Map.Entry<String, ArrayList<Integer>> name : set) {
            System.out.println(name.getKey());
        }
        return phonebook;
    }

    private static ArrayList<Integer> addPhoneList(int numberPhones) {
        ArrayList<Integer> phoneList = new ArrayList<>();
        for (int i = 0; i < numberPhones; i++) {
            Random rnd = new Random();
            phoneList.add(rnd.nextInt(10000) + 30000);
        }
        return phoneList;
    }
}