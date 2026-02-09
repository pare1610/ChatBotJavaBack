package com.proelectricos.chatbotjava.model.repository;

import com.proelectricos.chatbotjava.model.entity.VwDetallePedidosProduccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VwDetallePedidosProduccionRepository extends JpaRepository<VwDetallePedidosProduccion, Integer> {
    List<VwDetallePedidosProduccion> findByNum(String num);
}