package br.com.htapp.database.entity.pessoa;

import br.com.htapp.enums.TipoSexo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @Column(name = "SEXO")
    @Enumerated(EnumType.STRING)
    private TipoSexo tipoSexo;

    @Column(name = "BR_DATA_NASC")
    private LocalDate dataNascimento;

    @Column(name = "NR_CPF", unique = true)
    private String cpf;

    @Column(name = "NM_EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @OneToMany(cascade = CascadeType.ALL)
    private List<TelefoneEntity> telefones;

    @Column(name = "ENDERECO")
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    @OneToMany(cascade = CascadeType.ALL)
    private List<EnderecoEntity> enderecos;
}