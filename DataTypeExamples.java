package Actividad1;

public class DataTypeExamples {
    // Example with primitive type
    public double sumNumbers(double a, double b) {
        return a + b;
    }

    // Example with strings
    public String concatenate(String a, String b) {
        return a + " " + b;
    }

    // Example with complex type (contact)
    public static class Contact {
        String name;
        String address;
        String phone;

        public Contact(String name, String address, String phone) {
            this.name = name;
            this.address = address;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return name + " | " + address + " | " + phone;
        }
    }
}
