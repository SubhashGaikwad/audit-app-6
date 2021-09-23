package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.InventoryReport;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the InventoryReport entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InventoryReportRepository
  extends
    JpaRepository<InventoryReport, Long>,
    JpaSpecificationExecutor<InventoryReport> {}
