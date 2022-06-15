package br.com.htapp.database.entity.registro;

import br.com.htapp.enums.TipoAtividadeFisica;
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
@Table(name = "TB_REG_ATIVIDADE_FISICA")
public class RegistroAtividadeFisicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "DT_REGISTRO")
    private LocalDate dataRegistro;

    @Column(name = "DURACAO")
    private Integer duracaoEmMinutos;

    @Column(name = "TP_ATIVIDADE_FISICA")
    @Enumerated(EnumType.STRING)
    private TipoAtividadeFisica tipoAtividadeFisica;

    @Column(name = "NR_CPF")
    private String cpf;
}
