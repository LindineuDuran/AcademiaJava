public class CarroMetodoEstaticoAcessandoNaoEstatico
{
	//Atributos da Classe
		private String fabricante;
		private String placa;
		private int velocidade;
		public static int velocidadeMaximaPermitida = 60;	
		
		//Construtor
		/**
		 * @param fabricante
		 * @param placa
		 * @param velocidade
		 */
		public CarroMetodoEstaticoAcessandoNaoEstatico(String fabricante, String placa, int velocidade)
		{
			super();
			this.setFabricante(fabricante);;
			this.setPlaca(placa);
			this.setVelocidade(velocidade);
		}

		//Getters e Setters
		/**
		 * @return the velocidadeMaximaPermitida
		 */
		public static int getVelocidadeMaximaPermitida()
		{
			return velocidadeMaximaPermitida;
		}

		/**
		 * @param vmax the velocidadeMaximaPermitida to set
		 */
		public static void setVelocidadeMaximaPermitida1(int vmax)
		{
			velocidadeMaximaPermitida = vmax;
			
			if (velocidade > velocidadeMaximaPermitida) //Um método estático só pode acessar atributos estáticos
			{
				setVelocidade(velocidadeMaximaPermitida); //Um método estático só pode acessar métodos estáticos
			}
		}
		
		/**
		 * @param vmax the velocidadeMaximaPermitida to set
		 */
		public static void setVelocidadeMaximaPermitida2(int vmax)
		{
			velocidadeMaximaPermitida = vmax;
			
			//Não é possível acessar a variável this dentro de métodos estáticos
			if (this.velocidade > velocidadeMaximaPermitida)
			{
				this.setVelocidade(velocidadeMaximaPermitida);
			}
		}
		
		/**
		 * @return the fabricante
		 */
		public String getFabricante()
		{
			return fabricante;
		}
		
		/**
		 * @param fabricante the fabricante to set
		 */
		public void setFabricante(String fabricante)
		{
			this.fabricante = fabricante;
		}
		
		/**
		 * @return the placa
		 */
		public String getPlaca()
		{
			return placa;
		}
		
		/**
		 * @param placa the placa to set
		 */
		public void setPlaca(String placa)
		{
			this.placa = placa;
		}
		
		/**
		 * @return the velocidade
		 */
		public int getVelocidade()
		{
			return velocidade;
		}
		
		/**
		 * @param velocidade the velocidade to set
		 */
		public void setVelocidade(int velocidade)
		{
			this.velocidade = velocidade;
		}
		
		public void acelerar(int deltaV)
		{
			velocidade += deltaV;
		}
		
		public boolean ultrapassouLimite()
		{
			return velocidade > velocidadeMaximaPermitida;
		}
}
