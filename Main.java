public class Main {

    Node root;

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;

            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }

        }

    }

    public void inOrderTraverselTree(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverselTree(focusNode.leftChild);
            System.out.println(focusNode.leftChild);
            inOrderTraverselTree(focusNode.rightChild);

        }
    }

    public static void main(String[] args) {

        Main theTree = new Main();

        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice Pressedent");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secartary");
        theTree.addNode(75, "Salesman One");


        theTree.inOrderTraverselTree(theTree.root) ; 

    }
}