package com.techvg.auditapp6.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FireElectricalAuditMapperTest {

  private FireElectricalAuditMapper fireElectricalAuditMapper;

  @BeforeEach
  public void setUp() {
    fireElectricalAuditMapper = new FireElectricalAuditMapperImpl();
  }
}
