package playground.address_book;

public class AddressDTO {
    public String name;
    public String number;
    public String email;

    AddressDTO(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.number + "\t" + this.email;
    }
}
