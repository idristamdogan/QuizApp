package org.idrist.idristamdoganmaraton5.repository;

import org.idrist.idristamdoganmaraton5.entity.Soru;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SoruRepository extends JpaRepository<Soru, Long> {


}
