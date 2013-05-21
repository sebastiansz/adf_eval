package fusion.monitor.model.producer;

import fusion.monitor.model.beans.AbstractBean;

import java.util.Date;

public class ProducerSearchParametersBean extends AbstractBean {

    String name;

    String email;

    String address;

    String securityId;

    Long yearIncome;

    Integer activityState;

    Date registrationDate;

    Date startDate;

    Date closeDate;

    boolean local;

    public ProducerSearchParametersBean() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setYearIncome(Long yearIncome) {
        this.yearIncome = yearIncome;
    }

    public Long getYearIncome() {
        return yearIncome;
    }

    public void setActivityState(Integer activityState) {
        this.activityState = activityState;
    }

    public Integer getActivityState() {
        return activityState;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public boolean isLocal() {
        return local;
    }


    @Override
    public String toString() {
        return "ProducerSearchParametersBean [name=" + name + ", email=" + email + ", address=" + address +
            ", securityId=" + securityId + ", yearIncome=" + yearIncome + ", activityState=" + activityState +
            ", registrationDate=" + registrationDate + ", startDate=" + startDate + ", closeDate=" + closeDate +
            ", local=" + local + "]";
    }
}
