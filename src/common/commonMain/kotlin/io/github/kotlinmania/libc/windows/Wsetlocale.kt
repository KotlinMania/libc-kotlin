package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wsetlocale(category: Int, locale: UShort?): UShort?
