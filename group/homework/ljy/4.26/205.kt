fun isIsomorphic(s: String, t: String): Boolean {
    var map= mutableMapOf<Char,Char>()
    for (i in 0..s.length-1){
        var exit:Boolean=false
        for (j in map){
            if (j.key==s[i]) {
                exit=true
                if (j.value!=t[i]) return false
                break
            }
        }
        if (!exit){
            var exit:Boolean=false
            for (j in map){
                if (j.value==t[i]) return false
            }
            map.put(s[i],t[i])
        }
    }
    return true
}
fun main(){
    var s= readLine().toString()
    var t= readLine().toString()
    println(isIsomorphic(s,t))
}