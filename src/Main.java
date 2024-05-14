import java.util.Random;

public class Main {
    public static void main(String[] args) {
            MyHashTable<MyTestingClass, MyTestingClass.Student> table = new MyHashTable<>();
            Random random = new Random();

            for (int i = 0; i < 10000; i++) {
                MyTestingClass key = new MyTestingClass(random.nextInt(1000));
                MyTestingClass.Student value = new MyTestingClass.Student("Student " + i);
                table.put(key, value);
            }

            MyHashTable.HashNode<MyTestingClass, MyTestingClass.Student>[] chainArray = table.getChainArray();
            for (int i = 0; i < chainArray.length; i++) {
                int count = 0;
                MyHashTable.HashNode<MyTestingClass, MyTestingClass.Student> current = chainArray[i];
                while (current != null) {
                    count++;
                    current = current.next;
                }
                System.out.println("Bucket " + i + ": " + count + " elements");
            }

            BST<Integer, String> bst = new BST<>();

            for (int i = 0; i < 10000; i++) {
                int key = random.nextInt(1000);
                String value = "Value " + i;
                bst.put(key, value);
            }

            System.out.println("Size of BST: " + bst.size());

            for (Integer key : bst.iterator()) {
                System.out.println("Key is " + key + " and value is " + bst.get(key));
            }
        }

    }
