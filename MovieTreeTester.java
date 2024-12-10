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
        Movie movie4 = new Movie(1993, 8.8, "Bobby Wasabi");
        Movie movie5 = new Movie(1992, 8.8, "Kickin IT");
        Movie movie6 = new Movie(1995, 8.8, "Nemo");
   
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

        MovieTree movieTree1 = new MovieTree();
        Movie movie1 = new Movie(1994, 9.3, "The Shawshank Redemption");
        Movie movie2 = new Movie(2008, 9.0, "The Dark Knight");
        movieTree1.addMovie(movie1); 
        movieTree1.addMovie(movie2); 
        

        // test2: the size should be 2
        if (movieTree1.size() != 2) {
            System.out.println("Test 2 for testSize failed.");
            System.out.println(String.valueOf(movieTree1.size()));
            return false;
        }
        // test3: testing with more than 2
        // test4: testing with exceptions
        return true;
    }
    public static boolean testHeight() {
        return false;
    }
    public static boolean testContains() {
        MovieTree movieCat = new MovieTree();
        Movie movie1 = new Movie(2002, 9.2, "Nemo");
        Movie movie2 = new Movie(2004, 7.6, "Nemo 2");
        Movie movie3 = new Movie(2012, 5.5, "Your Name");

        movieCat.addMovie(movie1);
        movieCat.addMovie(movie2);


        if (movieCat.contains(movie2) != true) {
            System.out.println(movieCat.size());
            return false;
        }
        if (movieCat.contains(movie1) != true) {
            System.out.println("test2 of testContains failed");
            return false;
        }
        if (movieCat.contains(movie3) == true) {
            System.out.println("test3 of testContains failed");
            return false;
        }
 
        return true;
    }
    public static boolean testLookup() {
        return false;
    }
    public static boolean testToString() {
        {
            //test case 1
            MovieTree moviecat = new MovieTree();
            Movie movie1 = new Movie(2002, 9.5, "Nemo");
            Movie movie2 = new Movie(2023, 6.4, "Shark attack");
            Movie movie3 = new Movie(2054, 2.3, "Fire boy lava girl");

            moviecat.addMovie(movie1);
            //  [Year: (2002) Rate: (9.5) Name: (Nemo)]
            if (!"[Year: (2002) Rate: (9.5) Name: (Nemo)]".equals(moviecat.toString())) {
                System.out.println("test1 of testToString failed");
                System.out.println(moviecat.toString());
                return false;
            }
        }
        
        {
            //test case 2
            MovieTree moviecat = new MovieTree();
            Movie movie2 = new Movie(2002, 9.5, "Nemo");
            Movie movie1 = new Movie(2023, 6.4, "Shark attack");
            Movie movie3 = new Movie(2054, 2.3, "Fire boy lava girl");

            moviecat.addMovie(movie2);
            moviecat.addMovie(movie1);
            moviecat.addMovie(movie3);
            System.out.println(moviecat.toString());
            //  [Year: (2002) Rate: (9.5) Name: (Nemo)]
            if (!moviecat.toString().equalsIgnoreCase("[Year: (2002) Rate: (9.5) Name: (Nemo)] [Year: (2023) Rate: (6.4) Name: (Shark attack)]")) {
                System.out.println(moviecat.toString());
                System.out.println("test2 of testToString failed");
                return false;
            }
        }
        

        return true;
    }
    public static void main(String[] args) {
        System.out.println("testAddMovie: " + testAddMovie());
        System.out.println("testSize: " + testSize());
        System.out.println("testHeight: " + testHeight());
        System.out.println("testContains: " + testContains());
        System.out.println("testLookup: " + testLookup());
        System.out.println("testToString: " + testToString());
    }
}