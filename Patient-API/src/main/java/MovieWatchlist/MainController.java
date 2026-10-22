package MovieWatchlist;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/commonPath")

public class MainController {
    private final List<Movie> movies = new ArrayList<>();
    long id;

    public MainController() {
        movies.add(new Movie(1, "Interstellar", 2014));
        movies.add(new Movie(2, "3 Idiots", 2009));
        id = 2;
    }

    @GetMapping("/Movie")
    public List<Movie> getMovies(){
        return movies;
    }

    @GetMapping("/Movie/{id}")
    public Movie getMovie(@PathVariable long id){
        for(Movie m : movies){
            if(m.getId() == id){
                return m;
            }
        }
        return null;
    }

    @PostMapping("/addMovies")
    public List<Movie> addMovies(@RequestBody MovieInput movieInput){
        movies.add(new Movie(id+1, movieInput.getTitle(), movieInput.getReleaseYear()));
        id++;
        return movies;
    }

    @PutMapping("/updateMovies/{id}")
    public List<Movie> updateMovies(@PathVariable long id, @RequestBody MovieInput input){
        Movie movie = movies.get((int)id);
        movie.setTitle(input.getTitle());
        return movies;
    }

}
