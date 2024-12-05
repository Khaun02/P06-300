/** Generic class for a node
 * 
 * @author Shaun Khang
 * 
 * @param <T> any data type that you want the node to hold
 */
public class BSTNode<T> {
    private T data;
    private BSTNode<T> left;
    private BSTNode<T> right;
    // The constructor
    public BSTNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRight() {
        return this.right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }
}
    
