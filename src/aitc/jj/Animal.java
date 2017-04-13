package aitc.jj;

/**
 * Created by Studenta on 10.04.2017.
 */
public class Animal {

    private boolean isMammal;
    private String ownerName;
    private boolean isHungry;

    public Animal(boolean isMammal,
                  String ownerName,
                  boolean isHungry){

        this.isMammal = isMammal;
        this.ownerName = ownerName;
        this.isHungry = isHungry;

    }

    public Animal() {

    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void setHungry(String food){

        if("meat" == food){

            this.isHungry = false;
        }
        else if("plant" == food){

            this.isHungry = false;
        }
        else{

            this.isHungry = true;
        }

    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public boolean getHungry(){

        return isHungry;

    }

    public void sleep(){

        System.out.println("I am sleeping");

    }

    public void eat(){

        System.out.println("I am eating");

    }


}

