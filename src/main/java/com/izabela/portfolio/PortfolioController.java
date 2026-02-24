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

        // 2. Projeto Keley Bolos (Link de site removido, foco no código)
        meusProjetos.add(new Projeto(
                "Keley Bolos API",
                "API Backend para gestão de confeitaria. Focada em persistência de dados e regras de negócio.",
                "Java, Spring Boot, PostgreSQL",
                "https://github.com/izabelaxavier/keley-bolos-api",
                null, // Removido o link do Render
                "🍰"
        ));

        // 3. Projeto Figma: Banco Aurum
        meusProjetos.add(new Projeto(
                "Banco Aurum",
                "Protótipo de alta fidelidade focado em fluxos bancários e experiência do usuário em Fintechs.",
                "Figma, UI/UX, Design",
                null, // Sem link de GitHub
                "https://www.figma.com/proto/Omd6DXZolrtOKGmsXhklmQ/Banco-Aurum?node-id=1-3&starting-point-node-id=1%3A3",
                "🏦"
        ));

        // 4. Projeto Figma: Colecionáveis Mágicos
        meusProjetos.add(new Projeto(
                "Colecionáveis Mágicos",
                "Interface temática para e-commerce, explorando design visual e navegação em catálogos.",
                "Figma, E-commerce, Design",
                null, // Sem link de GitHub
                "https://www.figma.com/proto/PJGtU24L3nxW6YAOJD9wl3/Colecion%C3%A1veis-M%C3%A1gicos?node-id=2-10&p=f&t=6HohNbwo1TS7ap9v-0&scaling=scale-down&content-scaling=fixed&page-id=0%3A1&starting-point-node-id=264%3A351",
                "✨"
        ));

        // 5. Projeto Abrigo (Nota Máxima!)
        meusProjetos.add(new Projeto(
                "Abrigo Patas do Amanhã",
                "Projeto de extensão (Nota Máxima). Site completo para adoção de animais.",
                "HTML, CSS, JS, GitHub Pages",
                "https://github.com/izabelaxavier/abrigo-patas-do-amanha",
                "https://izabelaxavier.github.io/abrigo-patas-do-amanha/",
                "🐾"
        ));

        model.addAttribute("projetos", meusProjetos);
        model.addAttribute("nome", "Izabela Xavier");

        return "index";
    }
}