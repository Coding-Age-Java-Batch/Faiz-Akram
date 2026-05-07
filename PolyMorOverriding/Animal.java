package PolyMorOverriding;

class Animal {
    void speak(){
        System.out.println("Animal speak like:");
    }
}

class Cat extends  Animal{
    @Override
    void speak(){
        System.out.println("Cat speak Meowwwwnnnnn");
    }
}

class Dog extends Cat{
    @Override
    void speak(){
        System.out.println("Dog speak hoowowowowowwoow");
    }

    public static void main(String[] args){
        Cat c = new Cat();
        Dog d = new Dog();

        c.speak();
        d.speak();

    }
}