package com.techvg.auditapp6.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.techvg.auditapp6.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class AnnexureAnswersTest {

  @Test
  void dtoEqualsVerifier() throws Exception {
    TestUtil.equalsVerifier(AnnexureAnswers.class);
    AnnexureAnswers annexureAnswers1 = new AnnexureAnswers();
    annexureAnswers1.setId(1L);
    AnnexureAnswers annexureAnswers2 = new AnnexureAnswers();
    assertThat(annexureAnswers1).isNotEqualTo(annexureAnswers2);
    annexureAnswers2.setId(annexureAnswers1.getId());
    assertThat(annexureAnswers1).isEqualTo(annexureAnswers2);
    annexureAnswers2.setId(2L);
    assertThat(annexureAnswers1).isNotEqualTo(annexureAnswers2);
    annexureAnswers1.setId(null);
    assertThat(annexureAnswers1).isNotEqualTo(annexureAnswers2);
  }
}
