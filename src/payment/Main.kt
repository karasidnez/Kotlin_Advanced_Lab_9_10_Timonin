package payment


fun main() {
    val processor = PaymentProcessor()
    val payments = listOf(
        Payment(card = "4_111_111_111_111_111", sum = 1000, type = CardType.VISA),
        Payment(card = "5_111_111_111_111_111", sum = 2000, type = CardType.MASTERCARD),
        Payment(card = "2_222_222_222_222_222", sum = 1500, type = CardType.MIR),
        Payment(card = "1234567812345678", sum = 500, type = CardType.UNKNOWN),
        Payment(card = "123", sum = 3000, type = CardType.VISA) // Неправильная длина
    )
    println("=== Обработка платежей ===")
    payments.forEach { payment ->
        println("\nПлатеж ${payment.type}: ${payment.card.take(n = 4)}... , ${payment.sum} py6")
        val result = processor.pay(payment)
        processor.show(result)
    }
    println("\n=== Работа с enum ===")
    val cardType = CardType.VISA
    println("Тип карты: $cardType")
    println("Порядковый номер: ${cardType.ordinal}")
    println("Все типы карт: ${CardType.values().joinToString()}")
    val payment1 = Payment(card = "4111111111111111", sum = 1000, type = CardType.VISA)
    val payment2 = payment1.copy(type = CardType.MASTERCARD, sum = 2000)

    println("\n=== Сравнение data class ===")
    println("Платеж 1: $payment1")
    println("Платеж 2: $payment2")
    println("Одинаковые? ${payment1 == payment2}")
}
