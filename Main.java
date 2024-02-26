package hw_oop_sem3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<UnitBase> team1 =new ArrayList<>();
        ArrayList<UnitBase> team2 =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
//2-04 video
            switch (new Random().nextInt(7)){
                case 0:
                    team1.add(new Crossbowman(i,0,getName()));
                    break;
                case 1:
                    team1.add(new Magician(i,0,getName()));
                    break;
                case 2:
                    team1.add(new Monk(i,0,getName()));
                    break;
                case 3:
                    team1.add(new Outlaw(i,0,getName()));
                    break;
                case 4:
                    team1.add(new Peasant(i,0,getName()));
                    break;
                case 5:
                    team1.add(new Sniper(i,0,getName()));
                    break;
                case 6:
                    team1.add(new Spearman(i,0,getName()));
                    break;

            }
            switch (new Random().nextInt(7)){
                case 0:
                    team2.add(new Crossbowman(i,9,getName()));
                    break;
                case 1:
                    team2.add(new Magician(i,9,getName()));
                    break;
                case 2:
                    team2.add(new Monk(i,9,getName()));
                    break;
                case 3:
                    team2.add(new Outlaw(i,9,getName()));
                    break;
                case 4:
                    team2.add(new Peasant(i,9,getName()));
                    break;
                case 5:
                    team2.add(new Sniper(i,9,getName()));
                    break;
                case 6:
                    team2.add(new Spearman(i,9,getName()));
                    break;

            }

        }

        team1.sort(new LeadComp());
        team2.sort(new LeadComp());
        System.out.println("команда 1");
        for (UnitBase team:team1){
            System.out.println(team.toString());
        }
        System.out.println("команда 2");
        for (UnitBase team:team2){
            System.out.println(team.toString());
        }
        System.out.println("ataca na команду 2");
        for (UnitBase team:team1){

            team.step(team2);
            //System.out.println(team.toString());
        }
        System.out.println("ataca na команду 1");
        for (UnitBase team:team2){

            team.step(team1);
            //System.out.println(team.toString());
        }
    }
    private static String getName(){
        return String.valueOf(Name.values()[new Random().nextInt(Name.values().length-1)]);
    }
}
