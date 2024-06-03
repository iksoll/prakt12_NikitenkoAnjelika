import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    var repositories = mutableListOf<Repozitory>()
    while(true){
        try{
            println("Загрузка нового пользователя")
            println("Логин (чтобы выйти введите exit):")
            val login = readln()
            if (login == "exit") break
            println("Пароль:")
            val password = readln()
            if (password.length > 7)
            {
                println("Кол-во репозиториев:")
                val kolRep = readln()!!.toInt()
                if (kolRep > 0)
                {
                    println("Открытый репозиторий(Да, Нет):")
                    val openText = readln()
                    val open:Boolean
                    if (openText == "Да") open = true
                    else open = false
                    val rep = Repozitory(login, password, kolRep, open)
                    repositories.add(rep)
                }
                else println("Кол-во репозиториев должно быть больше 0")
            }
            else println("Пароль должен быть больше 8 символов")
        }
        catch (e:Exception)
        {println("Данные введены не верно")}
    }
    println("Загрузить участников")
    val SortRepos = repositories.first().sortRep(repositories)
    SortRepos.forEach{
        println(it.Get_Info())
    }
}