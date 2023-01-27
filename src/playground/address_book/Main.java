package playground.address_book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AddressDTO dto = new AddressDTO("도레미", "010-1111-2222", "doremi@gmail.com");

        AddressRepository addressRepository = new AddressRepository();
        addressRepository.add(1, dto);

        System.out.println("===");
        System.out.println(addressRepository.searchByName("도레미"));


        System.out.println("====================");
        addressRepository.searchAll();
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요.");
        String name = scanner.next();

        return name;
    }

    public static String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("번호를 입력하세요.");
        String num = scanner.next();

        return num;
    }

    public static String inputEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이메일을 입력하세요.");
        String email = scanner.next();

        return email;
    }
}
