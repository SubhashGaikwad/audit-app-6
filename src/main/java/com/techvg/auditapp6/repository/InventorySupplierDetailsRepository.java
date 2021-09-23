package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.InventorySupplierDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the InventorySupplierDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InventorySupplierDetailsRepository
  extends
    JpaRepository<InventorySupplierDetails, Long>,
    JpaSpecificationExecutor<InventorySupplierDetails> {}
