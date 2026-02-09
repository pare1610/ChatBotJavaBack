package com.proelectricos.chatbotjava.model.dto;

import com.proelectricos.chatbotjava.model.entity.VwDetallePedidosProduccion;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * DTO for {@link VwDetallePedidosProduccion}
 */
@Value
public class VwDetallePedidosProduccionDto implements Serializable {
    Instant fecha;
    String destinat;
    String tdespacho;
    String num;
    String cliente;
    String cod;
    String nom;
    String ud;
    BigDecimal cant;
    BigDecimal pend;
    Integer opId;
    Instant fechai0;
    Instant fechaf0;
    String obs0;
    Instant fechai1;
    Instant fechaf1;
    String obs1;
    Instant fechai2;
    Instant fechaf2;
    String obs2;
    Instant fechai3;
    Instant fechaf3;
    String obs3;
    Instant fechai4;
    Instant fechaf4;
    String obs4;
    Instant fechai5;
    Instant fechaf5;
    String obs5;
    Instant fechai6;
    Instant fechaf6;
    String obs6;
    Instant fechai7;
    Instant fechaf7;
    String obs7;
    Instant fechai8;
    Instant fechaf8;
    String obs8;
}