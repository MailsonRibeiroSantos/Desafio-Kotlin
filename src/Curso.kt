class Curso(val nome: String, val codigo:Int, var professorTitular:ProfessorTitular, var professorAdjunto:ProfessorAdjunto, val qtdMaximaAlunos:Int, var listaAlunos:MutableList<Aluno>) {
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