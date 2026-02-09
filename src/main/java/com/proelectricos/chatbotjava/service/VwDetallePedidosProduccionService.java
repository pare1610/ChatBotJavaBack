package com.proelectricos.chatbotjava.service;

import com.proelectricos.chatbotjava.model.dto.VwDetallePedidosProduccionDto;
import com.proelectricos.chatbotjava.model.entity.VwDetallePedidosProduccion;
import com.proelectricos.chatbotjava.model.repository.VwDetallePedidosProduccionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VwDetallePedidosProduccionService {

    private final VwDetallePedidosProduccionRepository repository;

    /**
     * Obtiene el detalle de pedidos filtrado por número de pedido.
     * @param num Número de pedido
     * @return Lista de DTOs con la información del pedido
     */
    @Transactional(readOnly = true)
    public List<VwDetallePedidosProduccionDto> listarPorNumeroPedido(String num) {
        if (num == null || num.isBlank()) {
            return Collections.emptyList();
        }

        List<VwDetallePedidosProduccion> entities = repository.findByNum(num);
        if (entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }

        return entities.stream()
                .filter(Objects::nonNull)
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    /**
     * Mapper manual de Entidad a DTO.
     * Se utiliza el constructor de Lombok @Value del DTO.
     */
    private VwDetallePedidosProduccionDto convertToDto(VwDetallePedidosProduccion entity) {
        // Defensive guard: makes future issues fail fast with a clear message
        if (entity == null) {
            throw new IllegalArgumentException("VwDetallePedidosProduccion entity is null. Check repository query/mapping.");
        }

        return new VwDetallePedidosProduccionDto(
                entity.getFecha(),
                entity.getDestinat(),
                entity.getTdespacho(),
                entity.getNum(),
                entity.getCliente(),
                entity.getCod(),
                entity.getNom(),
                entity.getUd(),
                entity.getCant(),
                entity.getPend(),
                entity.getOpId(),
                entity.getFechai0(),
                entity.getFechaf0(),
                entity.getObs0(),
                entity.getFechai1(),
                entity.getFechaf1(),
                entity.getObs1(),
                entity.getFechai2(),
                entity.getFechaf2(),
                entity.getObs2(),
                entity.getFechai3(),
                entity.getFechaf3(),
                entity.getObs3(),
                entity.getFechai4(),
                entity.getFechaf4(),
                entity.getObs4(),
                entity.getFechai5(),
                entity.getFechaf5(),
                entity.getObs5(),
                entity.getFechai6(),
                entity.getFechaf6(),
                entity.getObs6(),
                entity.getFechai7(),
                entity.getFechaf7(),
                entity.getObs7(),
                entity.getFechai8(),
                entity.getFechaf8(),
                entity.getObs8()
        );
    }
}