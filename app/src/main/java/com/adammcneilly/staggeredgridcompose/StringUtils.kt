package com.adammcneilly.staggeredgridcompose

import kotlin.random.Random

private fun getRandomString(length: Int): String {
    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')

    return (1..length)
        .map { allowedChars.random() }
        .joinToString("")
}

fun getRandomStringList(numItems: Int): List<String> {
    return (1..numItems)
        .map {
            val itemLength = Random.nextInt(1, 150)
            getRandomString(itemLength)
        }
}
