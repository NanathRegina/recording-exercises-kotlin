fun main() {
 quantCaracterer("Natalia")
 maiorValor(1,4)
 valorCompra(4)
 pesoCategoria("Pena")
 numerosPares()
 inversao("Nati")
}

fun quantCaracterer(texto: String) = println("A String $texto possui ${texto.length} caracteres.")

fun maiorValor(a: Int, b: Int)= if(a==b) println("Valores iguais") else if (a>b) println(a) else println(b)

fun valorCompra(unidade: Int)= if(unidade < 10) println("Valor total: "+ (unidade * 3)) else println("Valor total: "+(unidade * 2))

fun pesoCategoria(categoria: String) {
 when (categoria) {
  in "Pena" -> println("Pena: menos de 57 kg")
  in "Leve" -> println("Leve: mais de 57 kg e menos de 61 kg")
  in "Médio" -> println("Médio: mais de 61 kg e menos de 73 kg")
  in "Pesado" -> println("Pesado: igual ao acima de 73 kg")
  else -> println("Categoria inexistente")
 }
}

fun numerosPares(){ for(i in 100..200 step 2) println(i) }

fun inversao(palavra: String) = println(palavra.split("").reversed().joinToString(""))
