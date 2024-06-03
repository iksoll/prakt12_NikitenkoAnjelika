import kotlinx.coroutines.delay

class Repozitory(var login: String, var passvord: String, var kolRep: Int, var open: Boolean) {
    suspend fun sortRep(repositories: List<Repozitory>): List<Repozitory>{
        delay(1500L)
        return repositories.filter {it.open}.sortedWith(compareBy{it.kolRep})
    }
    suspend fun Get_Info(): String {
        delay(1000L)
        return "Логин: $login Пароль: $passvord Кол-во репозиториев: $kolRep"
    }
}