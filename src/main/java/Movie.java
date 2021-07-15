public class Movie {

    private String title;
    private Time timeDuration;

    public Movie(String title, Time timeDuration) {
        this.title = title;
        this.timeDuration = new Time (timeDuration.getHour(), timeDuration.getMin());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(Time timeDuration) {
        this.timeDuration = timeDuration;
    }

    @Override
    public String toString() {
        return  title +
                " Тривалість фільму :" + timeDuration;
    }
}
