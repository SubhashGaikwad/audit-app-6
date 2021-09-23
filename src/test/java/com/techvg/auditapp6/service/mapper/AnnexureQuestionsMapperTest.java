package com.techvg.auditapp6.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnnexureQuestionsMapperTest {

  private AnnexureQuestionsMapper annexureQuestionsMapper;

  @BeforeEach
  public void setUp() {
    annexureQuestionsMapper = new AnnexureQuestionsMapperImpl();
  }
}
