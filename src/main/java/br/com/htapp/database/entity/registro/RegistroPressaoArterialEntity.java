package br.com.htapp.database.entity.registro;

import br.com.htapp.database.entity.pessoa.PessoaEntity;
import br.com.htapp.enums.TipoRefeicao;
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
@Table(name = "TB_REG_PESO")
public class RegistroPressaoArterialEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "DT_REGISTRO")
    private LocalDateTime dataRegistro;

    @Column(name = "TIPO_REFEICAO")
    @Enumerated(EnumType.STRING)
    private TipoRefeicao tipoRefeicao;

    @Column(name = "QUANTIDADE_GRAMAS")
    private Integer quantidadeEmGramas;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "NR_CPF")
    private String cpf;
}
