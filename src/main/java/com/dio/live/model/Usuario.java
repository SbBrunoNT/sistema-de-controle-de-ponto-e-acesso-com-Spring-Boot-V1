package com.dio.live.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private Long id;
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    private Empresa empresa;
    private NivelAcesso nivelAcesso;
    private JornadaTrabalho jornadaTrabalho;

}
