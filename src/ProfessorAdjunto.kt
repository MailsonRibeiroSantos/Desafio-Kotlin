 class ProfessorAdjunto(nome:String, sobrenome:String, tempoCasa:Int, codigo:Int,var
qtdHorasMonitoria:Int) :Professor(nome,sobrenome,tempoCasa,codigo) {
     override fun toString(): String {
         return super.toString() + " qtdHorasMonitoria=$qtdHorasMonitoria )"
     }
 }