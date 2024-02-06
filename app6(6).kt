fun main()
{
    try
    {

    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    when (a > b)
    {
        true ->
        {
            println("У первой сестры денег больше")
            var c = (a - b)/2
            println("Сестре нужно дать $c")
        }
        false ->
        {
            println("У второй сестры денег больше")
            var c = (b-a)/2
            println("Сестре нужно дать $c")
        }
    }
    }
    catch(e:Exception)
    {
        print("Некорректно введены данные")
    }
}