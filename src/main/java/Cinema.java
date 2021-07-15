import java.util.*;

public class Cinema {

    Map<Days, Schedule> scheduleTreeMap = new HashMap<>();
    List<Movie> moviesLibary = new LinkedList<>();

    static Schedule monday = new Schedule();
    static Schedule thuesday = new Schedule();
    static Schedule wednesday = new Schedule();
    static Schedule thursday = new Schedule();
    static Schedule friday = new Schedule();
    static Schedule saturday = new Schedule();
    static Schedule sunday = new Schedule();

    public void addSeance(Seance seance, String day) {
        if (day.toLowerCase().equals(Days.MONDAY.toString().toLowerCase())) {
            monday.addSeance(seance);
            scheduleTreeMap.put(Days.MONDAY, monday);
        } else if (day.toLowerCase().equals(Days.THUESDAY.toString().toLowerCase())) {
            thuesday.addSeance(seance);
            scheduleTreeMap.put(Days.THUESDAY, thuesday);
        } else if (day.toLowerCase().equals(Days.WEDNESDAY.toString().toLowerCase())) {
            wednesday.addSeance(seance);
            scheduleTreeMap.put(Days.WEDNESDAY, wednesday);
        } else if (day.toLowerCase().equals(Days.THURSDAY.toString().toLowerCase())) {
            thursday.addSeance(seance);
            scheduleTreeMap.put(Days.THURSDAY, thursday);
        } else if (day.toLowerCase().equals(Days.FRIDAY.toString().toLowerCase())) {
            friday.addSeance(seance);
            scheduleTreeMap.put(Days.FRIDAY, friday);
        } else if (day.toLowerCase().equals(Days.SATURDAY.toString().toLowerCase())) {
            saturday.addSeance(seance);
            scheduleTreeMap.put(Days.SATURDAY, saturday);
        } else if (day.toLowerCase().equals(Days.SUNDAY.toString().toLowerCase())) {
            sunday.addSeance(seance);
            scheduleTreeMap.put(Days.SUNDAY, sunday);
        } else
            System.out.println("такого дня не існує, введіть будь ласка все з початку ");
    }



    public void showShcedule() {
        for (Map.Entry<Days, Schedule> run : scheduleTreeMap.entrySet()) {
            System.out.print("День: " + run.getKey() + " Розклад: ");
            run.getValue().showSeances();
        }
    }

    public void clearSeance(String day) {
        for (Map.Entry<Days, Schedule> run : scheduleTreeMap.entrySet()) {
            if (day.toLowerCase().equals(run.getKey().toString().toLowerCase())) {
                run.getValue().clearSeance();
            }
        }
    }

    public void removeMovie(String rem) {
        for (Movie m : moviesLibary) {
            if (m.getTitle().equals(rem.toString())) {
                moviesLibary.remove(m);
            }
        }
    }

    public void addToLibary(Movie movie) {
        moviesLibary.add(movie);
    }

    public void showLibary() {
        for (Movie m : moviesLibary) {
            System.out.println(m);
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "scheduleTreeMap=" + scheduleTreeMap +
                ", moviesLibary=" + moviesLibary +
                '}';
    }
}


