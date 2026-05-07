package Abstractionn;

abstract class Session {
    int noOfTyres;
    void fourWheeler(){  // concrete method:
        System.out.println("Let us know about four wheeler:");
    }

    abstract void CarName();

    static void main(String[] args) {
        Honda h = new Honda();
        h.fourWheeler();
        h.CarName();

        System.out.println("<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>");

        Toyota t = new Toyota();
        t.fourWheeler();
        t.CarName();
    }

}
class Honda extends Session{
    @Override
    void fourWheeler() {
//        super.fourWheeler();
        System.out.println("Yes it is four wheeler:");
    }

    void CarName(){
        noOfTyres = 3;
        System.out.println("Civic:");
        System.out.println(noOfTyres);
    }

}

class Toyota extends Session{
    @Override
    void CarName() {
        noOfTyres = 4;
        System.out.println("Hilux:");
        System.out.println(noOfTyres);
    }
}



