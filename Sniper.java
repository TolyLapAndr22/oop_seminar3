package hw_oop_sem3;

import java.util.ArrayList;

public class Sniper extends UnitBase {
    protected int accuracy; //точность
    protected  int disguise; // маскировка
   protected int amounOfarrows; //кол стрел

    public Sniper(int x,int y,String name, int health, int stamina, int weapon, int accuracy, int disguise) {
        super(x,y,name, health, stamina, weapon,3);
        this.accuracy = accuracy;
        this.disguise = disguise;
        this.amounOfarrows=5; //кол стрел
    }
    public Sniper(int x,int y,String name) {
        super(x,y,name, 10, 4, 5,3);
        this.accuracy = 3;
        this.disguise = 4;
        this.amounOfarrows=5; //кол стрел
    }
    @Override
    public String toString() {
        return "Sniper '" +
                name + '\'' +
                position.toString()+" arrows "+this.amounOfarrows+", health "+this.health;
    }

    @Override
    public void step(ArrayList<UnitBase> team) {
if(death(Sniper.this )&& this.amounOfarrows>0){
            team.get(findТearУnemy(team)).GetDamage(r.nextInt(1,3));
            this.amounOfarrows-=1;
    System.out.println(this.name+" attacks "+team.get(findТearУnemy(team))+"| arrows after attack "+ this.amounOfarrows);
        }
else {
    System.out.println("arrows "+this.amounOfarrows+", health "+this.health);
}
    }
}


