package com.techvg.auditapp6.service.mapper;

import com.techvg.auditapp6.domain.*;
import com.techvg.auditapp6.service.dto.FireElectricalAudit;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link FireElectricalAudit} and its DTO {@link FireElectricalAudit}.
 */
@Mapper(componentModel = "spring", uses = { AuditMapper.class })
public interface FireElectricalAuditMapper
  extends EntityMapper<FireElectricalAudit, FireElectricalAudit> {
  @Mapping(target = "audit", source = "audit", qualifiedByName = "id")
  FireElectricalAudit toDto(FireElectricalAudit s);
}
