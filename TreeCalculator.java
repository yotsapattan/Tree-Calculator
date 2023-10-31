public class TreeCalculator {

    // Method to find the maximum value in the tree
    public static int findMax(Node root) {
        if(root == null) {
            return Integer.MIN_VALUE; // Return the minimum possible value for an empty tree
        } else {
            return findMaxHelper(root);
        }
    }

    // Helper method for finding the maximum value
    private static int findMaxHelper(Node node) {
        if(node == null) {
            return Integer.MIN_VALUE; // Return the minimum possible value for a null node
        }

        int maxLeft = findMaxHelper(node.left);
        int maxRight = findMaxHelper(node.right);

        // Compare the maximum values from left and right subtrees with the current node's value
        return Math.max(node.id, Math.max(maxLeft, maxRight));
    }

    // Method to find the minimum value in the tree
    public static int findMin(Node root) {
        if(root == null) {
            return Integer.MAX_VALUE; // Return the maximum possible value for an empty tree
        } else {
            return findMinHelper(root);
        }
    }

    // Helper method for finding the minimum value
    private static int findMinHelper(Node node) {
        if(node == null) {
            return Integer.MAX_VALUE; // Return the maximum possible value for a null node
        }

        int minLeft = findMinHelper(node.left);
        int minRight = findMinHelper(node.right);

        // Compare the minimum values from left and right subtrees with the current node's value
        return Math.min(node.id, Math.min(minLeft, minRight));
    }

    // Method to calculate the sum of all nodes in the tree
    public static double sumTree(Node root) {
        if(root == null) {
            return 0;
        } else {
            return root.id + sumTree(root.right) + sumTree(root.left);
        }
    }

    // Method to calculate the average value of all nodes in the tree
    public static double avgTree(Node root) {
        if (root == null) {
            return 0;
        } else {
            return sumTree(root) / countN(root);
        }
    }

    // Helper method to count the number of nodes in the tree
    private static double countN(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + countN(node.left) + countN(node.right);
        }
    }
}
