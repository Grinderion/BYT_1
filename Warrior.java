import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Template {

    String[] namePool = {"Richard", "Robert", "Hadrian"};
    @Override
    public void createName(Character character) {
        int rnd = new Random().nextInt(namePool.length);
        character.setName(namePool[rnd]);
    }

    @Override
    public void setStats(Character character) {
        character.setMain_stat_name("Strength");
        character.setMain_stat(ThreadLocalRandom.current().nextInt(13, 19));
        character.setSecondary_stat_name("Charisma");
        character.setSecondary_stat(ThreadLocalRandom.current().nextInt(9, 15));
        character.setStamina(ThreadLocalRandom.current().nextInt(14, 18));
    }
}