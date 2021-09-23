package com.techvg.auditapp6.service.mapper;

import com.techvg.auditapp6.domain.*;
import com.techvg.auditapp6.service.dto.AuditPatientMonitoringForm;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link AuditPatientMonitoringForm} and its DTO {@link AuditPatientMonitoringForm}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AuditPatientMonitoringFormMapper
  extends EntityMapper<AuditPatientMonitoringForm, AuditPatientMonitoringForm> {
  @Named("id")
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id")
  AuditPatientMonitoringForm toDtoId(
    AuditPatientMonitoringForm auditPatientMonitoringForm
  );
}
