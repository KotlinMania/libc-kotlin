package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun semOpen(name: String?, flags: Int, vararg args: Any?): SemT?
