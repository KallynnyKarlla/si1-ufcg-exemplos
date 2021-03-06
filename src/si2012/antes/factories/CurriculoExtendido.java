package si2012.antes.factories;

public class CurriculoExtendido extends CurriculoAbstrato {

	public CurriculoExtendido(String nome, String experiencia, String endereco) {
		super(nome, experiencia, endereco);
	}

	@Override
	protected void defineCurriculo(String nome, String experiencia,
			String endereco) {
		this.addSecao(new SecaoCapa(nome));
		this.addSecao(new SecaoExperiencia(experiencia));
		this.addSecao(new SecaoContato(endereco));
	}

}
