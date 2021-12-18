package aj05_cap06_gerenciamento_de_sessao.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Cliente
{
	String nome;
	String usuario;
	String senha;
	String endereco;
	String telefone;
	Boolean valido;
}
