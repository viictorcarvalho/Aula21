package Ex01

open class Livros2(var nomeLivro: String,
        var genero: String,
        var isbn: Int = 0,
        var pessoaAutora: String){

        fun registrarLivro(isbn: Int) {
            println("O livro foi registrado com o isbn $isbn.")
        }

        fun registrarLivro(isbn: Int, nomeLivro: String) {
            println("O livro foi registrado com o isbn $isbn e o nome $nomeLivro.")
        }

        fun registrarLivro(isbn: Int, nomeLivro: String, genero: String){
            println("O livro foi registrado com o isbn $isbn, o nome $nomeLivro e o gênero $genero.")
        }

        fun registrarLivro(isbn: Int, nomeLivro: String, genero: String, pessoaAutora: String) {
            println("O livro foi registrado com todos os atributos.")
        }
    }
