package com.example.romanox

fun decimalARomano(numero: Int): String {
    val valoresRomanos = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
    val valoresDecimales = arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
    var numeroDecimal = numero
    var romano = ""
    for (i in 0 until valoresRomanos.size) {
        while (numeroDecimal >= valoresDecimales[i]) {
            romano += valoresRomanos[i]
            numeroDecimal -= valoresDecimales[i]
        }
    }
    return romano
}
