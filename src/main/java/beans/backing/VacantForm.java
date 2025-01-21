package beans.backing;

import beans.model.Candidate;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
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

    public VacantForm() {
        log.info("Created object VacantForm");
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String send() {
        if (candidate.getName().equals("John")) {
            if (this.candidate.getSurname().equals("Doe")) {
                String msg = "Thank you but John Doe already work with us";
                FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                FacesContext facesContext = FacesContext.getCurrentInstance();
                String componentId = null;
                facesContext.addMessage(componentId, facesMessage);
                return "index";
            }
            log.info("Enter success case");
            return "success";
        }
        else {
            log.info("Enter failure case");
            return "failure";
        }
    }
}
