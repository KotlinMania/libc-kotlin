// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun freopen(filename: String?, mode: String?, file: FILE?): FILE?
