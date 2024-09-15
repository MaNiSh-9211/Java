
public class HashTable {
    private int[] hashTable;
    private int l;

    public HashTable(int l) {
        this.l = l;
        hashTable = new int[l];
        for (int i = 0; i < l; i++) {
            hashTable[i] = -1; 
        }
    }

    private int hashFunction(int k) {
        return k % l;
    }

    public void insertElement(int k) {
        int hashIndex = hashFunction(k);
        int probeIndex = hashIndex;

        while (hashTable[probeIndex] != -1) {
            probeIndex = (probeIndex + 1) % l; 
            if (probeIndex == hashIndex) {
                System.out.println("Hash table is full. Cannot insert element " + k);
                return;
            }
        }

        hashTable[probeIndex] = k;
        System.out.println("Element " + k + " inserted at index " + probeIndex);
    }

    public boolean getElement(int k) {
        int hashIndex = hashFunction(k);
        int probeIndex = hashIndex;

        while (hashTable[probeIndex] != k && hashTable[probeIndex] != -1) {
            probeIndex = (probeIndex + 1) % l;
            if (probeIndex == hashIndex) {
                System.out.println("Element " + k + " not found.");
                return false;
            }
        }

        if (hashTable[probeIndex] == k) {
            System.out.println("Element " + k + " found at index " + probeIndex);
            return true;
        } else {
            System.out.println("Element " + k + " not found.");
            return false;
        }
    }

    public void display() {
        for (int i = 0; i < l; i++) {
            System.out.print("Index " + i + ": ");
            if (hashTable[i] != -1) {
                System.out.print(hashTable[i] + " ");
            } else {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);

        ht.insertElement(15);
        ht.insertElement(25);
        ht.insertElement(35);
        ht.insertElement(45);
        ht.insertElement(75);

        ht.display();

        ht.getElement(25);
        ht.getElement(50);
    }
}