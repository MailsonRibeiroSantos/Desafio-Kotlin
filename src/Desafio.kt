fun main(){
    menuPrincipal()
}
fun menuPrincipal(){
    val digitalHouseManager = DigitalHouseManager()
    do {
        println("----------------------------------------------------------------------")
        println("Selecione uma opção:")
        println("1 -> Cadastrar curso")
        println("2 -> Excluir curso")
        println("3 -> Cadastrar professor adjunto")
        println("4 -> Cadastrar professor titular")
        println("5 -> Excluir professor")
        println("6 -> Registrar aluno")
        println("7 -> Matricular aluno")
        println("8 -> Alocar professor")
        println("9 -> Mostrar Informações")
        println("0 -> Sair")
        println("----------------------------------------------------------------------")
        val opcao = readLine()!!.toInt()
        when(opcao) {
            1 ->  cadastrarCurso(digitalHouseManager)
            2 -> excluirCurso(digitalHouseManager)
            3 -> cadastrarProfessorAdjunto(digitalHouseManager)
            4 -> cadastrarProfessorTitular(digitalHouseManager)
            5 -> excluirProfessor(digitalHouseManager)
            6 -> registrarAluno(digitalHouseManager)
            7 -> matricularAluno(digitalHouseManager)
            8 -> alocarProfessor(digitalHouseManager)
            9 -> mostrarDados(digitalHouseManager)
            0 -> break
        }

    }while(true)
}

fun cadastrarCurso(digitalHouseManager:DigitalHouseManager){
    println("---------------------------REGISTRAR CURSO---------------------------")
    println("Digite nome do curso:")
    val nome = readLine()!!
    println("Digite código do curso:")
    val codigo = readLine()!!.toInt()
    println("Digite a quantidade máxima de alunos do curso:")
    val qtdMaxima = readLine()!!.toInt()
    digitalHouseManager.registrarCurso(nome,codigo,qtdMaxima)
}

fun excluirCurso(digitalHouseManager:DigitalHouseManager){
    println("---------------------------EXCLUIR CURSO---------------------------")
    println("Digite código do curso que deseja excluir:")
    val codigo = readLine()!!.toInt()
    digitalHouseManager.excluirCurso(codigo)
}

fun cadastrarProfessorAdjunto(digitalHouseManager:DigitalHouseManager){
    println("---------------------------REGISTRAR PROFESSOR ADJUNTO---------------------------")
    println("Digite nome do professor:")
    val nome = readLine()!!
    println("Digite sobrenome do professor:")
    val sobrenome = readLine()!!
    println("Digite código do professor:")
    val codigo = readLine()!!.toInt()
    println("Digite quantidade de horas do professor:")
    val qtdHoras = readLine()!!.toInt()
    digitalHouseManager.registrarProfessorAdjunto(nome,sobrenome,codigo,qtdHoras)
}

fun cadastrarProfessorTitular(digitalHouseManager:DigitalHouseManager){
    println("---------------------------REGISTRAR PROFESSOR TITULAR---------------------------")
    println("Digite nome do professor:")
    val nome = readLine()!!
    println("Digite sobrenome do professor:")
    val sobrenome = readLine()!!
    println("Digite código do professor:")
    val codigo = readLine()!!.toInt()
    println("Digite especialidade do professor:")
    val especialidade = readLine()!!
    digitalHouseManager.registrarProfessorTitular(nome,sobrenome,codigo,especialidade)
}

fun excluirProfessor(digitalHouseManager:DigitalHouseManager){
    println("---------------------------EXCLUIR PROFESSOR---------------------------")
    println("Digite código do professor:")
    val codigo = readLine()!!.toInt()
    digitalHouseManager.excluirProfessor(codigo)
}

fun registrarAluno(digitalHouseManager:DigitalHouseManager){
    println("---------------------------REGISTRAR ALUNO---------------------------")
    println("Digite nome do aluno:")
    val nome = readLine()!!
    println("Digite sobrenome do aluno:")
    val sobrenome = readLine()!!
    println("Digite código do aluno:")
    val codigo = readLine()!!.toInt()
    digitalHouseManager.matricularAluno(nome,sobrenome,codigo)
}

fun matricularAluno(digitalHouseManager:DigitalHouseManager){
    println("---------------------------MATRICULAR ALUNO---------------------------")
    println("Digite código do aluno:")
    val codigoAluno = readLine()!!.toInt()
    println("Digite código do curso:")
    val codigoCurso = readLine()!!.toInt()
    digitalHouseManager.matricularAluno(codigoAluno,codigoCurso)
}

fun alocarProfessor(digitalHouseManager:DigitalHouseManager){
    println("---------------------------ALOCAR PROFESSORES---------------------------")
    println("Digite código do curso:")
    val codigoCurso = readLine()!!.toInt()
    println("Digite código do professor titular:")
    val codigoProfessorTitular = readLine()!!.toInt()
    println("Digite código do professor adjunto:")
    val codigoProfessorAdjunto = readLine()!!.toInt()
    digitalHouseManager.alocarProfessores(codigoCurso,codigoProfessorTitular,codigoProfessorAdjunto)
}
fun mostrarDados(digitalHouseManager:DigitalHouseManager){
    println(digitalHouseManager.toString())
}