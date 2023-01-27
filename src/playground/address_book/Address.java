package playground.address_book;

public interface Address {
    void add(Integer key, AddressDTO addressDTO);
    AddressDTO searchByKey(Integer key);
    String searchByName(String name);
    void delete(Integer key);
}
