package com.example

object Main {
  def main(args: Array[String]) {
    val bank = new Bank()
    bank.deposit(42)
    println("My balance is "+bank.balance)
  }
}
