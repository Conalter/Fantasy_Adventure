package weapons;

public class HealingTool {

    private String name;
    private int heal;

    public HealingTool(String name, int heal) {
        this.name = name;
        this.heal = heal;
    }

    public String getName() {
        return name;
    }

    public int getHeal() {
        return heal;
    }

    public void setName(String name) {
        this.name = name;
    }
}
