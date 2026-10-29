package io.github.kotlinmania.libc.solid

import io.github.kotlinmania.libc.*

public expect fun getStdioFile(fileno: Int): FILE?
