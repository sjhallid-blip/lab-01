package com.example.sam.petshop

class Angry(date:String): Mood(date) {
    override fun moodRep(): String {
        return "GRRR"
    }
}