package beans.backing;

import beans.model.Candidate;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class VacantForm {
    @Inject
    private Candidate candidate;

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String send() {
        if (candidate.getName().equals("John")) {
            return "success";
        }
        else {
            return "failure";
        }
    }
}
