import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {

    List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        return Collections.max(highScores);

    }

    List<Integer> personalTopThree() {
        List<Integer> list = new ArrayList<>(List.copyOf(highScores));
        list.sort(Collections.reverseOrder());

        return list.subList(0, Math.min(3, list.size()));
    }

}
