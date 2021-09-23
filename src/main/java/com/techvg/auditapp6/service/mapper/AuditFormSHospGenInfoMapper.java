package com.techvg.auditapp6.service.mapper;

import com.techvg.auditapp6.domain.*;
import com.techvg.auditapp6.service.dto.AuditFormSHospGenInfo;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link AuditFormSHospGenInfo} and its DTO {@link AuditFormSHospGenInfo}.
 */
@Mapper(componentModel = "spring", uses = { AuditMapper.class })
public interface AuditFormSHospGenInfoMapper
  extends EntityMapper<AuditFormSHospGenInfo, AuditFormSHospGenInfo> {
  @Mapping(target = "audit", source = "audit", qualifiedByName = "id")
  AuditFormSHospGenInfo toDto(AuditFormSHospGenInfo s);
}
