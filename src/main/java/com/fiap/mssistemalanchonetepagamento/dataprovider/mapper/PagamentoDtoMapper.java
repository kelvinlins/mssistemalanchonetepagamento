package com.fiap.mssistemalanchonetepagamento.dataprovider.mapper;

import com.fiap.mssistemalanchonetepagamento.core.model.Pagamento;
import com.fiap.mssistemalanchonetepagamento.entrypoint.dto.PagamentoResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PagamentoDtoMapper {
    PagamentoResponseDto toDto(Pagamento pagamento);
}
