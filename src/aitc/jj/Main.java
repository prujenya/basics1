package aitc.jj;

public class Main {

	public static void main(String[] args) {
	/* write your code here
        //lkdlskdflksjd
        //ld;flskd;lfks;dlf
        */
	System.out.println("welcome to the Armeniam - Indian training center!");
/*
	Animal ani = new Animal(false,"Jenya", false);
	ani.eat();

	ani.setHungry("meat");

	String own = ani.getOwnerName();
	boolean hgry = ani.getHungry();*/

	//System.out.println("owner: " + own + ", is hungry? " + hgry);

	/*Dog mydog = new Dog(true, "Zara", true, false, true,false);

	mydog.setFriendly(false);
	mydog.setBarking(true);
	mydog.examination();
	mydog.setHungry("meat");

	System.out.println("owner: " + mydog.getOwnerName() + ", is hungry? " + mydog.getHungry());*/
	String surname = "";

	String[] surnames = {"Gasparyan","Mayilyn","Marutyan","Tserunyan","Stepanyan","Grigoryan","Margaryan", "Yeghiazaryan"};

	String[] names = {};
	int len = surnames.length;




	for (int i = 0; i < len; i++){

        switch (surnames[i].charAt(0)){

            case 'M':
                System.out.println(surnames[i] + " surname starts from the M letter" );
                break;

            case 'A':
                System.out.println(surnames[i] + " surname starts from the G letter" );
                break;

            /*default:
                System.out.println("we love all our participant" );
                break;*/
        }

	}

	/*

	int j = 0;

	while (j<len){
	    System.out.println("my surname: " + surnames[j]);
	    j ++;

	    if(5==j)
	        break;
	}*/









    }
}


