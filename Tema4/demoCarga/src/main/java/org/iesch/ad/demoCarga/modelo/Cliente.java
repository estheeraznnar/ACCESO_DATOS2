package org.iesch.ad.demoCarga.modelo;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;

    @OneToMany
    @JoinColumn(name = "cliente_id") //para que no me cree table intermedia
    private List<Pedido> pedidos;

    @Override
    public String toString() {
        return "Cliente{" +
                "pedidos=" + pedidos +
                '}';
    }
}
