package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.OxygenConsumptionData;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the OxygenConsumptionData entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OxygenConsumptionDataRepository
  extends
    JpaRepository<OxygenConsumptionData, Long>,
    JpaSpecificationExecutor<OxygenConsumptionData> {}
