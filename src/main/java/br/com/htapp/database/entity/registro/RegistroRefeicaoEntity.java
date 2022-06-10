package br.com.htapp.database.entity.registro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_REG_REFEICAO")
public class RegistroRefeicaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "DT_REGISTRO")
    private LocalDateTime dataRegistro;

    @Column(name = "MEDICAO")
    private String medicao;

    @Column(name = "NR_CPF")
    private String cpf;
}
