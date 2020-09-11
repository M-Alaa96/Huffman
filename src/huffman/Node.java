
package huffman;
import java.util.Comparator;

public class Node {

    Node left, right;
    int value;
    Character character;

    public Node(int value, Character character) {
        this.value = value;
        this.character = character;
        left = null;
        right = null;
    }

    public Node(Node left, Node right) {
        this.value = left.value + right.value;
        this.character =  '\0';
        if (left.value <= right.value) {
            this.right = right;
            this.left = left;
        } else {
            this.right = left;
            this.left = right;
        }
    }

}

