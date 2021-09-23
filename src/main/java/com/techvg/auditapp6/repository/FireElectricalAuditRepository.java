package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.FireElectricalAudit;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the FireElectricalAudit entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FireElectricalAuditRepository
  extends
    JpaRepository<FireElectricalAudit, Long>,
    JpaSpecificationExecutor<FireElectricalAudit> {}
