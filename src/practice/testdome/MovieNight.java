package practice.testdome;

import java.util.*;
import java.text.SimpleDateFormat;

public class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies) {
        Movie[] sortedMovies = new Movie[movies.size()];

        movies.toArray(sortedMovies);

        Arrays.sort(sortedMovies, (m1, m2) -> {
            long f = m1.getStart().getTime();
            long s = m2.getStart().getTime();
            return f < s ? -1 : s < f ? 1 : 0;
        });

        long beforeEndTime = 0;
        for(Movie movie : sortedMovies) {
            if (movie.getStart().getTime() < beforeEndTime)
                return false;
            beforeEndTime = movie.getEnd().getTime();
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));

        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;

    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}