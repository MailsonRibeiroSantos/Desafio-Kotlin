 class ProfessorTitular( nome:String, sobrenome:String, tempoCasa:Int, codigo:Int,var especialidade: String):
    Professor(nome,sobrenome,tempoCasa,codigo) {
     override fun toString(): String {
         return super.toString() +  "especialidade='$especialidade')"
     }
 }