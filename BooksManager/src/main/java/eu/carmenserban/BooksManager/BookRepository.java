package eu.carmenserban.BooksManager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Carte, Long>{
	
}
