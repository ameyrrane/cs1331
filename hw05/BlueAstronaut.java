import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class BlueAstronaut extends Player implements Crewmate{
    private int numTasks;
    private int taskSpeed;
    
    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        super(name, susLevel);
        this.numTasks = numTasks;
        if (taskSpeed > 0) {
            this.taskSpeed = taskSpeed;
        }
    }

    public BlueAstronaut(String name) {
        this(name, 15, 6, 10);
    }

    public void completeTask(){
        if(this.isFrozen() || this.numTasks == 0) {
            return;
        }
        if(this.taskSpeed > 20) {
            this.numTasks -= 2;
        } else {
            this.numTasks -= 1;
        }
        if (numTasks < 0) {
            numTasks = 0;
        }
        if (numTasks == 0) {
            System.out.println("I have completed all my tasks");
            int newSusLevel = (int) (this.getSusLevel() * 0.50);
            this.setSusLevel(newSusLevel);
        }
    }
    

    public int getNumTasks() {
        return numTasks;
    }

    public String toString() {
        String printString = "My name is " + this.getName() + ", and I have a suslevel of " + this.getSusLevel()
                + ". I am currently " + (this.isFrozen() ? "frozen" : "not frozen") + ". I have " + this.getNumTasks()
                + " left over.";
        if (this.getSusLevel() > 15) {
            return printString.toUpperCase();
        }
        return printString;

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

            if (currentPlayers[index] == currentPlayers[index - 1]) {
                break;
            }

            if (!currentPlayers[index].isFrozen()) {
                currentPlayers[index].setFrozen(true);
                this.gameOver();
                break;

            }
        }

    }

    public boolean equals(Object o) {
        if (o instanceof BlueAstronaut) {
            BlueAstronaut player = (BlueAstronaut) o;
            return this.getName().equals(player.getName()) && this.isFrozen() == player.isFrozen()
                    && this.getSusLevel() == player.getSusLevel();
        }
        return false;
    }


}
