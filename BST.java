class BST
{
   class Node
   {
       int val;
       Node left;
       Node right;
        Node(int key)
       {
           val = key;
           left = right = null;
       }
   } 
   Node root = null;
   void insert(int key)
   {
      root = insert(key, root);
   }
   Node insert(int key, Node troot)
   {
       if(troot == null)
       {
           Node root1 = new Node(key);
           return root1;
       }
       else if(troot.val < key)
       {
           troot.right = insert(key, troot.right);
       }
       else if(troot.val > key)
       {
           troot.left = insert(key, troot.left);
       }
       return troot;
   }
   void display(Node root)
   {
       if(root != null)
       {
           display(root.left);
           System.out.println(root.val);
           display(root.right);
       }
   }
   void mini(Node root)
   {
       if(root.left == null)
       {
           System.out.println(root.val);
       }
       else
       {
           mini(root.left);
       }
   }
   void maxi(Node root)
   {
       if(root.right == null)
       {
           System.out.println(root.val);
       }
       else
       {
           mini(root.right);
       }
   }
   public static void main(String args[])
   {
       BST bst = new BST();
       bst.insert(5);
       bst.insert(7);
       bst.insert(3);
       bst.display(bst.root);
       bst.mini(bst.root);
       bst.maxi(bst.root);
   }
}