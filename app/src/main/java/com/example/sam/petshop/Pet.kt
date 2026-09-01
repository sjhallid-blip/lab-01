package com.example.sam.petshop

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}