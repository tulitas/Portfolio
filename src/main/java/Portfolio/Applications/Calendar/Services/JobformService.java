package Portfolio.Applications.Calendar.Services;

import Portfolio.Applications.Calendar.Entities.Jobform;

import java.util.List;

public interface JobformService {


    void addNewJobform(Jobform jobform);

    List<Jobform> findById(long id);



    Object findAll();

    String getJobsperdays(String date3);

    void delete(long id);
}
