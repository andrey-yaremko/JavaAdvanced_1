import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {

    Set<Seance> seances = new HashSet<>();

    public void addSeance(Seance seance) {
        seances.add(seance);
    }

    public void showSeances() {
        for (Seance sen : seances) {
            System.out.println(sen);
        }
    }

    public void clearSeance(){
        seances.clear();
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
