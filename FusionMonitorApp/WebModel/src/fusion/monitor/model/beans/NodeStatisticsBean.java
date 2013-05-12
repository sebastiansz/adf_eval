package fusion.monitor.model.beans;

import java.util.Date;

@javax.faces.bean.ManagedBean(name = "nodeBean1")
public class NodeStatisticsBean extends AbstractBean {

    private String nodeName = "fake1";

    private Integer sessionsCurrent;

    private Integer sessionsInactive;

    private Date collectTime;


    public NodeStatisticsBean() {
        super();
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setSessionsCurrent(Integer sessionsCurrent) {
        this.sessionsCurrent = sessionsCurrent;
    }

    public Integer getSessionsCurrent() {
        return sessionsCurrent;
    }

    public void setSessionsInactive(Integer sessionsInactive) {
        this.sessionsInactive = sessionsInactive;
    }

    public Integer getSessionsInactive() {
        return sessionsInactive;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Date getCollectTime() {
        return collectTime;
    }


}
