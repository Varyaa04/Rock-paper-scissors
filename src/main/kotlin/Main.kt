fun main() {
    val options = listOf("Камень", "Ножницы", "Бумага")

    while (true) {
        println("Выберите один из вариантов: 1 - Камень, 2 - Ножницы, 3 - Бумага")
        val playerChoice = readLine()?.toIntOrNull()

        if (playerChoice in 1..3) {
            val computerChoice = (1..3).random()

            println("Вы выбрали: ${options[playerChoice!! - 1]}")
            println("Компьютер выбрал: ${options[computerChoice - 1]}")

            if (computerChoice == 1  && playerChoice == 2){
                println("камень затупляет или ломает ножницы")
            }
            else if (computerChoice == 1 && playerChoice == 3){
                println("бумага обёртывает камень")
            }
            else if (computerChoice == 2 && playerChoice == 3){
                println("ножницы разрезают бумагу")
            }
            if (computerChoice == 2  && playerChoice == 1){
                println("камень затупляет или ломает ножницы")
            }
            else if (computerChoice == 3 && playerChoice == 1){
                println("бумага обёртывает камень")
            }
            else if (computerChoice == 3 && playerChoice == 2){
                println("ножницы разрезают бумагу")
            }
            if (playerChoice == computerChoice) {
                println("Ничья! Попробуйте еще раз")


            } else if ((playerChoice == 1 && computerChoice == 2) ||
                (playerChoice == 2 && computerChoice == 3) ||
                (playerChoice == 3 && computerChoice == 1)
            ) {
                println("Вы победили!")
            } else {
                println("Вы проиграли!")
            }
        } else {
            println("Некорректный выбор. выберите число от 1 до 3")
        }

        println("Хотите сыграть еще раз? (Да/Нет)")
        val playAgain = readLine()?.toLowerCase()
        if (playAgain != "да") {
            break
        }
    }
}