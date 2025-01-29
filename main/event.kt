// An Event. Also the Parent Class to all the future ones
class Event {
    var _description
    var _date
    var _time
    var _rsvp
    var dress = ""
    fun payment(cost: Double,tax: Double): Double {
        return (cost + (cost * tax))
    }

}