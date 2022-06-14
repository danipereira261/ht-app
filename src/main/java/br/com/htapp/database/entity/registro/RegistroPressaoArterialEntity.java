package br.com.htapp.database.entity.registro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_REG_PRESSAO_ARTERIAL")
public class RegistroPressaoArterialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "DT_REGISTRO")
    private LocalDate dataRegistro;

    @Column(name = "MEDICAO")
    private String medicao;

    @Column(name = "NR_CPF")
    private String cpf;
}
