
const val taxRate = 0.75
const val fixedTax = 35_00

fun main() {
    while (true) {
        println("Ведите сумму перевода (в рублях):")
        var amount = readLine()!!.toInt()
        if (amount <= 0) break
        println("""Сумма перевода: $amount
            |Комиссия составит: ${countResult(amount)/100}
            |Будет начислено ИТОГО: ${amount - countResult(amount)/100}
        """.trimMargin())

        println("Перевод прошел успешно!")
    }

}
//Программа работает в копейках, но ведь пользователю удобнее выражать всё в рублях
fun countResult(amount : Int) : Double {
    return if (amount * taxRate > fixedTax) amount * taxRate
    else fixedTax.toDouble()
}