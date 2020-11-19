package behavioral.templatemethod;

import org.w3c.dom.ls.LSOutput;

public abstract class Human {

    void templateBehavioral(){
        System.out.println("Встает");
        whatDo();
        System.out.println("Ложится спать");
    }

    abstract void whatDo();

}
