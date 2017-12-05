package mtp.com.br;
import org.junit.*;
import mtp.com.br.Avaliacao;
import mtp.com.br.IAluno;
import static org.mockito.Mockito.*;

public class AvaliacaoTest {

	Avaliacao aval = new Avaliacao();
	
	@Test
	public void testAlunoAprovado() {
		IAluno aluno = new Aluno();							
		String resultado = aval.avaliar(aluno);

		Assert.assertEquals("Aprovado", resultado);		
	}
	
	@Test
	public void testAlunoReprovado() {
		
	}
	
	@Test
	public void testAlunoExame() {
		
	}
}