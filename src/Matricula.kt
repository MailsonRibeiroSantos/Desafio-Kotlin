import java.time.LocalDateTime

class Matricula (var aluno: Aluno, var curso:Curso, var data: LocalDateTime) {
    init {
        data = LocalDateTime.now()
    }
}
