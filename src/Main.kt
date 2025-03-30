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

    println("Você deseja cadastrar quantas missões: ")
    var quantidadeMissao = readLine()?.toIntOrNull()?: 0

    var id = 0

    for (i in 1..quantidadeMissao){
        addMissao(id,idMissao,nomeComandantes,distanciaMissao,tripulantesPorMissao,mediaDeRefeicaoTripulanteMissao,consumoPorkmMissao,valorCombustivelMissao,duracaoMissao,custoCombustivelMissao,cobustivelNecessarioMissao,refeicaoporTripulanteMissao)
        id++
    }
    for (i in idMissao.indices){
        println("__________Missão__________")
        println("ID da missão: ${idMissao[i]}")
        println("Nome do comandante: ${nomeComandantes[i]}")
        println(custoCombustivelMissao)
        println(cobustivelNecessarioMissao)
        println(refeicaoporTripulanteMissao)
        println("__________________________")
    }
}
fun addMissao(idContador:Int,id: MutableList<Int>,comandantes: MutableList<String>,distanciaDaMissao:MutableList<Double>,tripulantesMissao:MutableList<Int>,mediaRefeicoes:MutableList<Double>,consumoKmMissao:MutableList<Double>,valorCombustivel:MutableList<Double>,duracao:MutableList<Int>,custoCombustivel:MutableList<Double>,combustivelNecessario:MutableList<Double>,refeicaoTripulante:MutableList<Double>){
    id.add(idContador)

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

}