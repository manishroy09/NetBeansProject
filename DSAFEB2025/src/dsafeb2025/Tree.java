/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsafeb2025;

/**
 *
 * @author Admin
 */
public class Tree {

    public int data;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

//    public static void preOrder(Tree root) {
//        if (root == null) {
//            return;
//        }
//        //ROOT LEFT RIGHT
//        System.out.print("===>" + root.data);//ROOT
//        preOrder(root.left);//for Left Sub Tree
//        preOrder(root.right);
//    }
    public static void inOrder(Tree root) {
        if (root == null) {
            return;
        }
        // LEFT ROOT RIGHT

        inOrder(root.left);//for Left Sub Tree
        System.out.print("===>" + root.data);//ROOT
        inOrder(root.right);//Right Sub Tree
    }

//    public static void postOrder(Tree root) {
//        if (root == null) {
//            return;
//        }
//        // LEFT RIGHT ROOT
//
//        postOrder(root.left);//for Left Sub Tree
//
//        postOrder(root.right);//Right Sub Tree
//        System.out.print("===>" + root.data);//ROOT
//    }
    public static Tree insert(Tree root, int data) {
        if (root == null) {
            return new Tree(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static Tree delete(Tree root, int data) {
        if (root == null) {
            return root;
        }
        // find the node to be deleted
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            //case 1 and 2 one or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case3: a node have left and right child
            root.data = minValue(root.right);
            root.right =delete(root.right, root.data);
        }

        return root;
    }
    public static int minValue(Tree root){
        int minValue = root.data;
        while(root.left!=null){
            minValue = root.left.data; //30
        }
        return minValue; //30
    }

    public boolean bst(Tree root, int search) {
        boolean b = false;
        try{
        if (root.data == search) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (search < root.data) {
            b = bst(root.left, search);
        }
        if (search > root.data) {
            b = bst(root.right, search);
        }
        }catch(Exception ne){
            System.out.println("Element Not Found");
            return false;
        }
        return b;
    }

    public static void main(String[] args) {
// Tree t1 = new Tree(10);
// Tree t2 = new Tree(20);
// t1.left = t2;
// Tree t3 = new Tree(30);
// t1.right = t3;
// Tree t4 = new Tree(40);
// t1.left.left = t4;
// Tree t5 = new Tree(50);
// t1.left.right = t5;
// Tree t6 = new Tree(60);
// t1.right.left = t6;
// Tree t7 = new Tree(70);
// t1.right.right = t7;

        Tree t1 = new Tree(100);
        Tree t2 = new Tree(20);
        t1.left = t2;
        Tree t3 = new Tree(500);
        t1.right = t3;
        Tree t4 = new Tree(10);
        t1.left.left = t4;
        Tree t5 = new Tree(30);
        t1.left.right = t5;
        
//        Tree root = new Tree(100);
//        insert(root, 70);
//        insert(root, 60);
//        insert(root, 65);
//        insert(root, 90);
//        insert(root, 150);
//        insert(root, 120);
//        insert(root, 190);

// System.out.println("Print Data of Tree Using Pre order Tree Trevarsal ");
// preOrder(t1);
//        insert(t1, 40);
//        insert(t1, 5);
//        delete(t1, 5);
//        System.out.println("\nPrint Data of Tree Using In order Tree Trevarsal ");
//        inOrder(t1);

//        System.out.println("\nBinary Search : " +root.bst(root, 191));
// System.out.println("\nPrint Data of Tree Using Post order Tree Trevarsal ");
// postOrder(t1);

        System.out.println("Print data Before Delete : ");
       inOrder(t1);
       
       delete(t1,20);
        System.out.println("\nPrint data using InOrder Tree Traversal : ");
        inOrder(t1);
    }
}
