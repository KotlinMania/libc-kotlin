package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun putenvS(envstring: String?, valueString: String?): Int
