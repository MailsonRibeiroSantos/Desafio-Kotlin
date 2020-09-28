class Curso(var nome: String, var codigo:Int,  var qtdMaximaAlunos:Int) {
    var professorTitular:ProfessorTitular? = null
    var professorAdjunto:ProfessorAdjunto? = null
    var listaAlunos:MutableList<Aluno> = mutableListOf<Aluno>()
    constructor( nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int, professorTitular:ProfessorTitular, professorAdjunto:ProfessorAdjunto, listaAlunos:MutableList<Aluno>): this(nome,codigoCurso,quantidadeMaximaDeAlunos){
        this.professorAdjunto = professorAdjunto
        this.professorTitular = professorTitular
        this.listaAlunos = listaAlunos

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

    override fun toString(): String {
        return "Curso(nome='$nome', codigo=$codigo, qtdMaximaAlunos=$qtdMaximaAlunos)"
    }

}