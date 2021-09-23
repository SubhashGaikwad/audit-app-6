package com.techvg.auditapp6.service.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.techvg.auditapp6.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class AuditPatientMonitoringFormTest {

  @Test
  void dtoEqualsVerifier() throws Exception {
    TestUtil.equalsVerifier(AuditPatientMonitoringForm.class);
    AuditPatientMonitoringForm auditPatientMonitoringForm1 = new AuditPatientMonitoringForm();
    auditPatientMonitoringForm1.setId(1L);
    AuditPatientMonitoringForm auditPatientMonitoringForm2 = new AuditPatientMonitoringForm();
    assertThat(auditPatientMonitoringForm1)
      .isNotEqualTo(auditPatientMonitoringForm2);
    auditPatientMonitoringForm2.setId(auditPatientMonitoringForm1.getId());
    assertThat(auditPatientMonitoringForm1)
      .isEqualTo(auditPatientMonitoringForm2);
    auditPatientMonitoringForm2.setId(2L);
    assertThat(auditPatientMonitoringForm1)
      .isNotEqualTo(auditPatientMonitoringForm2);
    auditPatientMonitoringForm1.setId(null);
    assertThat(auditPatientMonitoringForm1)
      .isNotEqualTo(auditPatientMonitoringForm2);
  }
}
