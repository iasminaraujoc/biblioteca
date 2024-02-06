package br.com.alura.biblioteca.repository;

import br.com.alura.biblioteca.model.Livro;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.List;
import java.util.Optional;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    @Lock(LockModeType.OPTIMISTIC)
    Optional<Livro> findById(Long id);

}
