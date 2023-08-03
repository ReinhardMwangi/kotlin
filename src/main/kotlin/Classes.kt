fun main() {
    val tv = SmartDevice()
    tv.brand = "Samsung Smart TV QLED"
    tv.price = 1000.0
    println("${tv.brand} ${tv.price}")
    tv.turnOff()
    val phone = SmartDevice()
    phone.brand = "Apple Iphone"
    phone.price = 1200.00
    println("${phone.brand} ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()

}
// blueprint
class SmartDevice   {
    var brand: String = ""
    var price: Double = 0.0
    var isSwitchedOn: Boolean = false
// method/functions
    fun getDeviceState() {
        println("{$brand is on: $isSwitchedOn}")
    }
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }
      fun turnOff() {
          isSwitchedOn = false
        println("$brand is switching off")
    }
}