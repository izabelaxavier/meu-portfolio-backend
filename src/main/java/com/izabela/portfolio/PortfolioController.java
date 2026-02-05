package com.izabela.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        List<Projeto> meusProjetos = new ArrayList<>();

        // 1. Projeto Prefeitura
        meusProjetos.add(new Projeto(
                "Sistema de Controle Fiscal",
                "Solução real para a Prefeitura de Matozinhos que automatizou a gestão de notas fiscais.",
                "Java, MySQL, Gestão Pública",
                "https://github.com/izabelaxavier/controle-notas-fiscais",
                null,
                "🏛️"
        ));

        // 2. Projeto Keley Bolos
        meusProjetos.add(new Projeto(
                "Keley Bolos API",
                "API Backend para gestão de confeitaria com deploy no Render.",
                "Java, Spring Boot, PostgreSQL",
                "https://github.com/izabelaxavier/keley-bolos-api",
                "https://sistema-keley-bolos.onrender.com/",
                "🍰"
        ));

        // 3. Projeto Abrigo (Nota Máxima!)
        meusProjetos.add(new Projeto(
                "Abrigo Patas do Amanhã",
                "Projeto de extensão (Nota Máxima). Site completo para adoção de animais.",
                "HTML, CSS, JavaScript, GitHub Pages",
                "https://github.com/izabelaxavier/abrigo-patas-do-amanha",
                "https://izabelaxavier.github.io/abrigo-patas-do-amanha/",
                "🐾"
        ));

        model.addAttribute("projetos", meusProjetos);
        model.addAttribute("nome", "Izabela Xavier");

        return "index";
    }
}