package br.com.fiap.brinquedotecaonline.brinquedotecaonline.repository;

import br.com.fiap.brinquedotecaonline.brinquedotecaonline.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {}
