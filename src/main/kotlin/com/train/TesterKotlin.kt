package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    val otkn = scanner.nextInt()
    print("How many round-trip tickets:")
    val rtkn = scanner.nextInt()
    val ttbrs = Ticket (otkn, rtkn)
    ttbrs.print()
}

class Ticket (var otkn:Int, var rtkn:Int) {
    fun print() {
        println(
            "\nTotal tickets:" + otkn + "\nRound-trip:" + rtkn +
                    "\nTotal：" + Math.round(totalPrice())
        )
        if (booknum() < 0 ) {
            print ("\tError！")
        }
    }

    fun booknum() = (otkn - rtkn)
    fun totalPrice() = ((otkn - rtkn) * 1000) + (rtkn * (2000 * 0.9))
}