

class BST
{
    Node root = null;
    
    void insert(int key)
    {
       root = insert(root, key);
    }
    Node insert(Node troot, int key)
    {
        if(troot == null)
        {
            return new Node(key);
        }
        else if(troot.val < key)
        {
            troot.right = insert(troot.right, key);
        }
        else if(troot.val > key)
        {
            troot.left = insert(troot.left, key);
        }
        return troot; vbb
    }

    void display_inorder(Node root)
    {
        if(root != null)
        {
            display_inorder(root.left);
            System.out.println(root.val);
            display_inorder(root.right);
        }
    }

    public static void main(String args[])
    {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(7);
        bst.insert(3);
        bst.insert(8);
        bst.insert(1);
        bst.insert(9);
        bst.insert(2);
        bst.insert(6);
        bst.display_inorder(bst.root);
    }
}



class Node
{
    int val;
    Node left;
    Node right;
    Node(int key)
    {
        this.val = key;
        this.left = this.right = null;
    }
}