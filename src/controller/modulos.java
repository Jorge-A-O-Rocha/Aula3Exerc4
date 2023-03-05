package controller;

public class modulos {
	public modulos() {
		super();
	}
	
    public int quant(int num, int dig) {
    	// Condição de parada é quando num chegar a 0 já que quando chegar em 0 não da mais para dividir
    	if (num == 0) {
            return 0;
        } else if (num % 10 == dig) {
        	//A relação está em somar de 1 em 1 a cada vez que o dig, que é o número para ser comparado, for igual ao resto da divisão por 10
            return 1 + quant(num / 10, dig);
        } else {
        	//Se o resto da divisão nao for igual ao dig, então só segue o fluxo, tira o útimo digito e testa de novo até chegar em 0
            return quant(num / 10, dig);
        }
    }


}
