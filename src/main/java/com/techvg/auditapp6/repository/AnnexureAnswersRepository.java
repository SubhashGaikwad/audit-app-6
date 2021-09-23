package com.techvg.auditapp6.repository;

import com.techvg.auditapp6.domain.AnnexureAnswers;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the AnnexureAnswers entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AnnexureAnswersRepository
  extends
    JpaRepository<AnnexureAnswers, Long>,
    JpaSpecificationExecutor<AnnexureAnswers> {}
