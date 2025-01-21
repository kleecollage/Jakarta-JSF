package beans.lifecycle;

import jakarta.faces.event.PhaseEvent;
import jakarta.faces.event.PhaseId;
import jakarta.faces.event.PhaseListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DebuggerListener implements PhaseListener {
    Logger log = LogManager.getRootLogger();

    @Override
    public void beforePhase(PhaseEvent pe) {
        if(log.isInfoEnabled())
            log.info("Before phase: " + pe.getPhaseId().toString());
    }

    @Override
    public void afterPhase(PhaseEvent event) {
        if(log.isInfoEnabled())
            log.info("After phase: " + event.getPhaseId().toString());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}
