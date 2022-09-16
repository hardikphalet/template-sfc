package ${package_name}.repositories;


import ${package_name}.entities.Region;
import org.springframework.data.jpa.repository.Query;
import org.trips.service_framework.models.repositories.BaseRepository;

import java.util.List;

public interface ${entity_name}Repository extends BaseRepository<Region> {
    List<${entity_name}> findByParentId(Long ${entity_name}Id);
}
