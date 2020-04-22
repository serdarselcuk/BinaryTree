import java.util.ArrayDeque;

public class Dfs_Total {    //Depth First Search

    public static int dfsSum(Node n){
        int sum = 0;
        Node root = n;
        ArrayDeque<Node> deq = new ArrayDeque<Node>();
        deq.addLast(root);

        while(deq.size()>0)
        {
            root = deq.removeLast();
            sum += root.value;
            if (root.right != null) {
                deq.addLast(root.right);

            }
            if (root.left != null) {
                deq.addLast(root.left);

            }

        }

        return sum;
    }
    public static void main(String[] args) {

        Node node = new Node(23);

        node.left = new Node(21);

        node.left.left = new Node(5);

        node.left.left.right = new Node(25);
        node.left.left.left = new Node(27);
        node.left.right = new Node(37);
        node.left.right.right = new Node(53);
        node.left.right.left = new Node(312);

        node.right = new Node(34);

        node.right.left = new Node(3);

        node.right.left.right = new Node(55);
        node.right.left.left = new Node(57);

        node.right.right = new Node(31);

        node.right.right.right = new Node(45);
        node.right.right.left = new Node(47);


        System.out.println(dfsSum(node));

        System.out.println(RecursiveBinarySum.recursiveSum(node));
        RecursiveBinarySum.recursiveChildCount(node);
        System.out.println(RecursiveBinarySum.countOneChild);
    }
}
