package Interface;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(0,name);
        list.add(1,String.valueOf(hitPoints));
        list.add(2,String.valueOf(strength));
        list.add(3,weapon);
        return list;
    }

    public void read(List<String> list) {
        if(list!=null && list.size()>0) {
            name= list.get(0);
            hitPoints=Integer.parseInt(list.get(1));
            strength=Integer.parseInt(list.get(2));
            weapon= list.get(3);
        }
    }

    public String toString() {
        return "Player{name='"+name+"', hitPoints="+hitPoints+", strength="+strength+", weapon='"+weapon+"'}";
    }
}
