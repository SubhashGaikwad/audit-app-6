package com.techvg.auditapp6.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnnexureAnswersMapperTest {

  private AnnexureAnswersMapper annexureAnswersMapper;

  @BeforeEach
  public void setUp() {
    annexureAnswersMapper = new AnnexureAnswersMapperImpl();
  }
}
