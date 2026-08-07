public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("apps");
        trie.insert("banana");
        System.out.println(trie.search("banana"));
        System.out.println(trie.startsWith("ba"));
    }
}
