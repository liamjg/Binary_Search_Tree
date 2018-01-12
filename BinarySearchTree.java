public class BinarySearchTree {
    //node
    private class Node{
        private int data;
        private int height;
        private Node leftChild, rightChild;

        private Node(int d){
            this.data = d;
            this.height = 0;
            this.leftChild = null;
            this.rightChild = null;


        }
        private void print(){
            System.out.print(this.data);
        }
    }

    private Node root;

    public BinarySearchTree(){
        this.root = null;
    }

    public boolean isEmpty(){
        if(this.root == null){
            return false;
        }else{
            return true;
        }
    }

    public void Insert(int data){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
        }
        else{
            Node current = root;
            Node prev = null;

            while(true){
                prev = current;

                if(data < current.data){
                    current = current.leftChild;
                    if(current == null){
                        prev.leftChild = newNode;
                    }

                }else{
                    current = current.rightChild;
                    if(current == null){
                        prev.rightChild = newNode;
                    }
                }
            }
        }

    }

    public void remove(int data){
        Node prev = root;
        Node current = root;

        boolean isLeftChild = false;

        //look for data
        while(current.data != data){
            prev = current;
            if(current.data > data){
                isLeftChild = true;
                current = current.leftChild;
            }else{
                isLeftChild = false;
                current = current.rightChild;
            }
        }

        //if node has no children
        if(current.leftChild == null && current.rightChild == null){
            if(current == root){
                root = null;
            }else if(isLeftChild){
                prev.leftChild = null;
            }else{
                prev.rightChild = null;
            }

        //one child on right
        }else if(current.leftChild == null){
            if(current == root){
                root = current.rightChild;
            }else if(isLeftChild){
                prev.leftChild = current.rightChild;
            }else{
                prev.rightChild = current.rightChild;
            }
        //one child on left
        }else if(current.rightChild == null){
            if(current == root){
                root = current.leftChild;
            }else if(isLeftChild){
                prev.leftChild = current.leftChild;
            }else{
                prev.rightChild = current.leftChild;
            }
        //two children
        }else if(current.leftChild != null && current.rightChild != null){
            if(current == root){

            }

        }

    }

    public void printTree(){

    }

    public void find(int data){

    }



}
