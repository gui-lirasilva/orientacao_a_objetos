public class TestaBanco {
	public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.setNome("Guilherme Henrique");
		guilherme.setCpf("222.222.222.-22");
		guilherme.setProfissao("programador");

		Conta contaDoGuilherme = new Conta(6646,969060);
		contaDoGuilherme.deposita(100);

		contaDoGuilherme.setTitular(paulo);
		System.out.println(contaDoGuilherme.getTitular().getNome());
		System.out.println(contaDoGuilherme.getTitular());

	}
}
