class Curso(var nome: String, var codigo:Int, var professorTitular:ProfessorTitular, var professorAdjunto:ProfessorAdjunto, var qtdMaximaAlunos:Int, var listaAlunos:MutableList<Aluno>) {

    constructor( nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        this.nome = nome
        this.codigo = codigoCurso
        this.qtdMaximaAlunos = quantidadeMaximaDeAlunos
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(listaAlunos.contains(umAluno)){
            return false
        }
        listaAlunos.add(umAluno)
        return true
    }

    fun excluirAluno(umAluno: Aluno){
        listaAlunos.remove(umAluno)
    }

}