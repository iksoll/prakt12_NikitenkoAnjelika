import kotlinx.coroutines.*
suspend fun main(){
    var Class:Klass=Klass()
    var k=Class.Input()
    GlobalScope.launch{
        for(i in 1..k){
            println("$i раз")
            Class.Discriminant()
        }
    }
    runBlocking {
        delay(30000L)
    }
}
