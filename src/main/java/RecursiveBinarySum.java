

public class RecursiveBinarySum {

    public static int recursiveSum(Node n){

        if(n == null){
            return 0;
        }

        return n.value+recursiveSum(n.right)+recursiveSum(n.left);
    }
    static int countOneChild = 0;

    public static int recursiveChildCount(Node n){

        int child = 0;

        if(n.right!= null){
            child++;
        }

        if(n.left!= null){
            child++;
        }

        if(recursiveChildCount(n.right)==1){
            countOneChild++;
        }

        if(recursiveChildCount(n.left)==1){
            countOneChild++;
        }

        return child;
    }
}
