package beans.backing;

import beans.helper.SuburbHelper;
import beans.model.Candidate;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIInput;
import jakarta.faces.component.UIViewRoot;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ActionEvent;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class VacantForm {
    @Inject
    private Candidate candidate;

    private boolean commentSent;

    @Inject
    private SuburbHelper suburbHelper;

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

    public void zipCodeListener(ValueChangeEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot viewRoot = facesContext.getViewRoot();
        int newZipCode = ((Long) event.getNewValue()).intValue();
        // ACCESS TO COMPONENT
        UIInput suburbIdInputText = (UIInput) viewRoot.findComponent("vacantForm:suburbId");
        int newSuburbId = this.suburbHelper.getSuburbIdByZipCode(newZipCode);
        suburbIdInputText.setValue(newSuburbId);
        suburbIdInputText.setSubmittedValue(newSuburbId);
        // ACCESS COMPONENT
        UIInput cityInputText = (UIInput) viewRoot.findComponent("vacantForm:city");
        String newCity = "Ciudad de Mexico";
        cityInputText.setValue(newCity);
        cityInputText.setSubmittedValue(newCity);
        // SEND RESPONSE
        facesContext.renderResponse();
    }

    public void hideComment(ActionEvent event) {
        this.commentSent = !this.commentSent;
    }

    public boolean isCommentSent() {
        return commentSent;
    }

    public void setCommentSent(boolean commentSent) {
        this.commentSent = commentSent;
    }




    public SuburbHelper getSuburbHelper() {
        return suburbHelper;
    }

    public void setSuburbHelper(SuburbHelper suburbHelper) {
        this.suburbHelper = suburbHelper;
    }
}
