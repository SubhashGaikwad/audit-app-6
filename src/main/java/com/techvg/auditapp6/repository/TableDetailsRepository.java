package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.TableDetails;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TableDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TableDetailsRepository
  extends
    JpaRepository<TableDetails, Long>, JpaSpecificationExecutor<TableDetails> {}
