
//Caso queira Colocar um nome Customizado a Classe.
@file:JvmName("classeDoKotlin")

//Principal
fun main(args: Array<String>){

    println("-----Printando do Arquivo Kotlin-----")

    //Metódo que pega o nome do Autor da classe feita no arquivo Java e coloca em uma val
    val autor = ArqJava.getAutor()

    //Print o nome do autor armazenado pelo metodo.
    print(autor)

}

//Metodo Simples de soma Criado para ser chamado no ArqJava
fun soma(v: Int, v2: Int): Int{
    return v+v2
}

fun div(v: Int):Int{
    return v/2
}