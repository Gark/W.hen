package houtbecke.rs.when.act;

import houtbecke.rs.when.TypedAct;
import houtbecke.rs.when.condition.Timer;

public class TimerStarter extends TypedAct {

    public void act(Timer timer) {
        timer.start();
    }
        
}
