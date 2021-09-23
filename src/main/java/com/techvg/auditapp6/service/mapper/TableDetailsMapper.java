package com.techvg.auditapp6.service.mapper;

import com.techvg.auditapp6.domain.*;
import com.techvg.auditapp6.service.dto.TableDetails;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TableDetails} and its DTO {@link TableDetails}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TableDetailsMapper
  extends EntityMapper<TableDetails, TableDetails> {
  @Named("id")
  @BeanMapping(ignoreByDefault = true)
  @Mapping(target = "id", source = "id")
  TableDetails toDtoId(TableDetails tableDetails);
}
