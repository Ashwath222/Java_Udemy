package Interface;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints, strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0,name);
        list.add(1,String.valueOf(hitPoints));
        list.add(2,String.valueOf(strength));
        return list;
    }

    public void read(List<String> list) {
        if(list!=null && list.size()>0) {
            name= list.get(0);
            hitPoints=Integer.parseInt(list.get(1));
            strength=Integer.parseInt(list.get(2));
        }
    }

    public String toString() {
        return "Monster{name='"+name+"', hitPoints="+hitPoints+", strength="+strength+"'}";
    }
}
