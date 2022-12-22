package com.example.oop_exercissse


fun main() {

    var hmr = Hammer()
    hmr.farbe()
    hmr.schaden()

    hmr.setHammer(BauarbeiterHammer())
    hmr.farbe()
    hmr.schaden()

    hmr.setHammer(GoldenerHammer2())
    hmr.farbe()
    hmr.schaden()
}
abstract class WeaponClass : iHammers {

    private var hammer: iHammers = WikingerHammer()

    override fun schaden() {
        hammer.schaden()
    }
    override fun farbe() {
        hammer.farbe()
    }
    fun setHammer(hammers:iHammers){
        this.hammer = hammers
    }
}

interface iHammers {
    fun schaden()
    fun farbe()
}
// Hammer
class Hammer : WeaponClass() {

}
// Hammer Arten
class WikingerHammer() : iHammers {
    override fun schaden() {
        println("755 Schaden WikingerHammer")
    }

    override fun farbe() {
        println("Holz Farbe WikingerHammer")
    }

}
class BauarbeiterHammer() : iHammers {
    override fun schaden() {
        println("60 Schaden BauarbeiterHammer")
    }

    override fun farbe() {
        println("Farbe Schwarz BauarbeiterHammer")
    }

}
class GoldenerHammer() : iHammers {
    override fun schaden() {
        println("6999 Schaden GoldenerHammer")
    }

    override fun farbe() {
        println("Farbe Gold GoldenerHammer")
    }

}
class GoldenerHammer2() : iHammers {
    override fun schaden() {
        println("6999 Schaden GoldenerHammer")
    }

    override fun farbe() {
        println("Farbe Gold GoldenerHammer")
    }

}