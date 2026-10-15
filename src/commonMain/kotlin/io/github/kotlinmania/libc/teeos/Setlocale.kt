package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun setlocale(cat: Int, name: String?): String?
