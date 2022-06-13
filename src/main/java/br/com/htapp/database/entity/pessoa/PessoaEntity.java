package br.com.htapp.database.entity.pessoa;

import br.com.htapp.enums.TipoSexo;
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
@Table(name = "TB_PESSOA")
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NM_NOME")
    private String nome;

    @Column(name = "NM_EMAIL")
    private String email;

    @Column(name = "SEXO")
    @Enumerated(EnumType.STRING)
    private TipoSexo sexo;

    @Column(name = "BR_DATA_NASC")
    private LocalDate dataNascimento;

    @Column(name = "NR_CPF", unique = true)
    private String cpf;

    @Column(name = "PASSWORD")
    private String password;

}