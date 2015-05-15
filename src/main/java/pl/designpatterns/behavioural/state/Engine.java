package pl.designpatterns.behavioural.state;

import java.util.HashMap;
import java.util.Map;

public class Engine {

    public static final String STOPPED_STATE = "STOPPED";
    public static final String RUNNING_STATE = "RUNNING";
    private EngineState engineState;
    private Map<String, EngineState> engineStateMap;

    public Engine() {
        engineStateMap = new HashMap<String, EngineState>();
        engineStateMap.put(STOPPED_STATE, new StoppedEngineState());
        engineStateMap.put(RUNNING_STATE, new RunningEngineState());
        engineState = engineStateMap.get(STOPPED_STATE);
    }

    public void start() {
        engineState.start(this);
    }

    public void accelerate() {
        engineState.accelerate(this);
    }

    public void stop() {
        engineState.stop(this);
    }

    void setIntoRunningState() {
        engineState = engineStateMap.get(RUNNING_STATE);
    }

    void setIntoStoppedState() {
        engineState = engineStateMap.get(STOPPED_STATE);
    }
}
