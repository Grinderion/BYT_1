import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Mage extends Template {

    String[] namePool = {"Aerthold", "Sharian", "Murgoth"};
    @Override
    public void createName(Character character) {
        int rnd = new Random().nextInt(namePool.length);
        character.setName(namePool[rnd]);
    }

    @Override
    public void setStats(Character character) {
        character.setMain_stat_name("Intelligence");
        character.setMain_stat(ThreadLocalRandom.current().nextInt(15, 21));
        character.setSecondary_stat_name("Wisdom");
        character.setSecondary_stat(ThreadLocalRandom.current().nextInt(10, 16));
        character.setStamina(ThreadLocalRandom.current().nextInt(11, 14));
    }
}
