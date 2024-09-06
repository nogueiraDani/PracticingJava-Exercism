import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DnDCharacter {

    private final int strenght;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    public DnDCharacter() {
        this.strenght = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        var copyScores = new ArrayList<Integer>(scores);
        copyScores.remove(Collections.min(copyScores));

        return copyScores.stream().reduce(0, Integer::sum);
    }

    List<Integer> rollDice() {
        List<Integer> list = new ArrayList<>();
        SecureRandom secureRandom = new SecureRandom();

        list.add(1 + secureRandom.nextInt(6));
        list.add(1 + secureRandom.nextInt(6));
        list.add(1 + secureRandom.nextInt(6));
        list.add(1 + secureRandom.nextInt(6));

        return list;
    }

    int modifier(int input) {
        return (int) Math.floor(((double) input - 10) / 2.0);
    }

    int getStrength() {
        return this.strenght;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
