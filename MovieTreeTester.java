/** Generic class for a node
 * 
 * @author Shaun Khang
 * 
 */
public class MovieTreeTester {
    public static boolean testAddMovie() {
        MovieTree movieTree = new MovieTree();

        Movie movie1 = new Movie(1994, 9.3, "The Shawshank Redemption");
        Movie movie2 = new Movie(2008, 9.0, "The Dark Knight");
        Movie movie3 = new Movie(2010, 8.8, "Inception");
   
        if (movieTree.addMovie(movie1) == false) {
            System.out.println("Test 1 of testAddMovie failed");
            return false;
        }
        if (movieTree.addMovie(movie2) == false) {
            System.out.println("Test 2 of testAddMovie failed");
            return false;
        }
        if (movieTree.addMovie(movie3) == false) {
            System.out.println("Test 3 of testAddMovie failed");
            return false;
        }
        // edge case with adding the same movie
        // edge case with adding something thats not a movie, try catch statements
        return true;
        
    }
    public static boolean testSize() {
        MovieTree movieTree = new MovieTree();
        
        // should just go through this method since i havent added anything to the movieTree
        if (movieTree.size() != 0) {
            System.out.println("Test 1 for testSize failed.");
            return false;
        }
        
        return true;
    }
    public static boolean testHeight() {
        return false;
    }
    public static boolean testContains() {
        return false;
    }
    public static boolean testLookup() {
        return false;
    }
    public static void main(String[] args) {
        System.out.println("testAddMovie: " + testAddMovie());
        System.out.println("testSize: " + testSize());
        System.out.println("testHeight: " + testHeight());
        System.out.println("testContains: " + testContains());
        System.out.println("testLookup: " + testLookup());
    }
}