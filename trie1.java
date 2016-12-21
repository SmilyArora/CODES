import java.io.*;
import java.util.*;

class Trie
{
    class TrieNode
    {
        Integer value;
        TrieNode node[] = new TrieNode[26];
    }
    TrieNode root = null;
    Trie()
    {
        root = new TrieNode();
    }

    void insert(String word, int val)
    {
        TrieNode p = root;
        int i, index;
        for(i = 0; i < word.length(); i++)
        {
            index = word.charAt(i) - 'a';
            if(p.node[index] == null)
            p.node[index] = new TrieNode();
            p = p.node[index];
        }
        p.value = val;
        System.out.println("String " + word + " inserted at key " + p.value);
    }
    void search(String word)
    {
        TrieNode res = TrieSearch(word);
        if(res != null && res.value != null)
        {
            System.out.println("String " + word + " found at key " + res.value);
        }
        else
        {
            System.out.println("String " + word + " not found.");
        }
    }
    TrieNode TrieSearch(String word)
    {
        TrieNode p = root;
        int i, index;
        for(i = 0; i < word.length(); i++)
        {
            index = word.charAt(i) - 'a';
            if(p.node[index] == null)
            return null;
            p = p.node[index];
        }
        return p;
    }
    public static void main(String args[])
    {
        Trie obj = new Trie();
        obj.insert("abcd", 1);
        obj.insert("hi", 2);
        obj.insert("hello", 3);
        obj.search("abk");
        obj.search("hi");
        obj.search("abc");
    }
}
/*import java.io.*;
import java.util.*;

class Trie
{

    private class TrieNode
    {
        Integer value;
        TrieNode [] nodes = new TrieNode[26];
    }
    TrieNode root;
    public Trie()
    {
        root = new TrieNode();
    }

    void insert(String w )
    {
        TrieNode p = root;
        int i, index;
        for( i = 0; i < w.length(); i++)
        {
            index = w.charAt(i) - 'a';
            if(p.nodes[index] == null)
            p.nodes[index] = new TrieNode();

            p = p.nodes[index];
        }
        p.value = 1;
    }
    private TrieNode Search(String w)
    {
        int i;
        TrieNode p = root;
        for(i = 0; i < w.length(); i++)
        {
            int index = w.charAt(i) - 'a';
            if(p.nodes[index] == null)
            return null;

            p = p.nodes[index];
        }
        return p;
    }

    void searchtree(String w)
    {
        TrieNode b = Search(w);
        if(b != null && b.value!=null){
        System.out.println("found");}
        else{
            System.out.println("not found");
        }
    }


    public static void main(String args[])
    {
        Trie ob = new Trie();
        ob.insert("java");
        ob.insert("abc");
        ob.searchtree("abcs");
        ob.searchtree("ab");

    }
}*/