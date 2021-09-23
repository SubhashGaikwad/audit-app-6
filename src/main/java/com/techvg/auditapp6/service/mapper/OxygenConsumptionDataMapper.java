package com.techvg.auditapp6.service.mapper;

import com.techvg.auditapp6.domain.*;
import com.techvg.auditapp6.service.dto.OxygenConsumptionData;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link OxygenConsumptionData} and its DTO {@link OxygenConsumptionData}.
 */
@Mapper(
  componentModel = "spring",
  uses = { AuditMapper.class, TableDetailsMapper.class }
)
public interface OxygenConsumptionDataMapper
  extends EntityMapper<OxygenConsumptionData, OxygenConsumptionData> {
  @Mapping(target = "audit", source = "audit", qualifiedByName = "id")
  @Mapping(
    target = "tableDetails",
    source = "tableDetails",
    qualifiedByName = "id"
  )
  OxygenConsumptionData toDto(OxygenConsumptionData s);
}
