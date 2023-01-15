package mgs_data_structure.hash_table;

public class DifferentWay {
    public static void main(String[] args) {
        String name = "Dave";
        int key = 0;
        for (int i = 0; i < name.length(); i++) {
            key += name.charAt(i);
        }

        System.out.println((int) (key) % 200);
    }
}
