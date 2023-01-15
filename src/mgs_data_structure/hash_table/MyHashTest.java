package mgs_data_structure.hash_table;

public class MyHashTest {
    public static void main(String[] args) {
        String name = "DaveLee";
        System.out.println(name.charAt(0));
        System.out.println((int) (name.charAt(0)) % 20);
        System.out.println((int) (name.charAt(0)));

        MyHash.Slot[] hashTable = new MyHash.Slot[20];
        hashTable[0] = new MyHash.Slot("test");
        System.out.println(hashTable[0]);
        System.out.println(hashTable[0].value);

        MyHash mainObject = new MyHash(20);
        mainObject.saveData("DaveLee", "01022223333");
        mainObject.saveData("fun-coding", "01033334444");
        mainObject.saveData("David", "01044445555");
        mainObject.saveData("Dave","01055556666");
        System.out.println(mainObject.getData("DaveLee"));
        System.out.println(mainObject.getData("fun-coding"));
        System.out.println(mainObject.getData("Dave"));
        System.out.println(mainObject.getData("David"));
    }
}
