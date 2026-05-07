package PolyMorOverriding;

class Employee {

    int getBonus(){
        return 1000;
    }

}

class Boss extends Employee {

    @Override
    int getBonus(){
        return 2000;
    }

}

class Developer extends Employee {

    int getBonus(){
        return 3000;
    }


    public static void main(String[] args) {
        Employee e = new Boss();
        int result = e.getBonus();
        System.out.println("The Bonus has Boss is: " + result);

        Employee ee = new Developer();
        int resultt = ee.getBonus();
        System.out.println("The Bonus has Developer is :"+ resultt);
    }
}
