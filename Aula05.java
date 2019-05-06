package teste;

import com.company.Vetor;

public class Aula05 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.setElements("Ola elemento 0");
        vetor.setElements("ola elemento 1");
        vetor.setElements("ola position 2");

        System.out.println(vetor.getElements(2));


    }
}
