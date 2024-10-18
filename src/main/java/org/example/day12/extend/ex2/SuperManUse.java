package org.example.day12.extend.ex2;

public class SuperManUse {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan("SuperMan","Male",4);
//        superMan.name = "Superman";
//        superMan.gender = "Male";
//        superMan.power = 4;

        System.out.println(superMan);

        superMan.run();
        superMan.fly();
        superMan.eat();
        superMan.sleep();
    }
}
