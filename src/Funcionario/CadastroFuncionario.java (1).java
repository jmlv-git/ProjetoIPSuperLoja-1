package Funcionario;

public class CadastroFuncionario {
private RepositorioFuncionario repositoriofuncionario;
// criei uma variavel e disse que ela � do tipo repositoriofuncionario(ou seja, do mesmo tipo do obj da minha interface)

public CadastroFuncionario(RepositorioFuncionario repositorioarrayoulista) {
	repositoriofuncionario=repositorioarrayoulista;
	//repositoriofuncionario literalmente recebera o repositorio array ou lista, vai depender do main
	
}


public void cadastrar(Funcionario funcionario)throws FuncionarioCadastradoException {
	if(funcionario.existe(funcionario.getCpf())==false) {
		
	}
}













}
