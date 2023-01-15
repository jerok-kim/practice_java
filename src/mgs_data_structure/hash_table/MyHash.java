package mgs_data_structure.hash_table;

public class MyHash {
    
    /*
     * 시간 복잡도
     * 
     * - 일반적인 경우(Collision이 없는 경우)는 O(1)
     * - 최악의 경우(Collision이 모두 발생하는 경우)는 O(n)
     * - Linear Probing, Chaining 기법 둘 다 동일
     * 
     * 
     * 검색에서 해쉬 테이블의 사용 예
     * 
     * - 배열에 데이터를 저장하고, 검색할 때 O(n)
     * - 이상적인 해쉬 테이블 케이스에서 데이터를 검색할 때 O(1)
     * 
     */
    

    public Slot[] hashTable;

    public MyHash(Integer size) {
        this.hashTable = new Slot[size];
    }

    public static class Slot {
        String value;

        Slot(String value) {
            this.value = value;
        }
    }

    public int hashFunc(String key) {
        return (int) (key.charAt(0)) % this.hashTable.length;
    }

    public boolean saveData(String key, String value) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            this.hashTable[address].value = value;
        } else {
            this.hashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key) {
        Integer address = this.hashFunc(key);
        if (this.hashTable[address] != null) {
            return this.hashTable[address].value;
        } else {
            return null;
        }
    }

}
