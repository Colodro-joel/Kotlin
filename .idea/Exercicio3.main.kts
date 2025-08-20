fun main() {
    var opcao: Int? = null
    println("----- Cardápio --------")
    println("1 - X-Salada")
    println("2- X-Bacon")
    println("3- X-Tudo")
    println("4 - X-Tudo Duplo")
    println("5- Sair do Menu")
    print("Escolha uma opção desejada: ")

    opcao = readLine()?.toIntOrNull()

    when (opcao) {
        1 -> println("Você escolheu X-Salada. Preço R$18,50")
        2 -> println("Você escolheu X-Bacon. Preço R$ 20,00")
        3 -> println("Você escolheu X-Tudo. Preço R$ 24,50")
        4 -> println("Você escolheu X-Tudo Duplo. Preço R$ 27,00")
        0 -> println("Saindo do Menu. Volte Sempre...")
        else -> println("Opção Inválida.Tente Novamente!")
    }
}

