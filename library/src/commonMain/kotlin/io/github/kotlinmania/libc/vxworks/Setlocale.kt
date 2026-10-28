package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun setlocale(category: Int, locale: String?): String?
