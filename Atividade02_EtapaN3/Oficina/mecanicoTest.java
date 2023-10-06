package Atividade02_EtapaN3.Oficina;

import org.junit.*;

import junit.framework.TestCase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class mecanicoTest{
    @Test
    public void mecanico1(){

        List<String> especialidades = new ArrayList();
        especialidades.add("Motor");
        especialidades.add("freios");
        especialidades.add("molas");

        Mecanico mecanico1 = new Mecanico();

        mecanico1.setMatricula(15256);
        mecanico1.setnome("Reginaldo");
        mecanico1.setEspecialidades(especialidades);

        //List<String> especialidade = mecanico1.getEspecialidades();

        assertEquals(true, mecanico1.funcionarioPremium());

    
    }
}
