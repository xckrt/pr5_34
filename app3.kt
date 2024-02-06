fun main()
{
    try {
        var a = readLine()!!.toInt()
        when (a in 0..2) {
            true -> print("Младенец")
            false -> when (a in 3..14) {
                true -> print("Ребенок")
                false -> when (a in 15..18) {
                    true -> print("Подросток")
                    false -> when (a in 19..50) {
                        true -> print("Взрослый")
                        false -> print("Пенсионер")
                    }
                }

            }
        }
    }
    catch (e:Exception)
    {
     print("Неккоректно введены данные");
    }
}