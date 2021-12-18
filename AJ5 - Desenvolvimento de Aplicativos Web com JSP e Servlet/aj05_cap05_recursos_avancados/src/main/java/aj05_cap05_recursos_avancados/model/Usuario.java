package aj05_cap05_recursos_avancados.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Usuario
{
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
}
