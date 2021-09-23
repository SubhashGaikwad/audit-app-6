package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.AuditPatientMonitoringForm;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the AuditPatientMonitoringForm entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AuditPatientMonitoringFormRepository
  extends
    JpaRepository<AuditPatientMonitoringForm, Long>,
    JpaSpecificationExecutor<AuditPatientMonitoringForm> {}
