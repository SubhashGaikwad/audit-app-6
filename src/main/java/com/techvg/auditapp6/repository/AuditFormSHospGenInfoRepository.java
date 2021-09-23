package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.AuditFormSHospGenInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the AuditFormSHospGenInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AuditFormSHospGenInfoRepository
  extends
    JpaRepository<AuditFormSHospGenInfo, Long>,
    JpaSpecificationExecutor<AuditFormSHospGenInfo> {}
