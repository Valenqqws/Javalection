import java.util.Scanner;

public class ChangePhoneNumber implements MenuAction {

    private Scanner scanner;
    private InMemoryContacts inMemoryContacts;


    public ChangePhoneNumber(Scanner scanner, InMemoryContacts inMemoryContacts) {
        this.scanner = scanner;
        this.inMemoryContacts = inMemoryContacts;
    }


    public void execute() {
        System.out.println("Введіть номер телефону щоб змінити");
        String contactName = scanner.nextLine();
        Contact contact = inMemoryContacts.findContactByName(contactName);


        if (contact == null) {
            System.out.println("Контакт не найден, дотримуйтесь правил!!!");


        }
        System.out.println("Правильной номер" + inMemoryContacts);
        System.out.println("Введіть новий номер телефону(формат:+38(**)***-**-**):");
        String newPhoneNumber = scanner.nextLine();



        if (isValidPhoneNumber(newPhoneNumber)) {
            contact.setPhoneNumber(newPhoneNumber);
            System.out.println("Номер успішно змінен");
        }   else {
            System.out.println("Номер не в тому форматі");
        }




    }

    @Override
    public String getName() {
        return "";
    }


    private boolean  isValidPhoneNumber (String phoneNumber) {

        return false;
    }

    }

