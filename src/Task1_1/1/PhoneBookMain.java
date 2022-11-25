package PhoneBook;

import java.util.HashMap;

public class PhoneBookMain {
    public static void main(String[] args) {

        HashMap<String, String> contact = new HashMap<>();

        contact.put("Алексей Алексеев", "+7(914) 338 15 17");
        contact.put("Борис Борисов", "+7(914) 338 17 17");
        contact.put("Валентина Валентинова", "+7(914) 338 15 25");
        contact.put("Григорий Григорьев", "+7(924) 338 20 17");
        contact.put("Данила Данилов", "+7(909) 338 15 17");
        contact.put("Евгения Евгеньева", "+7(911) 356 15 17");
        contact.put("Ёжи Ёжиков", "+7(926) 888 25 17");
        contact.put("Жармалжибек Жармалжибеков", "+7(914) 388 20 20");
        contact.put("Зиновий Зиновьев", "+7(914) 335 15 30");
        contact.put("Иван Иванов", "+7(914) 338 38 38");
        contact.put("Константин Константинов", "+7(999) 333 33 33");
        contact.put("Леонид Леонидов", "+7(916) 588 15 17");
        contact.put("Михаил Михайлов", "+7(914) 338 33 55");
        contact.put("Николай Нколаев", "+7(914) 777 15 17");
        contact.put("Олег Олегов", "+7(914) 818 35 50");
        contact.put("Павел Павлов", "+7(996) 111 15 17");
        contact.put("Роман Романов", "+7(909) 337 40 50");
        contact.put("Степан Степанов", "+7(999) 666 66 66");
        contact.put("Тимофей Тимофеев", "+7(916) 222 15 17");
        contact.put("Ульяна Ульянова", "+7(926) 999 17 17");

        System.out.println(contact.get("Иван Иванов"));
        System.out.println(contact.keySet());
        System.out.println(contact.values());



    }
}
