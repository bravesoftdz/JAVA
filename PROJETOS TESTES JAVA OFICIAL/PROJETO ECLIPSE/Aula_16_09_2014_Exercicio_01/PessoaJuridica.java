package Aula_16_09_2014_Exercicio_01;

public class PessoaJuridica extends Pessoa{ 
			
			private String cnpj;
			private String tipoEmpresa;
			
			public PessoaJuridica(){
				//Instancia a Classe Pessoa
			}
			
			public void setCnpj(String cnpj){
				this.cnpj=cnpj;		
			}
			
			public void setTipoEmpresa(String tipoEmpresa){
				this.tipoEmpresa=tipoEmpresa;
			}	
			
			public String getCnpj(){
				return cnpj;
			}
			
			public String getTipoEmpresa(){
				return tipoEmpresa;
			}

			@Override
			public String toString() {
				StringBuilder builder = new StringBuilder();
				builder.append("CNPJ [cnpj=");
				builder.append(cnpj);
				builder.append(", Tipo Empresa=");
				builder.append(tipoEmpresa);
				builder.append("]");
				return builder.toString();
			}

		}

