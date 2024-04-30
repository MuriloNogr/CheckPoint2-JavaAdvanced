package br.com.fiap.brinquedotecaonline.brinquedotecaonline.controller;

import br.com.fiap.brinquedotecaonline.brinquedotecaonline.model.Brinquedo;
import br.com.fiap.brinquedotecaonline.brinquedotecaonline.controller.dto.BrinquedoDTO;
import br.com.fiap.brinquedotecaonline.brinquedotecaonline.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import jakarta.validation.*;
import java.util.List;

@Controller
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    @GetMapping("/listar")
    public String listarBrinquedos(Model model) {
        List<Brinquedo> brinquedos = brinquedoRepository.findAll();
        model.addAttribute("brinquedos", brinquedos);
        return "brinquedos/listar_brinquedos";
    }

    @GetMapping("/cadastrar")
    public String cadastrarBrinquedoForm(Model model) {
        model.addAttribute("brinquedoDTO", new BrinquedoDTO());
        return "brinquedos/cadastrar_brinquedos";
    }

    @PostMapping("/cadastrar")
    public String cadastrarBrinquedo(@Valid @ModelAttribute BrinquedoDTO brinquedoDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "brinquedos/cadastrar_brinquedos";
        }

        Brinquedo novoBrinquedo = new Brinquedo();
        novoBrinquedo.setNome(brinquedoDTO.getNome());
        novoBrinquedo.setTipo(brinquedoDTO.getTipo());
        novoBrinquedo.setClassificacao(brinquedoDTO.getClassificacao());
        novoBrinquedo.setTamanho(brinquedoDTO.getTamanho());
        novoBrinquedo.setPreco(brinquedoDTO.getPreco());
        brinquedoRepository.save(novoBrinquedo);
        return "redirect:/brinquedos/listar";
    }


}
