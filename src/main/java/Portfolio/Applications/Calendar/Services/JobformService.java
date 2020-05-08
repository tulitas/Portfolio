package Portfolio.Applications.Calendar.Services;

import Portfolio.Applications.Calendar.Entities.Jobform;

import java.util.List;

public interface JobformService {


    void addNewJobform(Jobform jobform);

    List<Jobform> findById(long id);


    void delete(Jobform jobform);

    Object findAll();

    String getJobsperdays(String date3);
}
