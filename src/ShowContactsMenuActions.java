import java.util.ArrayList;

public class ShowContactsMenuActions {



    public static class ShowContactMenuAction implements MenuAction {



        private InMemoryContacts contacts;
        public ShowContactMenuAction(InMemoryContacts contacts) {this.contacts = contacts;}


        @Override
        public void execute() {
            System.out.println("===========");

            ArrayList<Contact> contacts = InMemoryContacts.allGetContacts();
            for (int i = 0; i < contacts.size(); i++){
                Contact contact = contacts.get(1);
                System.out.println(i + 1  + "" + contact.getName() + " " + contact.getPhoneNumber());
            }
            System.out.println("============");
        }

        @Override
        public String getName() {
            return "Show contacts";
        }
    }



            }








