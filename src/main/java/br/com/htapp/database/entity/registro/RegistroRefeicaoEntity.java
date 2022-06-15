package br.com.htapp.database.entity.registro;

import br.com.htapp.enums.TipoRefeicao;
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
@Table(name = "TB_REG_REFEICAO")
public class RegistroRefeicaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "DT_REGISTRO")
    private LocalDate dataRegistro;

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
