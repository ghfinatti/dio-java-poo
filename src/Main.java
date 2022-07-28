import br.com.dio.desafio.dominio.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Conteudo cursoOop = new Curso("Programação Orientada a Objetos", "Descriçao", 40);

        Bootcamp bootcampJava = new Bootcamp("Bootcamp de Java e Spring", "Aprenda a construir aplicações web com Spring");
        bootcampJava.getConteudos().add(cursoOop);

        Dev dev1 = new Dev("João");
        Dev dev2 = new Dev("Jonas");

        dev1.inscreverBootcamp(bootcampJava);
        dev2.inscreverBootcamp(bootcampJava);

        for(Dev dev:bootcampJava.getDevsInscritos()) {
            System.out.println(dev.getNome());
        }

        System.out.println("Conteudos do João: " + dev1.getConteudosInscritos());
        System.out.println("XP do João: " + dev1.calcularTotalXp());

    }
}
