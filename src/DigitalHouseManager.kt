class DigitalHouseManager {
    var listaAlunos:MutableList<Aluno> = mutableListOf<Aluno>()
    var listaProfessores:MutableList<Professor> = mutableListOf<Professor>()
    var listaCursos:MutableList<Curso> = mutableListOf<Curso>()
    var listaMatriculas:MutableList<Matricula> = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int,
                       quantidadeMaximaDeAlunos: Int){
        var novoCurso = Curso(nome,codigoCurso,quantidadeMaximaDeAlunos)
        listaCursos.add(novoCurso)
    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in listaCursos){
            if(codigoCurso == curso.codigo) {
                listaCursos.remove(curso)
            }
        }
    }
    fun registrarProfessorAdjunto(nome: String, sobrenome: String,
    codigoProfessor: Int, quantidadeDeHoras: Int){
        var professorAdjunto = ProfessorAdjunto(nome,sobrenome,0,codigoProfessor,quantidadeDeHoras)
        listaProfessores.add(professorAdjunto)

    }
    fun registrarProfessorTitular(nome: String, sobrenome: String ,
                                  codigoProfessor: Int, especialidade: String){
        var professorTitular = ProfessorTitular(nome,sobrenome,0,codigoProfessor,especialidade)
        listaProfessores.add(professorTitular)
    }

    fun excluirProfessor(codigoProfessor: Int){
        for (professor in listaProfessores){
            if(codigoProfessor == professor.codigo){
                listaProfessores.remove(professor)
            }
        }
    }

    fun matricularAluno(nome: String , sobrenome: String , codigoAluno: Int){
        var novoAluno = Aluno(nome,sobrenome,codigoAluno)
        listaAlunos.add(novoAluno)
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        var aluno:Aluno? = null
        var curso:Curso? = null

        listaAlunos.forEach {
            if(it.codigo == codigoAluno){
                aluno = it
            }
        }

        listaCursos.forEach {
            if(it.codigo == codigoCurso){
                curso = it
            }
        }

        if(aluno != null && curso != null && curso!!.listaAlunos.size < curso!!.qtdMaximaAlunos){
            curso!!.adicionarUmAluno(aluno!!)
            println("Matrícula realizada com sucesso!!")
        }else if(curso!!.listaAlunos.size >= curso!!.qtdMaximaAlunos){
            println("Não foi possível realizar a matrícula, pois não há vagas!!")
        }

    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int,
                          codigoProfessorAdjunto: Int){
        var curso:Curso? = null
        var professorTitular: ProfessorTitular? = null
        var professorAdjunto: ProfessorAdjunto? = null

        listaCursos.forEach {
            if(it.codigo == codigoCurso){
                curso = it
            }
        }

        listaProfessores.forEach {
            if(it.codigo == codigoProfessorTitular){
                professorTitular = it as ProfessorTitular?
            }
            if(it.codigo == codigoProfessorAdjunto){
                professorAdjunto = it as ProfessorAdjunto?
            }
        }
    }



}