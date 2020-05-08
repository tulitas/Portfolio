package Portfolio.Applications.Calendar.Repositories;

import Portfolio.Applications.Calendar.Entities.Jobform;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobformRepository extends CrudRepository<Jobform, Long> {

    List<Jobform> findById(long id);
}
