public class Main {
    public static void main(String[] args) {
        Human me = new Human(new happyHuman());
        me.makeSad();
    }
}

enum currentMood
{
    Happy, Sad
}

class Human {
    public Human(humanMood cur){
        Mood = cur;
    }

    public void makeHappy(){
        Mood.getHappier(this);
    }

    public void makeSad(){
        Mood.getSadder(this);
    }
    public humanMood Mood;
}

interface humanMood {
    void getHappier(Human man);
    void getSadder(Human man);
}

class happyHuman implements humanMood {

    @Override
    public void getHappier(Human man) {

    }

    @Override
    public void getSadder(Human man) {
        man.Mood = new sadHuman();
        System.out.println("Now sad!");
    }
}

class sadHuman implements humanMood {

    @Override
    public void getHappier(Human man) {
        man.Mood = new happyHuman();
        System.out.println("Now happy!");
    }

    @Override
    public void getSadder(Human man) {}
}