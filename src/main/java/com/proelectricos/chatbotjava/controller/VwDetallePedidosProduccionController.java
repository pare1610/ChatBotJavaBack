package com.proelectricos.chatbotjava.controller;

import com.proelectricos.chatbotjava.model.dto.VwDetallePedidosProduccionDto;
import com.proelectricos.chatbotjava.service.VwDetallePedidosProduccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos-produccion")
@RequiredArgsConstructor
public class VwDetallePedidosProduccionController {

    private final VwDetallePedidosProduccionService service;

    /**
     * Endpoint para consultar detalles por número de pedido.
     * Ejemplo: GET /api/v1/pedidos-produccion/12345
     */
    @GetMapping("/{num}")
    public ResponseEntity<List<VwDetallePedidosProduccionDto>> obtenerPorNumero(@PathVariable String num) {
        List<VwDetallePedidosProduccionDto> resultados = service.listarPorNumeroPedido(num);

        if (resultados.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(resultados);
    }
}