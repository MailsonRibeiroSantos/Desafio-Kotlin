 abstract  class Professor ( val nome:String,val sobrenome:String, var tempoCasa:Int,val codigo:Int){
     override fun toString(): String {
         return "Professor(nome='$nome', sobrenome='$sobrenome', tempoCasa=$tempoCasa, codigo=$codigo, "
     }
 }