package com.jav.bokep;


public class bokep {
    public static void main(String[] args){
Player okana = new Player("okana", "1", "-100");
Weapon realokana = new Weapon("okana's power sword", 1990,"Insanely Fast litereli chiting no cap");
Armor okanaArmor = new Armor(1000, true);
okana.equip(realokana, okanaArmor);
okana.display();
okanaArmor.display();

Player anotherOkana = new Player("Dayum okana", "1000", "6000009");
Weapon anotherOkanaOfficialSwordNoCheatingLMAWW = new Weapon("Official Okana's Katana Sword w/ Built-in Shotgun",500000,"Can't be seen, because how fast it is");
Armor anotherOkanaOfficialArmor = new Armor(500000,false);
anotherOkana.equip(anotherOkanaOfficialSwordNoCheatingLMAWW, anotherOkanaOfficialArmor);
anotherOkana.display();
anotherOkanaOfficialArmor.display();
    }
}

class Player{

    String name;
    String level;
    String critdmg;
    Weapon weapontype;
    int atk;
    String atkspeed;

    int defencepercent;
    boolean cosmetic;

    Player(String name, String level, String critdmg){
        this.name       = name;
        this.level      = level;
        this.critdmg    = critdmg;
    }
    void equip(Weapon weapontype, Armor armor){
        this.weapontype = weapontype;
        this.atk = atk;
        this.atkspeed = atkspeed;
        this.defencepercent = defencepercent;
        this.cosmetic = cosmetic;

    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("level : " + this.level);
        this.weapontype.display();


    }
}
class Weapon{
    String weapontype;
    int atk;
    String atkspeed;
    Weapon(String weapontype, int atk, String atkspeed){
        this.weapontype = weapontype;
        this.atk = atk;
        this.atkspeed = atkspeed;

    }
    void display(){
        System.out.println("Weapon type : "+this.weapontype + "\nAtk : " +this.atk +"\nAtk Speed : "+ this.atkspeed);
    }
}
class Armor{

    int defencepercent;
    boolean cosmetic;
    Armor(int defencepercent, boolean cosmetic){
        this.defencepercent = defencepercent;
        this.cosmetic = cosmetic;

    }
    void display(){
        char yes;
        if (this.cosmetic){
            yes = 'y';
        } else{
            yes = 'n';
        }
        System.out.println("\nDefence Percentage : " + this.defencepercent +"\nCosmetic : "+ yes);

    }
}
