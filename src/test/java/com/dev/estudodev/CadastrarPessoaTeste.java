package com.dev.estudodev;
import com.dev.estudodev.Mokito.CadastrarPessoa;
import com.dev.estudodev.Mokito.DadosLocalizacao;
import com.dev.estudodev.Mokito.Pessoa;
import com.dev.estudodev.Mokito.api.ApiDosCorreios;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTeste {
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;
    @Test
     void ValidarCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("DF", "Cidade ocidental", "Rua sem nome", "Centro","Cidade Ocodental");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("72880576")).thenReturn(dadosLocalizacao);
        Pessoa adriley= cadastrarPessoa.cadastrarPessoa("Adriley","1234", LocalDate.now(),"72880576");
        assertEquals("Adriley",adriley.getNome());
     // assertEquals("Adriley",adriley.getNome()); outros registros do mokito
     // assertEquals("Adriley",adriley.getNome());
     // assertEquals("Adriley",adriley.getNome());
        assertEquals("MG",adriley.getEndereco().getUf());
    }
}
