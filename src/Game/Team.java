package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipants(T participant, T participant2){
        participants.add(participant);
        participants.add(participant2);
        System.out.println("In command: " + name + " added new member: " + participant.getName() + " AND "
        + participant2.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if ( i == 0){
            winnerName = this.name;
        }else {
            winnerName = team.name;
        }
        System.out.println("Win team: " + winnerName);
    }
}
