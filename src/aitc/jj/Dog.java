package aitc.jj;

/**
 * Created by Studenta on 10.04.2017.
 */
public class Dog extends Animal {
    private boolean isFriendly;
    private boolean isBarking;
    private boolean isFemale;

    public Dog(){

    }

    public Dog(boolean isMammal,
               String ownerName,
               boolean isHungry,
               boolean isBarking,   //new field
               boolean isFriendly,
               boolean isFemale){ //new field

        super(isMammal, ownerName, isHungry);

        this.isBarking = isBarking;
        this.isFriendly = isFriendly;

        this.isFemale = isFemale;

    }

    public void setBarking(boolean barking) {
        isBarking = barking;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void examination(){

        if(getIsFemale()){
            System.out.println("dog is a female");
        }
        else{

            System.out.println("dog is a male");
        }

    }

    private boolean getIsFemale(){

        return this.isFemale;
    }

    @Override
    public void setHungry(String food) {
        super.setHungry(food);

    }
}
