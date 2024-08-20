package com.sistema.documental.entidades;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Builder
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne
    private Rol rol;
}
