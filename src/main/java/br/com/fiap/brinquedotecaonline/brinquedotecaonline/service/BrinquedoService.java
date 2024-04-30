package br.com.fiap.brinquedotecaonline.brinquedotecaonline.service;

import br.com.fiap.brinquedotecaonline.brinquedotecaonline.model.Brinquedo;
import br.com.fiap.brinquedotecaonline.brinquedotecaonline.repository.BrinquedoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public List<Brinquedo> listarTodosBrinquedos() {
        return brinquedoRepository.findAll();
    }

    public Optional<Brinquedo> encontrarBrinquedoPorId(Long id) {
        return brinquedoRepository.findById(id);
    }

    public Brinquedo salvarBrinquedo(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    public void deletarBrinquedo(Long id) {
        brinquedoRepository.deleteById(id);
    }
}
