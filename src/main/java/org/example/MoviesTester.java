import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;


public class MoviesTester
{
   public static void main(String[] args) throws IOException
   {
      List<Movie> moviesList = Movies.readMovies("movies.txt");
 
      // You'll write this method
      List<String> initialWords = commonInitialWords(moviesList.stream());
      
      System.out.println("Size: " + initialWords.size());
      System.out.println("Expected: 100");
      System.out.println("Word #1: " + initialWords.get(0));
      System.out.println("Expected: The");
      System.out.println("Word #2: " + initialWords.get(1));
      System.out.println("Expected: A");
      System.out.println("Word #3: " + initialWords.get(2));
      System.out.println("Expected: In");
      System.out.println("Word #4: " + initialWords.get(3));
      System.out.println("Expected: My");
      System.out.println("Word #5: " + initialWords.get(4));
      System.out.println("Expected: Love");
      System.out.println("Word #100: " + initialWords.get(99));
      System.out.println("Expected: She");
   }
   
   /**
    * Given a Stream<Movie> return the 100 most common
    * starting words.
    */
   public static List<String> commonInitialWords(Stream<Movie> stream) {
      //TODO: Add your work here

   }
      
      
      

      
      
      
      
}