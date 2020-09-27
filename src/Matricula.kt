import java.time.LocalDateTime

class Matricula (var aluno: Aluno, var curso:Curso) {
    var data: LocalDateTime? = null
    init {
        data = LocalDateTime.now()
    }
}
