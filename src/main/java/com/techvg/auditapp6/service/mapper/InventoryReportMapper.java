package com.techvg.auditapp6.service.mapper;

import com.techvg.auditapp6.domain.*;
import com.techvg.auditapp6.service.dto.InventoryReport;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link InventoryReport} and its DTO {@link InventoryReport}.
 */
@Mapper(componentModel = "spring", uses = { AuditMapper.class })
public interface InventoryReportMapper
  extends EntityMapper<InventoryReport, InventoryReport> {
  @Mapping(target = "audit", source = "audit", qualifiedByName = "id")
  InventoryReport toDto(InventoryReport s);
}
