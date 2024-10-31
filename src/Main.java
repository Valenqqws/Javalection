
import java.util.Scanner;

public class Main {
    private static Object Scanner;


    //Book storage.Contact
    //0. Cтворити контакти
    //1. Зберігати контакти
    //2. Додавати контакти
    //3. Видаляти контакти
    //4. Редагувати контакти
    //5. Виводити всі контакти на екран
    //6. Меню яку дозволяє все це робити

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InMemoryContacts inMemoryContacts = new InMemoryContacts();
        Contact bogdan = new Contact("Bogdan", "+38(066)678-23-63");
        Contact vlad = new Contact("Vlad", "+38(095)527-26-98");
        inMemoryContacts.addContact(bogdan);
        inMemoryContacts.addContact(vlad);


        AddContactMenuAction menuAction = new AddContactMenuAction(inMemoryContacts, scanner);
        RemoveContactsMenuActions RemoveContactsMenuActions = new RemoveContactsMenuActions(inMemoryContacts, scanner);
        ShowContactsMenuActions showContactMenuAction = new ShowContactsMenuActions();

        Menu menu = new Menu(scanner);
        menu.addMenuAction(new AddContactMenuAction(inMemoryContacts, scanner));
        menu.addMenuAction(new RemoveContactsMenuActions());
        menu.addMenuAction(new ShowContactsMenuActions.ShowContactMenuAction(inMemoryContacts));
        menu.addMenuAction(new ExitMenuAction());
        menu.addMenuAction( new ChangePhoneNumber(scanner , inMemoryContacts));
        menu.run();


    }


    }








