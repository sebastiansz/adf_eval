package fusion.monitor.model.controller;

import fusion.monitor.model.beans.NodeStatisticsBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class MonitorController {

    public MonitorController() {
        super();
    }


    public List<NodeStatisticsBean> findAllNodeStatistics() {
        List<NodeStatisticsBean> pResult = new ArrayList<NodeStatisticsBean>();
        int pListSize = new Random().nextInt(50);
        for (int i = 0; i < pListSize; i++) {
            NodeStatisticsBean pBean = new NodeStatisticsBean();
            pBean.setCollectTime(new Date());
            pBean.setNodeName("Node_" + i);
            pBean.setSessionsCurrent(new Random().nextInt(1000));
            pBean.setSessionsInactive(23);
            pResult.add(pBean);
        }
        return pResult;
    }


}
