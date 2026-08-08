import com.harshit.Trie.Trie2;

public class Main {
    public static void main(String[] args) {
//        Trie trie = new Trie();
//        trie.insert("apple");
//        trie.insert("apps");
//        trie.insert("banana");
//        System.out.println(trie.search("banana"));
//        System.out.println(trie.startsWith("ba"));

        System.out.println("--------------------");
        Trie2 trie2 = new Trie2();
        trie2.insert("jh");
        trie2.insert("jhe");
        trie2.insert("jha");
        trie2.insert("jolo");
        System.out.println(trie2.countWord("jh"));
        System.out.println(trie2.countStartsWith("jh"));
    }
}
