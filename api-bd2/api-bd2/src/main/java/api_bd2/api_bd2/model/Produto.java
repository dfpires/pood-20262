package api_bd2.api_bd2.model;
import jakarta.persistence.*;

@Entity // entidade do banco de dados
@Table(name="produtos")
public class Produto {
    @Id // campo id será uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerada automaticamente
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Double preco;
    @Column(length = 500)
    private String descricao;
}
