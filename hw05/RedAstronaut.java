import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor {

    private String skill;

    public RedAstronaut(String name, int susLevel, String skill) {
        super(name, susLevel);
        skill = skill.toLowerCase();
        if (skill.equals("inexperienced") || skill.equals("experienced") || skill.equals("expert")) {
            this.skill = skill;
        }
    }

    public RedAstronaut(String name) {
        this(name, 15, "experienced");
    }

    public void freeze(Player p) {
        if (p instanceof Impostor || this.isFrozen() || p.isFrozen()) {
            return;
        }
        if (this.compareTo(p) < 0) {
            p.setFrozen(true);
        } else {
            this.setSusLevel(getSusLevel() * 2);
        }
        this.gameOver();

    }

    public void sabotage(Player p) {
        if (p instanceof Impostor || this.isFrozen() || p.isFrozen()) {
            return;
        }
        if (this.getSusLevel() < 20) {
            int newSusLevel = (int) (p.getSusLevel() * 1.5);
            p.setSusLevel(newSusLevel);
        } else {
            int newSusLevel = (int) (p.getSusLevel() * 1.25);
            p.setSusLevel(newSusLevel);
        }

    }

    public boolean equals(Object o) {
        if (o instanceof RedAstronaut) {
            RedAstronaut player = (RedAstronaut) o;
            return this.getName().equals(player.getName()) && this.isFrozen() == player.isFrozen()
                    && this.getSusLevel() == player.getSusLevel();
        }
        return false;
    }

    @Override
    public void emergencyMeeting() {
        // TODO Auto-generated method stub
        if (this.isFrozen()) {
            return;
        }
        Player[] currentPlayers = Player.getPlayers();

        Arrays.sort(currentPlayers);
        for (int index = currentPlayers.length - 1; index >= 0; index--) {

            if (currentPlayers[index].getSusLevel() == currentPlayers[index - 1].getSusLevel()) {
                break;
            }

            if (!currentPlayers[index].equals(this) && !currentPlayers[index].isFrozen()) {
                currentPlayers[index].setFrozen(true);
                this.gameOver();
                break;

            }
        }

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String toString() {
        String printString = "My name is " + this.getName() + ", and I have a suslevel of " + this.getSusLevel()
                + ". I am currently " + (this.isFrozen() ? "frozen" : "not frozen") + ". I am an " + this.getSkill()
                + " player!";
        if (this.getSusLevel() > 15) {
            return printString.toUpperCase();
        }
        return printString;

    }

}
