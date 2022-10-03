package machine

import java.util.*

enum class State {
    WAITING_FOR_ACTION,
    FILLING,
    BUYING
}

enum class Action {
    BUY,
    FILL,
    TAKE,
    REMAINING,
    EXIT,
}

enum class Fill {
    WATER,
    MILK,
    BEANS,
    CUPS,
    MONEY,
    NULL
}

class CoffeeMachine {
    private var state: State = State.WAITING_FOR_ACTION
    private var fill: Fill = Fill.NULL
    val scanner = Scanner(System.`in`)
    private var stateWater = 400
    private var stateMilk = 540
    private var stateBeans = 120
    private var stateCups = 9
    private var stateMoney = 550

    private fun hasEnoughSupplies(neededWater: Int, neededMilk: Int, neededCoffeeBeans: Int): Boolean {
        if (stateWater < neededWater) {
            println("Sorry, not enough water!")
            return false
        }
        if (stateMilk < neededMilk) {
            println("Sorry, not enough milk!")
            return false
        }
        if (stateBeans < neededCoffeeBeans) {
            println("Sorry, not enough coffee beans!")
            return false
        }
        if (stateCups == 0) {
            println("Sorry, not enough cups!")
            return false
        }
        println("I have enough resources, making you coffee!")
        return true
    }

    private fun remaining() {
        println("The coffee machine has:")
        println("$stateWater ml of water")
        println("$stateMilk ml of milk")
        println("$stateBeans g of coffee beans")
        println("$stateCups disposable cups")
        println("$$stateMoney of money")
    }

    private fun fill(fillAmount: Int) {
        when (fill) {
            Fill.WATER -> {
                stateWater += fillAmount
                fill = Fill.MILK
            }

            Fill.MILK -> {
                stateMilk += fillAmount
                fill = Fill.BEANS
            }

            Fill.BEANS -> {
                stateBeans += fillAmount
                fill = Fill.CUPS
            }

            Fill.CUPS -> {
                stateCups += fillAmount
                fill = Fill.NULL
                resetState()
            }
        }
    }

    private fun resetState() {
        state = State.WAITING_FOR_ACTION
    }

    private fun take() {
        val accruedMoney = stateMoney
        stateMoney = 0
        println("I gave you $$accruedMoney")
    }

    private fun buy(type: String) {
        if (type == "back") {
            resetState()
            return
        }

        when (type.toInt()) {
            1 -> {
                val neededWater = 250
                val neededCoffeeBeans = 16
                val neededMilk = 0
                // check if I have enough supplies
                if (!hasEnoughSupplies(neededWater, neededMilk, neededCoffeeBeans)) {
                    resetState()
                    return
                }
                stateMoney += 4

                stateWater -= neededWater
                stateBeans -= neededCoffeeBeans
                stateMilk -= neededMilk
                stateCups -= 1

                resetState()
            }

            2 -> {
                val neededWater = 350
                val neededCoffeeBeans = 20
                val neededMilk = 75
                if (!hasEnoughSupplies(neededWater, neededMilk, neededCoffeeBeans)) {
                    resetState()
                    return
                }
                stateMoney += 7

                stateWater -= neededWater
                stateBeans -= neededCoffeeBeans
                stateMilk -= neededMilk
                stateCups -= 1

                resetState()
            }

            3 -> {
                val neededWater = 200
                val neededCoffeeBeans = 12
                val neededMilk = 100
                // check if I have enough supplies
                if (!hasEnoughSupplies(neededWater, neededMilk, neededCoffeeBeans)) {
                    resetState()
                    return
                }
                stateMoney += 6

                stateWater -= neededWater
                stateBeans -= neededCoffeeBeans
                stateMilk -= neededMilk
                stateCups -= 1

                resetState()
            }
        }
    }


    private fun chooseAction(inputLine: String) {
        when (inputLine.uppercase()) {
            Action.REMAINING.toString() -> remaining()
            Action.BUY.toString() -> {
                state = State.BUYING
            }

            Action.FILL.toString() -> {
                state = State.FILLING
                fill = Fill.WATER
            }

            Action.TAKE.toString() -> take()
            else -> throw IllegalArgumentException("Unknown operation type!")
        }
    }


    fun work(inputLine: String) {
        when (state) {
            State.WAITING_FOR_ACTION -> chooseAction(inputLine)
            State.FILLING -> fill(inputLine.toInt())
            State.BUYING -> buy(inputLine)
        }
    }

}

fun main() {
    val scanner = Scanner(System.`in`)
    val coffeeMachine = CoffeeMachine()

    do {
        val inputLine = scanner.nextLine()

        if (inputLine == "exit") {
            return
        } else {
            coffeeMachine.work(inputLine)
        }
    } while (scanner.hasNextLine())
}
