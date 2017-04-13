package aitc.jj;

/**
 * Created by Studenta on 06.04.2017.
 */
class MilitaryStudent extends Student{

    private String rank;

    public MilitaryStudent(String name, String surname, int age, String rank){
        super(name, surname,age);
        this.rank = rank;

    }

    public void setRank(String rank) {

    }

    public int setRank(String rank, int s){return 1;}

    public String getRank() {
        return rank;
    }
}
