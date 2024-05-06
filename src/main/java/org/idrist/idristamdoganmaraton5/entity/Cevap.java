package org.idrist.idristamdoganmaraton5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.idrist.idristamdoganmaraton5.constant.Status;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "tbl_cevap")
public class Cevap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String cevap;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Status status;
    @ManyToOne
    Soru soru;

}
