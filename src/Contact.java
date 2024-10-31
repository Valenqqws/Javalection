public class Contact {



   private final String name;
   private String PhoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        PhoneNumber = phoneNumber;
    }

    String getName() {return name;}

    String getPhoneNumber() {return PhoneNumber;}



    public void setPhoneNumber (String  PhoneNumber) {this.PhoneNumber = PhoneNumber;}

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }







}

