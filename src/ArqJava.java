public class ArqJava {

    public static void main(String[] args) {

        //Chamando o metodo de soma do ArqKotlin e armazenando em um int.
        int soma = classeDoKotlin.soma(25,75);


        //Chamando o metodo de divisão por 2 do ArqKotlin e armazenando em um int onde o valor enviado é a soma do metodo anterior.
        int divisao = classeDoKotlin.div(soma);

        System.out.println("-----Printando do arquivo Java-----");

        //Printando o valor da soma feita pelo metodo do ArqKotlin
        System.out.println("Valor Soma: "+soma);

        //Printando o valor da divisão feita pelo metodo do ArqKotlin
        System.out.println("Valor Divisão por 2: "+divisao);

    }

    //Metodo Simples com o nome do autor criado para ser chamado no ArqKotlin
    public static String getAutor(){
        return "Nome: Adriano C. V. C. Yasuda\nIdade: 23 ";
    }
}