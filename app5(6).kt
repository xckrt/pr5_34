fun main()
{
    try {


    var a = readLine()
    var b = a!!.toInt()
    when (b/1000 > 0)
    {
        true -> {
            var sum1 = a[0].toInt() + a[1].toInt()
            var sum2 = a[2].toInt() + a[3].toInt()
            when (sum1 == sum2) {
                true -> print("Сумма двух первых и двух последних равны")
                false -> print("Сумма двух первых и двух последних не равны")
            }
        }
        false -> print("Число не четырехзначное")
        
    }
    }
    catch (e:Exception)
    {

    }
}