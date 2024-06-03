import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class Klass {
    fun Input():Int
    {
        println("Сколько раз нужно запустить")
        var kol = readln()!!.toInt()
        if (kol > 0)
            return kol
        else println("Число должно быть больше 0, автоматически число равно 1")
            return 1
    }
    suspend fun Discriminant(){
        print("Введите коэфицент а: "); var a = readLine()!!.toInt()
        print("Введите коэфицент b: "); var b = readLine()!!.toInt()
        print("Введите коэфицент c: "); var c = readLine()!!.toInt()
        if (b > 0 && c > 0)
        println("Для ${a}x^2+${b}x+$c дискриминант равен ${b*b-4*a*c}")
        if (b < 0 && c > 0)
        println("Для ${a}x^2${b}x+$c дискриминант равен ${b*b-4*a*c}")
        if (b > 0 && c < 0)
        println("Для ${a}x^2+${b}x$c дискриминант равен ${b*b-4*a*c}")
        if (b < 0 && c < 0)
        println("Для ${a}x^2${b}x$c дискриминант равен ${b*b-4*a*c}")
        if (b == 0 && c > 0)
        println("Для ${a}x^2+$c дискриминант равен ${b*b-4*a*c}")
        if (b == 0 && c < 0)
        println("Для ${a}x^2$c дискриминант равен ${b*b-4*a*c}")
        if (b > 0 && c == 0)
        println("Для ${a}x^2+${b}x дискриминант равен ${b*b-4*a*c}")
        if (b < 0 && c == 0)
        println("Для ${a}x^2${b}x дискриминант равен ${b*b-4*a*c}")

    }
}