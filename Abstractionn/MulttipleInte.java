package Abstractionn;

public interface MulttipleInte { // the first class
    void start();
    void end();

    static void main(String[] args) {
        Result r = new Result();
        r.start();
        r.end();
        r.namee();
        r.Model();
        r.company();
        r.EngineName();
    }
}

interface SecondInter{// the second class
    void namee();
    void Model();
}

interface ThirdClass{
    void company();
    void EngineName();
}

class Result implements MulttipleInte, SecondInter, ThirdClass {

    public void start(){
        System.out.println("mewoorn");
    }
    public void end(){
        System.out.println("barking");
    }
    public void namee(){
        System.out.println("heeee");
    }
    public void Model(){
        System.out.println("meemmememe");
    }
    public void company(){
        System.out.println("shehheheheheh");
    }
    public void EngineName(){
        System.out.println("heeeekekekkekkeke");
    }


}
