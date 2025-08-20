package edu.gazi.FullProject.Repository;

import edu.gazi.FullProject.Entity.Ogrenci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepo extends JpaRepository<Ogrenci, Long> {
}
