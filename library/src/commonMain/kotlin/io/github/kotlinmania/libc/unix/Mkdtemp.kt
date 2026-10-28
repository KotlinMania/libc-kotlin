package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun mkdtemp(template: String?): String?
