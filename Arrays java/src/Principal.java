import java.util.ArrayList;

public class Principal {
    public static void main(String[] args)
    {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Luiz Fernando", 30));
        listaDePessoas.add(new Pessoa("José", 28));
        listaDePessoas.add(new Pessoa("Paulo", 27));
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println(listaDePessoas.get(0));
        // Imprimindo direto usando o novo tostring que criamos
        System.out.println(listaDePessoas);
        System.out.println();

        //Imprimindo percorrendo a lista imprimindo um por um em cada linha
        for (Pessoa pessoa : listaDePessoas)
        {
            System.out.println(pessoa);
        }


    }
}
