package fusion.monitor.model.beans;

import java.util.Date;

public class AbstractBean {


    public AbstractBean() {
        super();
        System.out.println("new " + getClass().getSimpleName());
    }

}
