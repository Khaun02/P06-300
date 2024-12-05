/** Generic class for a node
 * 
 * @author Shaun Khang
 * 
 * NOTES:
 * the "implements Comparable<Movie> works by first"
 *      adding the comparable interface to our file
 *      then we can use the methods in the comparable interface
 *      for <> we write in the name of the class we want to compare
 */
import java.lang.Comparable;

public class Movie implements Comparable<Movie> {
    private int year;
    private double rating;
    private String name;

    // constructor for the Movie
    public Movie(int year, double rating, String name) {
        this.year = year;
        this.rating = rating;
        this.name = name;
    }
    public int getYear() {
        return this.year;
    }

    public double getRating() {
        return this.rating;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Movie other) {
        // so first we want to check if the years are the same, if they aren't then this if statement goes to work
        //      it then compares the years and return 0 if they're the same, which it shouldn't because of the if statement,
        //      then it checks if the years are greater than each other or less
        //      if this.year > other.year returns 1
        //      else returns -1 because its a lower year
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        // same implementation as the first if statement
        if (this.rating != other.rating) {
            return Double.compare(this.rating, other.rating);
        }
        // otherwise if the year and the ratings are the same, it'll go alphabetically for the names
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        String completeName = ("[Year: " + "(" + String.valueOf(this.year) + ") " + "Rate: " + "(" + String.valueOf(this.rating)+") " + "Name: "+"("+this.name+")]");
        return completeName;
    }
}