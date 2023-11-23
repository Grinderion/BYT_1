public class Character {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String getMain_stat_name() {
        return main_stat_name;
    }

    public void setMain_stat_name(String main_stat_name) {
        this.main_stat_name = main_stat_name;
    }

    public String getSecondary_stat_name() {
        return secondary_stat_name;
    }

    public void setSecondary_stat_name(String secondary_stat_name) {
        this.secondary_stat_name = secondary_stat_name;
    }

    public int getMain_stat() {
        return main_stat;
    }

    public void setMain_stat(int main_stat) {
        this.main_stat = main_stat;
    }

    public int getSecondary_stat() {
        return secondary_stat;
    }

    public void setSecondary_stat(int secondary_stat) {
        this.secondary_stat = secondary_stat;
    }

    String name;
    int stamina;
    String main_stat_name;
    String secondary_stat_name;
    int main_stat;
    int secondary_stat;
}
