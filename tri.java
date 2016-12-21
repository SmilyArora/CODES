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

    void insert(Integer val, String word)
    {
        TrieNode p = root;
        int index, i;
        for(i = 0; i < word.length(); i++)
        {
            index = word.charAt(i) - 'a';
            if(p.node[index] == null)
            {
                p.node[index] = new TrieNode();
            }
             p = p.node[index];            
        }
        p.value = val;
        System.out.println(p.value);
    }

    TrieNode searchTrie(String word)
    {
        TrieNode p = root;
        int index, i;
        for(i = 0; i < word.length(); i++)
        {
            index = word.charAt(i) - 'a';
            if(p.node[index] == null)
            {
                return null;
            }
            p = p.node[index];
        }
        return p;
    }

    void search(String word)
    {
        TrieNode res = searchTrie(word);
        if(res != null)
        {
            System.out.println("String " + word + " found with key " + res.value );
        }
        else
        {
            System.out.println("String " + word + " not found");
        }
    }

    public static void main(String args[])
    {
        Trie obj = new Trie();
        obj.insert(1, "abc");
        obj.insert(2, "ab");
        obj.insert(3, "java");
        obj.search("ab");
        obj.search("abm");
    }
}
