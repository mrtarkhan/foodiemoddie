package ir.drp.it.foodiemoodie.jobs;


import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
public class CreateMonthJob extends QuartzJobBean {


    @Override
    protected void executeInternal(org.quartz.JobExecutionContext jobExecutionContext)
            throws JobExecutionException
    {

    }

}
