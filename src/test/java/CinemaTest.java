import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CinemaTest {

    private Schedule schedule;
    private Cinema cinema;
    private Movie movie;

    @Test
    public void addSeanceTest() {
        schedule = new Schedule();
        Seance seance = new Seance(new Movie("test", new Time(1, 40)), new Time(12, 12));
        schedule.addSeance(seance);

        Iterator<Seance> iterator = schedule.seances.iterator();

        while (iterator.hasNext()) {
            Seance seance1 = iterator.next();
            boolean equals = seance1.equals(seance);

            Assert.assertTrue(equals);
        }
    }

    @Test
    public void addToLibary() {
        cinema = new Cinema();
        Movie movie = new Movie("test", new Time(12, 12));
        cinema.addToLibary(movie);

        boolean equals = cinema.moviesLibary.contains(movie);
        Assert.assertTrue(equals);
    }

    @Test
    public void removeMovie() {
        cinema = new Cinema();
        Movie movie = new Movie("test", new Time(12, 12));
        cinema.addToLibary(movie);
        cinema.removeMovie("test");

        boolean equals = cinema.moviesLibary.contains(movie);
        Assert.assertFalse(equals);
    }

    @Test
    public void clearSeance(){
        schedule = new Schedule();
        Seance seance = new Seance(new Movie("test", new Time(1, 40)), new Time(12, 12));
        schedule.addSeance(seance);
        schedule.clearSeance();

        boolean equals = schedule.seances.contains(seance);
        Assert.assertFalse(equals);


    }
}
