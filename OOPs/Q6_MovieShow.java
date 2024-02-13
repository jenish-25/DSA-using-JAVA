package OOPs;

public class Q6_MovieShow {
    public static void main(String[] args) {
        Movie m1=new Movie("RRR","raja mauli","4 star");
        Movie m2=new Movie("KGF","abc");
        Movie m3=new Movie("Pushpa","xyz","3 star");
        Movie m4=new Movie("3 Idiots","pqr","5 star");
        Movie m5=new Movie("FX","marvel");

        Movie[] movies=new Movie[5];
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        movies[3]=m4;
        movies[4]=m5;
        Movie[] res= get5StarMovie(movies);
        for(Movie m:res){
            if(m==null){
                return;
            }
            System.out.println(m.title+" ");
        }
    }
    private static Movie[] get5StarMovie(Movie[] movies) {
        Movie[] res = new Movie[movies.length];
        int i = 0;
        for (Movie n : movies) {
            if (n.rating == "5 star") {
                res[i] = n;
                i++;
            }
        }
        return res;
    }
    }
  class Movie{
    String title;
    String studio;
    String rating;

     public Movie(String title, String studio, String rating) {
          this.title = title;
          this.studio = studio;
          this.rating = rating;
      }
     public Movie(String title, String studio) {
          this.title = title;
          this.studio = studio;
          this.rating = "5 star";
      }
  }
