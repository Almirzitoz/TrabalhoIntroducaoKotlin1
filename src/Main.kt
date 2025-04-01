fun main() {
    val idMissao = mutableListOf<Int>()

    val nomeComandantes = mutableListOf<String>()

    val distanciaMissao = mutableListOf<Double>()

    val tripulantesPorMissao =  mutableListOf<Int>()

    val mediaDeRefeicaoTripulanteMissao = mutableListOf<Double>()

    val consumoPorkmMissao = mutableListOf<Double>()

    val valorCombustivelMissao = mutableListOf<Double>()

    val duracaoMissao = mutableListOf<Int>()

    val custoCombustivelMissao = mutableListOf<Double>()

    val cobustivelNecessarioMissao = mutableListOf<Double>()

    val refeicaoporTripulanteMissao = mutableListOf<Double>()

    val temperatura = mutableListOf<Double>()

    println("Você deseja cadastrar quantas missões: ")
    var quantidadeMissao = readLine()?.toIntOrNull()?: 0

    var id = 0

    for (i in 1..quantidadeMissao){
        addMissao(id,idMissao,nomeComandantes,distanciaMissao,tripulantesPorMissao,mediaDeRefeicaoTripulanteMissao,consumoPorkmMissao,valorCombustivelMissao,duracaoMissao,custoCombustivelMissao,cobustivelNecessarioMissao,refeicaoporTripulanteMissao,temperatura)
        id++
    }

    infosDistancia(distanciaMissao)
    var fim = false
    while (fim != true){
        println("__________Sistema__________")
        println("Digite 1 para adicionar outras missoões")
        println("Digite 2 para verificar a situação das missões")
        println("Digite 3 para verificar trajes")
        println("Digite 4 para ver as missões")
        println("Digite 5 para sair")
        println("___________________________")

        var escolha = readLine()?.toIntOrNull()?:0

        if (escolha == 1){
            println("Quantidade de missões novas:")
            quantidadeMissao = readLine()?.toIntOrNull()?: 0

            for (i in 1..quantidadeMissao){
                id++

                addMissao(id,idMissao,nomeComandantes,distanciaMissao,tripulantesPorMissao,mediaDeRefeicaoTripulanteMissao,consumoPorkmMissao,valorCombustivelMissao,duracaoMissao,custoCombustivelMissao,cobustivelNecessarioMissao,refeicaoporTripulanteMissao,temperatura)
            }
            infosDistancia(distanciaMissao)
        } else if(escolha == 2){

        } else if(escolha == 3){

        } else if(escolha == 4){
            for (i in idMissao.indices){
                println("_____Missão____")
                println("ID: ${idMissao[i]}")
                println("Comandante: ${nomeComandantes[i]}")
                println("Tripulantes: ${tripulantesPorMissao[i]}")
                println("Distância: ${distanciaMissao[i]}")
                println("Duração: ${duracaoMissao[i]}")
                println("________________")
            }
        } else if(escolha == 5){
            fim = true
        } else{
            println("Opção inválida")
        }

    }

}
fun addMissao(idContador:Int,id: MutableList<Int>,comandantes: MutableList<String>,distanciaDaMissao:MutableList<Double>,tripulantesMissao:MutableList<Int>,mediaRefeicoes:MutableList<Double>,consumoKmMissao:MutableList<Double>,valorCombustivel:MutableList<Double>,duracao:MutableList<Int>,custoCombustivel:MutableList<Double>,combustivelNecessario:MutableList<Double>,refeicaoTripulante:MutableList<Double>,temperatura:MutableList<Double>){
    id.add(idContador)
    println("_____Registro de missão____")

    print("Insira o Nome do Comandante: ")
    var nomeComandante = readLine()?:"A definir"
    comandantes.add(nomeComandante)

    print("Insira a Distância da missão (em Milhões de Km): ")
    var distanciaEmMilhoes = readLine()?.toDoubleOrNull()?:0.0
    distanciaDaMissao.add(distanciaEmMilhoes)

    print("Insira a quantidade de tripulantes da missão: ")
    var tripulantesdamissao = readLine()?.toIntOrNull()?:0
    tripulantesMissao.add(tripulantesdamissao)

    print("Insira a média de refeições dos tripulantes: ")
    var mediaR = readLine()?.toDoubleOrNull()?:0.0
    mediaRefeicoes.add(mediaR)

    print("Insira o consumo por Km da missão: ")
    var consumokm = readLine()?.toDoubleOrNull()?:0.0
    consumoKmMissao.add(consumokm)

    print("Insira o valor do combustivel para missão: ")
    var valor = readLine()?.toDoubleOrNull()?:0.0
    valorCombustivel.add(valor)

    print("Insira quantos dias de missão: ")
    var dias = readLine()?.toIntOrNull()?:0
    duracao.add(dias)

    var combustivelqueprecisa = distanciaEmMilhoes*consumokm
    combustivelNecessario.add(combustivelqueprecisa)

    var custoTotal = combustivelqueprecisa*valor
    custoCombustivel.add(custoTotal)

    var totalRefeicao = tripulantesdamissao*mediaR*dias
    refeicaoTripulante.add(totalRefeicao)

    print("Insira a temperatura do módulo: ")
    var tempe = readLine()?.toDoubleOrNull()?:0.0
    temperatura.add(tempe)
    println("___________________________________")

}
fun infosDistancia(listaDistancia:MutableList<Double>){
    println("Média de distância da missão: ${listaDistancia.average()}")
    println("Maior distância: ${listaDistancia.max()}")
    println("Menor distâcia: ${listaDistancia.min()}")
    var contador = 0
    for (i in listaDistancia.indices){
        if(listaDistancia[i] == 0.0){
            contador+= 1
        }
    }
    println("Total de missões falhadas: $contador")
}