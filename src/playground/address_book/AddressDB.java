package playground.address_book;

import java.util.HashMap;

public class AddressDB {
    private static HashMap<Integer, AddressDTO> addressDB;

    public static int currentUID = 0;
    
    private AddressDB() {
    }

    public static HashMap<Integer, AddressDTO> getAddressDB() {
        if (addressDB == null) {
            addressDB = new HashMap<>();
        }
        return addressDB;
    }

}
