public class Seance {

    private Movie movie;
    private Time startTimeSeance;
    private Time endTimeSeance;

    public Seance(Movie movie, Time startTimeSeance) {
        this.movie = new Movie(movie.getTitle(), movie.getTimeDuration());
        this.startTimeSeance = new Time(startTimeSeance.getHour(), startTimeSeance.getMin());
        this.endTimeSeance = new Time(startTimeSeance.getHour() + movie.getTimeDuration().getHour(), movie.getTimeDuration().getMin() + startTimeSeance.getMin());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTimeSeance() {
        return startTimeSeance;
    }

    public void setStartTimeSeance(Time startTimeSeance) {
        this.startTimeSeance = startTimeSeance;
    }

    public Time getEndTimeSeance() {
        return endTimeSeance;
    }

    public void setEndTimeSeance(Time endTimeSeance) {
        this.endTimeSeance = endTimeSeance;
    }

    @Override
    public String toString() {
        return "Сеанс: " +
                "Фільм - " + movie +
                "  Початок фільму - " + startTimeSeance +
                "  Кінець фільму - " + endTimeSeance +
                ' ';
    }
}
