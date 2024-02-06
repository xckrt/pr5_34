import kotlin.math.pow

fun main()
{
    try {
        var x = readLine()!!.toDouble()
        when (x <= 2) {
            true -> {
                var f = Math.pow(x, x) + 4 * x + 5
                println("$ x был меньше или равен 2.Ответ: $f ")
            }
            false -> {
                var f = 1 / (Math.pow(x, x) + 4 * x + 5)
                println("$ x был больше 2.Ответ: $f ")
            }

        }
    }
    catch(e:Exception)
    {
        print("Некорректно введены данные");
    }
}