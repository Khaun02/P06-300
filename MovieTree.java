import java.util.List;

/** Generic class for a node
 * 
 * @author Shaun Khang
 *
 */
public class MovieTree {
    
    private BSTNode<Movie> root;
    
    // the addmovie and addmovie helper
    // we use a helper method so its easier to use recursion

    public boolean addMovie(Movie movie) {
        
        if (root == null) {
            root = new BSTNode<Movie>(movie);
            return true;
        }

        return addMovieHelper(root, movie);

    }
    
    /*
     * Easier to use recursion if you have a helper method so thats why we use it
     * The current represents the node that the BST is checking during the RECURSIVE process...
     * 
     *  so after you go with the root node, then it either moves left or right based on the 
     *  movie being added
     */
    private boolean addMovieHelper(BSTNode<Movie> current, Movie movie) {
        
        // goes left
        if (movie.compareTo(current.getData()) < 0) {
            if (current.getLeft() == null) {
                //set the current node we're on child to be right
                current.setLeft(new BSTNode<Movie>(movie));
                return true;
            }
            //else we keep recursively going down
            else {
                return addMovieHelper(current.getLeft(), movie);
            }
        }
        // goes right
        else if (movie.compareTo(current.getData()) > 0) {
            if (current.getRight() == null) {
                //set the current node we're on child to be right
                current.setRight(new BSTNode<Movie>(movie));
                return true;
            }
            //else we keep recursively going down
            else {
                return addMovieHelper(current.getRight(), movie);
            }
        }
        // if the movie is a duplicate, will return false and not add anything
        else if (movie.compareTo(current.getData()) == 0) {
            return false;
        }

        return false;
    }

    /*
     * method to check the size of the tree
     */
    public int size() {
        
        if (root == null) {
            return 0;
        }

        return sizeHelper(root);

    }

    /*
     * uses recursion to help the size method easier
     * 
     * the size of a tree is:
     * size of left subtree + right subtree + 1(the node)
     * 
     */
    private int sizeHelper(BSTNode<Movie> current) {
        // we already checked in the size method for a null tree, which should return a size of 0
        // so now we're using recursion to check the rest of the tree
        
        // base case
        // states when the recursion should stop, prevents the method from calling itself indefinitely
        // often the simplest case
        // so for the sizeHelper, it should stop when the current node is null, which means there is nothing to the right/left
        if (current == null) {
            return 0;
        }
        // To calculate the size of the tree, you need to traverse both the left and right subtrees of the current node.
        if (current.getLeft() == null) {
            return 0;
            sizeHelper(current.getLeft());
            current.
        }
        return 0;
    }

    public int height() {

    }

    public boolean contains(Movie movie) {

    }

    public Movie getBestMovie() {

    }

    public List<Movie> lookup(int year, double minimumRating) {

    }



    private int heightHelper(BSTNode<Movie> current) {

    }

    private boolean containsHelper(BSTNode<Movie> current, Movie movie) {

    }

    private Movie getBestMovieHelper(BSTNode<Movie> current) {

    }

    private void lookupHelper(BSTNode<Movie> current, int year, double minimumRating, List<Movie> result) {

    }

    @Override
    public String toString() {

    }
}