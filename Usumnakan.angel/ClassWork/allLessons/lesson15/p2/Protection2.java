package ClassWork.allLessons.lesson15.p2;

import ClassWork.allLessons.lesson15.p1.Protection;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("konstruktor unasledovanniy iz drugovo paketa");
        System.out.println("n_pro= "+n_pro);
        System.out.println("n_pub= "+n_pub);
    }

}
