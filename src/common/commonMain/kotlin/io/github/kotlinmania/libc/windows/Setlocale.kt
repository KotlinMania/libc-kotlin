package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun setlocale(category: Int, locale: String?): String?
