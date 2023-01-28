public class Store {

    private Movie[] movies;

    public Store() {
        this.movies = new Movie[10];
    }

    public Movie getMovie(int index) {
        Movie movie = new Movie(movies[index]);
        return movie;
    }

    public void setMovie(int index, Movie movie) {
        Movie newMovie = new Movie(movie);
        this.movies[index] = newMovie;
    }

    public String toString() {
        String temp = "";
        for (Movie movie : this.movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
