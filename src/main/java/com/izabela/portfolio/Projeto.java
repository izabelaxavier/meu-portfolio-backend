package com.izabela.portfolio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {
    private String nome;
    private String descricao;
    private String tecnologias;
    private String linkGithub;
    private String linkDeploy;
    private String emoji;
}
