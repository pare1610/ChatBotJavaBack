package com.proelectricos.chatbotjava.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Entity
@Immutable
@Table(name = "vw_detalle_pedidos_produccion")
public class VwDetallePedidosProduccion {

    @Column(name = "fecha")
    private Instant fecha;

    @Column(name = "destinat", length = 15)
    private String destinat;

    @Column(name = "tdespacho", length = 250)
    private String tdespacho;

    @Column(name = "num", length = 7)
    private String num;

    @Column(name = "cliente", length = 15)
    private String cliente;

    @Column(name = "cod", length = 20)
    private String cod;

    @Column(name = "nom", length = 200)
    private String nom;

    @Column(name = "ud", length = 2)
    private String ud;

    @Column(name = "cant", precision = 14, scale = 4)
    private BigDecimal cant;

    @Column(name = "pend", precision = 14, scale = 4)
    private BigDecimal pend;

    @Id
    @Column(name = "op_id")
    private Integer opId;

    @Column(name = "fechai0")
    private Instant fechai0;

    @Column(name = "fechaf0")
    private Instant fechaf0;

    @Column(name = "obs0", length = 40)
    private String obs0;

    @Column(name = "fechai1")
    private Instant fechai1;

    @Column(name = "fechaf1")
    private Instant fechaf1;

    @Column(name = "obs1", length = 40)
    private String obs1;

    @Column(name = "fechai2")
    private Instant fechai2;

    @Column(name = "fechaf2")
    private Instant fechaf2;

    @Column(name = "obs2", length = 40)
    private String obs2;

    @Column(name = "fechai3")
    private Instant fechai3;

    @Column(name = "fechaf3")
    private Instant fechaf3;

    @Column(name = "obs3", length = 40)
    private String obs3;

    @Column(name = "fechai4")
    private Instant fechai4;

    @Column(name = "fechaf4")
    private Instant fechaf4;

    @Column(name = "obs4", length = 40)
    private String obs4;

    @Column(name = "fechai5")
    private Instant fechai5;

    @Column(name = "fechaf5")
    private Instant fechaf5;

    @Column(name = "obs5", length = 40)
    private String obs5;

    @Column(name = "fechai6")
    private Instant fechai6;

    @Column(name = "fechaf6")
    private Instant fechaf6;

    @Column(name = "obs6", length = 40)
    private String obs6;

    @Column(name = "fechai7")
    private Instant fechai7;

    @Column(name = "fechaf7")
    private Instant fechaf7;

    @Column(name = "obs7", length = 40)
    private String obs7;

    @Column(name = "fechai8")
    private Instant fechai8;

    @Column(name = "fechaf8")
    private Instant fechaf8;

    @Column(name = "obs8", length = 40)
    private String obs8;


}