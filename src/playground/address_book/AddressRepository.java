package playground.address_book;

import java.util.*;

public class AddressRepository implements Address {
    @Override
    public void add(Integer key, AddressDTO addressDTO) {
        AddressDB.getAddressDB().put(++AddressDB.currentUID, addressDTO);
    }

    public AddressDTO searchByKey(Integer key) {
        return AddressDB.getAddressDB().get(key);
    }

    public String searchByName(String name) {
        Collection<AddressDTO> values = AddressDB.getAddressDB().values();
        System.out.println(values);
        
        for(AddressDTO item : values) {
            System.out.println(item.name);
            System.out.println(item.email);
            if(name.equals(item.name)) {
                return item.number;
            }
        }
        
        return "not found";
    }
    
    public void searchAll() {
        Collection<AddressDTO> values = AddressDB.getAddressDB().values();
        for(AddressDTO item : values) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void delete(Integer key) {
        AddressDB.getAddressDB().remove(key);
    }
}
