package com.techvg.auditapp6.service.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventoryReportMapperTest {

  private InventoryReportMapper inventoryReportMapper;

  @BeforeEach
  public void setUp() {
    inventoryReportMapper = new InventoryReportMapperImpl();
  }
}
