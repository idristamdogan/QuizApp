package org.idrist.idristamdoganmaraton5.repository;

import org.idrist.idristamdoganmaraton5.entity.Cevap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CevapRepository extends JpaRepository<Cevap, Long> {
}
