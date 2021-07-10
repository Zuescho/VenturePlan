package hu.gaboros.ventureplan.logparser.service;

import hu.gaboros.ventureplan.logparser.model.MissionReport;
import org.springframework.data.repository.CrudRepository;

public interface MissionRepository extends CrudRepository<MissionReport, Long> {
}
