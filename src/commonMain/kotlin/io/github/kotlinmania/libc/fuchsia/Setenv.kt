package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun setenv(name: String?, `val`: String?, overwrite: Int): Int
