package com.example.sam.petshop

class Happy(date: String): Mood(date) {
    override fun moodRep(): String {
        return "YAY"
    }
}