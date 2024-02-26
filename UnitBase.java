package hw_oop_sem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/*
UnitBase

№ приоритет категория название
  lead
1  0        Крестьянин Крестьянин peasant
2  2        пехота     Разбойник  Outlaw
3  1        маг        Колдун     Magician
4  2        пехота     Копейщик   Spearman
5  3        лучник     Снайпер    Sniper
6  3        лучник     Арбалетчик Crossbowman
7  1        маг        Монах      Monk

поля данных
-name
-health - здоровье
-stamina - выносливость
-weapon - оружие

поля поведения

-damage - повреждение
-attack - атака
-death - смерть

 */
abstract class UnitBase implements Step {
    Place position;
    protected String name;
    protected int health;
    protected  int stamina ;
    protected  int weapon;
    protected  int lead;

    protected static Random r = new Random();

    public UnitBase(int x,int y,String name, int health, int stamina, int weapon, int lead) {
        position= new Place(x,y);
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.weapon = weapon;
        this.lead = lead;
    }
    protected void  GetDamage(int damage){
        if(this.health >0){
            this.health -=damage;
        }
    }

    protected void attack(UnitBase target){
        int damage= UnitBase.r.nextInt(health);
        target.GetDamage(damage);
    }
    protected boolean death(UnitBase target){
        if(target.GetHealth() <  0){
            System.out.println("You're dead");
        return false;
        }else {
            return true;
        }
    }
    public int GetHealth(){
        return health;
    }

public int findТearУnemy(ArrayList<UnitBase> team){
        int teamIndex=-1;
        double minDist=Double.MAX_VALUE;
        for (UnitBase team2 :team){
            if (position.Distance(team2.position)< minDist){
                minDist=position.Distance(team2.position);
                teamIndex=team.indexOf(team2);
            }
        }

        return teamIndex;
}



}


