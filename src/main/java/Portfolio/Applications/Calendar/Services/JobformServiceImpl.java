package Portfolio.Applications.Calendar.Services;

import Portfolio.Applications.Calendar.Entities.Jobform;
import Portfolio.Applications.Calendar.Repositories.JobformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobformServiceImpl implements JobformService {

    private JobformRepository jobformRepository;

    @Autowired
    public JobformServiceImpl(JobformRepository jobformRepository) {
        this.jobformRepository = jobformRepository;
    }

    @Override
   @Transactional
    public void addNewJobform(Jobform jobform) {
        jobformRepository.save(jobform);
        System.out.println(jobform);
        System.out.println("bla bla");
    }

    @Override
    public List<Jobform> findById(long id) {
        return jobformRepository.findById(id);
    }

    @Override
    public void delete(Jobform jobform) {

    }

    @Override
    public Object findAll() {
        return null;
    }

    @Override
    public String getJobsperdays(String date3) {
        return null;
    }
}
