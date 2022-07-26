fun main() {
    while (true) { 
        println("(r)ocK (p)aper (s)cissors")
        val player = readLine()
        val values = listOf("rock", "paper", "scissors")
        val computer = values.random()

        if (player == computer) {
            println("Tie")
        } else if (player == "r") {
            if (computer == "scissors") {
                println("You Win")
            } else {
                println("You Lose")
            }
        } else if (player == "p") {
            if (computer == "rock") {
                println("You Win")
            } else {
                println("You Lose")
            }
        } else if (player =="s") {
            if (computer == "paper") {
                println("You Win")
            } else {
                println("You Lose")
            }
        } else if (player == "why must you do this" || player == "why must you do this?") {
            println("because you are weak")
        } else {
            println("Invalid Input")
        }

        println("Play Again: (y or n)")
        val choose = readLine()
        if (choose == "n") {
            break
        }

        computer.replace(values.random(), values.random())
    }
}