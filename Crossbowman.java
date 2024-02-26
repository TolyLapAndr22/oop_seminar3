package hw_oop_sem3;

import java.util.ArrayList;

public class Crossbowman extends UnitBase {
    protected int accuracy; // точность
    protected int amounOfarrows; //кол стрел

    public Crossbowman(int x,int y,String name  ) {
        super(x,y,name, 10, 5, 6,3);
        this.accuracy = 6;
        this.amounOfarrows = 7;
    }
    public String toString() {
        return "Crossbowman '" +
                name + '\'' +
                position.toString()+". arrows "+this.amounOfarrows+", health "+this.health
                ;
    }

    public String toString(ArrayList<UnitBase> team) {
        return "Crossbowman '" +
                  name + '\'' +
                 position.toString()+
                "enemy"+ findТearУnemy(team);
    }

    @Override
    public void step(ArrayList<UnitBase> team) {
        if(death(Crossbowman.this )&& this.amounOfarrows>0){
            team.get(findТearУnemy(team)).GetDamage(r.nextInt(1,3));
            this.amounOfarrows-=1;
            System.out.println(this.name+" attacks "+team.get(findТearУnemy(team))+"| arrows after attack "+ this.amounOfarrows);
        }
        else {
            System.out.println("arrows "+this.amounOfarrows);
        }
    }
}
