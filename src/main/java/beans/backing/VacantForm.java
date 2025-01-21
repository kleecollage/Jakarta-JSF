package beans.backing;

import beans.model.Candidate;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class VacantForm {
    @Inject
    private Candidate candidate;

    Logger log = LogManager.getLogger(VacantForm.class);

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String send() {
        if (candidate.getName().equals("John")) {
            log.info("Enter success case");
            return "success";
        }
        else {
            log.info("Enter failure case");
            return "failure";
        }
    }
}
