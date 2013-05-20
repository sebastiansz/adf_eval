package fusion.monitor.model.producer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ProducerController {

    private List<ProducerBean> modelAllProducers;

    private List<ProducerBean> modelFindProducers;

    private ProducerSearchParametersBean modelProducerSearchParameters;

    private ProducerBean modelCreateProducer;

    private ProducerBean modelEditProducer;


    public ProducerController() {
        initializeModel();
    }

    private void initializeModel() {
        actionInitCreateProducer();
    }


    /**
     *
     */
    public String actionInitCreateProducer() {
        System.err.println("actionInitCreateProducer()");
        modelCreateProducer = new ProducerBean();
        return null;
    }

    /**
     *validateSearchParameters
     * @return
     */
    public String validateSearchParameters() {
        System.err.println("validateSearchParameters()");
        return null;
    }

    /**
     * Action actionFindProducers
     */
    public void actionAllProducers() {

        System.err.println("actionAllProducers()");

        modelAllProducers = new ArrayList<ProducerBean>();
        Random pRandom = new Random();
        int pSize = pRandom.nextInt(50);
        for (int i = 0; i < pSize; i++) {
            ProducerBean pProducer = new ProducerBean();
            pProducer.setActivityState(pRandom.nextInt(5));
            pProducer.setAddress("Big boom " + i);
            pProducer.setCloseDate(new Date());
            pProducer.setEmail("producer_" + i + "@mail.com");
            pProducer.setName("Producer " + i);
            pProducer.setRegistrationDate(new Date());
            pProducer.setSecurityId("SN" + i);
            pProducer.setStartDate(new Date());
            pProducer.setYearIncome(pRandom.nextLong());
            modelAllProducers.add(pProducer);
        }
    }


    /**
     * Action actionFindProducers
     */
    public void actionFindProducers() {

        System.err.println("actionFindProducers(" + modelProducerSearchParameters + ")");

        modelFindProducers = new ArrayList<ProducerBean>();
        Random pRandom = new Random();
        int pSize = pRandom.nextInt(50);
        for (int i = 0; i < pSize; i++) {
            ProducerBean pProducer = new ProducerBean();
            pProducer.setActivityState(pRandom.nextInt(5));
            pProducer.setAddress("Big boom " + i);
            pProducer.setCloseDate(new Date());
            pProducer.setEmail("producer_" + i + "@mail.com");
            pProducer.setName("Found producer " + i);
            pProducer.setRegistrationDate(new Date());
            pProducer.setSecurityId("SN" + i);
            pProducer.setStartDate(new Date());
            pProducer.setYearIncome(pRandom.nextLong());
            modelFindProducers.add(pProducer);
        }
    }

    public List<ProducerBean> getModelAllProducers() {
        return modelAllProducers;
    }

    public void setModelAllProducers(List<ProducerBean> allProducersModel) {
        this.modelAllProducers = allProducersModel;
    }

    public void setModelFindProducers(List<ProducerBean> findProducersModel) {
        this.modelFindProducers = findProducersModel;
    }

    public List<ProducerBean> getModelFindProducers() {
        return modelFindProducers;
    }

    public void setModelProducerSearchParameters(ProducerSearchParametersBean modelProducerSearchParameters) {
        this.modelProducerSearchParameters = modelProducerSearchParameters;
    }

    public ProducerSearchParametersBean getModelProducerSearchParameters() {
        return modelProducerSearchParameters;
    }


    public void setModelCreateProducer(ProducerBean modelCreateProducer) {
        this.modelCreateProducer = modelCreateProducer;
    }

    public ProducerBean getModelCreateProducer() {
        return modelCreateProducer;
    }

    public void setModelEditProducer(ProducerBean modelEditedProducer) {
        this.modelEditProducer = modelEditedProducer;
    }

    public ProducerBean getModelEditProducer() {
        return modelEditProducer;
    }
}
