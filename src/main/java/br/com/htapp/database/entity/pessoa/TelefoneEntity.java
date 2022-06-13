package br.com.htapp.database.entity.pessoa;

import br.com.htapp.enums.TipoTelefone;
import br.com.htapp.http.domain.TelefoneDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_TELEFONE")
public class TelefoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NR_FONE")
    private String numero;

    @Column(name = "TP_TELEFONE")
    @Enumerated(EnumType.STRING)
    private TipoTelefone tipoTelefone;

    @Column(name = "NR_CPF", unique = true)
    private String cpf;

    public TelefoneEntity(TelefoneDTO dto) {
        this.cpf = dto.getCpf();
        this.numero = dto.getNumero();
        this.tipoTelefone = dto.getTipoTelefone();
    }
}
