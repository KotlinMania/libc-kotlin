package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fopen(filename: String?, mode: String?): FILE?
