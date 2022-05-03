package Ex01

fun main() {
    val narnia = Livros2("As crônicas de Nárnia","Fantasia", 2323, "C. S. Lewis")

    narnia.nomeLivro = "As crônicas de Nárnia"
    narnia.genero = "Fantasia"
    narnia.isbn = 2323
    narnia.pessoaAutora = "C. S. Lewis"
    println("Título: " + narnia.nomeLivro +  " \nGênero: " + narnia.genero + " \nISBN: " + narnia.isbn + " \nPessoa autora: " + narnia.pessoaAutora)
    println("")

    narnia.registrarLivro(2323)
    narnia.registrarLivro(2323, "As crônicas de Nárnia")
    narnia.registrarLivro(2323, "As crônicas de Nárnia", "Fantasia")
    narnia.registrarLivro(2323, "As crônicas de Nárnia", "Fantasia", "C. S. Lewis" )
    println("-----------------------------------------------------------------------")


    val listaLivros = ArrayList<Livros2>()
     listaLivros.add(narnia)
     listaLivros.add(Livros2("Pedra Filosofal", "Fantasia", 123456, "J. K. Rowling"))
     listaLivros.add(Livros2("Unicórnio", "Romance", 654321, "Roberto Carlos"))
     listaLivros.add(Livros2("O Dono do Morro", "Ficção", 342513, "Misha Glenny"))

    listaLivros.forEach(){
        println(it.nomeLivro)
        println("Gênero: " + it.genero)
        println("ISBN: " + it.isbn)
        println("Pessoa autora: " + it.pessoaAutora)
        println("-----------------------------------------------------------------------")
    }
}
