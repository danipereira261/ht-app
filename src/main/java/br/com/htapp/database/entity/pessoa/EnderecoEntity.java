package br.com.htapp.database.entity.pessoa;

import br.com.htapp.enums.Estados;
import br.com.htapp.http.domain.EnderecoDTO;
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
@Table(name = "TB_ENDERECO")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "RUA")
    private String rua;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "MUNICIPIO")
    private String municipio;

    @Column(name = "ESTADO")
    @Enumerated(EnumType.STRING)
    private Estados estado;

    @Column(name = "UF")
    private String uf;

    @Column(name = "NUMERO_LOGRADOURO")
    private String numeroLogradouro;

    public EnderecoEntity(EnderecoDTO dto) {
        this.cep = dto.getCep();
        this.rua = dto.getRua();
        this.municipio = dto.getMunicipio();
        this.bairro = dto.getBairro();
        this.estado = dto.getEstado();
        this.uf = dto.getUf();
        this.numeroLogradouro = dto.getNumeroLogradouro();
    }
}
