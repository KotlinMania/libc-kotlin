// port-lint: source macros.rs
package io.github.kotlinmania.libc

/** Computes the offset of an actual field address within its enclosing allocation. */
internal fun offsetOf(base: COpaquePointer, field: COpaquePointer, size: ULong): ULong {
    val start = base.value.toULong()
    val address = field.value.toULong()
    check(address >= start) { "Field address precedes allocation" }
    val offset = address - start
    check(offset <= size) { "Field address exceeds allocation" }
    return offset
}
