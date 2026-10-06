package br.com.senai.patrimonio;

import br.com.senai.patrimonio.atividades.Computador;
import br.com.senai.patrimonio.atividades.Equipamento;
import br.com.senai.patrimonio.atividades.Veiculo;
import br.com.senai.patrimonio.atividades02.Desenvolvedor;
import br.com.senai.patrimonio.atividades02.Gerente;
import br.com.senai.patrimonio.avaliacao.Evento;
import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.avaliacao.enums.StatusEventos;
import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
import br.com.senai.patrimonio.model.enums.Pagamento;
import br.com.senai.patrimonio.model.enums.PagamentoComposto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());

		Endereco endereco = new Endereco();
		endereco.setRua("Rua: Abelle Martinho Benedet");
		System.out.println(endereco.getRua());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco Endereco = new Endereco();
		endereco.setNumero("Casa: 51");
		System.out.println(endereco.getNumero());

		Pessoa pessoa = new Pessoa();
		Sala sala = new Sala();

		Funcionario funcionario = new Funcionario(
				35L, "Gabriela", "123456",
				Cargo.GERENTE, empresa, sala
		);
		System.out.println(funcionario.getCpf());

		System.out.println(Pagamento.PIX);
		System.out.println(PagamentoComposto.PIX.getDescricao());
		System.out.println(PagamentoComposto.PIX);
		System.out.println(PagamentoComposto.PIX.getSituacao());

		System.out.println(" ===== ");

		System.out.println(Pagamento.CARTAO_CREDITO);
		System.out.println(PagamentoComposto.CARTAO_CREDITO.getDescricao());
		System.out.println(PagamentoComposto.CARTAO_CREDITO);
		System.out.println(PagamentoComposto.CARTAO_CREDITO.getSituacao());

		System.out.println(" ===== ");

		System.out.println(Pagamento.CARTAO_DEBITO);
		System.out.println(PagamentoComposto.CARTAO_DEBITO.getDescricao());
		System.out.println(PagamentoComposto.CARTAO_DEBITO);
		System.out.println(PagamentoComposto.CARTAO_DEBITO.getSituacao());

		System.out.println(" ===== ");

		System.out.println(Pagamento.BOLETO);
		System.out.println(PagamentoComposto.BOLETO.getDescricao());
		System.out.println(PagamentoComposto.BOLETO);
		System.out.println(PagamentoComposto.BOLETO.getSituacao());

		System.out.println(" ===== ");

		System.out.println(Pagamento.PERMUTA);
		System.out.println(PagamentoComposto.PERMUTA.getDescricao());
		System.out.println(PagamentoComposto.PERMUTA);
		System.out.println(PagamentoComposto.PERMUTA.getSituacao());

		System.out.println(" ===== ");

		System.out.println(Pagamento.DINHEIRO);
		System.out.println(PagamentoComposto.DINHEIRO.getDescricao());
		System.out.println(PagamentoComposto.DINHEIRO);
		System.out.println(PagamentoComposto.DINHEIRO.getSituacao());

		System.out.println(" ==== ");

		// TESTE DA AVALIAÇÃO AQUI

		Participante participante = new Participante("Gabriela", "Gabriela@gmail.com",
				"48367920178", "P001", Nivel.INICIANTE);

		System.out.println("Nome: Gabriela");
		System.out.println("Email: Gabriela@gmail.com");
		System.out.println("Telefone: 48367920178");
		System.out.println(participante.getMatricula());
		System.out.println(participante.getNivel());

		System.out.println(" === ");

		Empresa empresaInterface = new Empresa();

		Bloco blocoInterface = new Bloco(1L, "Bloco 2", empresaInterface);

		Sala salaInterface = new Sala(2L, "Lab 28", "45678",
				blocoInterface, empresaInterface);

		System.out.println(salaInterface.getDescreicaoLocalizavel());

		System.out.println(" === ");

		Patrimonio patrimonio = new Patrimonio();
		System.out.println(patrimonio.validarEstadoConservacao());

		patrimonio.setEstado(EstadoConservacao.INSERVIVEL);
		System.out.println(patrimonio.validarEstadoConservacao());

		System.out.println(" === ");

		Bem bem = new Bem();
		System.out.println(bem.getEmpresaVinulada());

		Empresa empresa1 = new Empresa();
		bem.setEmpresa(empresa1);
		System.out.println(bem.getEmpresaVinulada());
		empresa1.setNome("Senai");
		System.out.println(bem.getEmpresaVinulada());

		System.out.println(" === ");

		System.out.println("Teste dps Blocos");
		Bloco bloco = new Bloco();
		System.out.println(bloco.getEmpresaVinulada());
		bloco.setEmpresa(empresa1);
		System.out.println(bloco.getEmpresaVinulada());

		System.out.println(" === ");

		System.out.println("Teste da Sala");
		Sala sala1 = new Sala();
		System.out.println(sala1.getEmpresaVinulada());
		sala1.setEmpresa(empresa1);
		System.out.println(sala1.getEmpresaVinulada());

		System.out.println(" === ");

		System.out.println("Teste de Funcionário");
		Funcionario funcionario1 = new Funcionario();
		System.out.println(funcionario1.getEmpresaVinulada());
		funcionario1.setEmpresa(empresa1);
		System.out.println(funcionario1.getEmpresaVinulada());

		System.out.println(" === ");

		Pessoa pessoa1 = new Pessoa();
		pessoa.setNome("Lucas");
		pessoa.setCpf("12345678");
		funcionario1.setCargo(Cargo.GERENTE);
		System.out.println(pessoa.getIdentificacao());

		System.out.println(" === ");

		funcionario1.setNome("Gabriela");
		funcionario1.setCpf("12345678");
		funcionario1.setCargo(Cargo.ESTAGIARIO);
		System.out.println(funcionario1.getIdentificacao());

		System.out.println(" === ");

		Equipamento equipamento = new Equipamento("Impressora", 1000);
		Equipamento computador = new Computador("Notebook", 4000);
		Equipamento veiculo = new Veiculo("Moto", 25000);

		exibirRelatorio(equipamento);
		exibirRelatorio(computador);
		exibirRelatorio(veiculo);

	}
		public static void exibirRelatorio(Equipamento item) {
			System.out.println("Item: " + item.getNome());
			System.out.println("Valor inicial: " + item.getValorInicial());
			System.out.println("Depreciacao " + item.calcularDepreciacao());
			System.out.println(" ----------------------------------- ");

			System.out.println(" === ");

			br.com.senai.patrimonio.atividades02.Funcionario funcionario = new br.com.senai.patrimonio.atividades02.Funcionario
					("Gabriela", 2000);
			br.com.senai.patrimonio.atividades02.Funcionario gerente = new Gerente
					("Lucas", 4000);
			br.com.senai.patrimonio.atividades02.Funcionario desenvolvedor = new Desenvolvedor
					("Mia", 6000);

			imprimirContraCheque(funcionario);
			imprimirContraCheque(gerente);
			imprimirContraCheque(desenvolvedor);

		   }

			public static void imprimirContraCheque(br.com.senai.patrimonio.atividades02.Funcionario f){

				System.out.println("Funcionário: " + f.getNome());
				System.out.println("Salário base: R$ " + f.getSalarioBase() );
				System.out.println("Bonificação: R$ " + f.calcularBonificacao());

				double salarioTotal = f.getSalarioBase() + f.calcularBonificacao();
				System.out.println("Salário total: R$ " + salarioTotal);
				System.out.println(" ------------------------------------------- ");






			}
		}












