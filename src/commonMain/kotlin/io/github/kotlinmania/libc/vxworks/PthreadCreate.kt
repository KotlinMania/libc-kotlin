// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadCreate(pThread: ULong?, pAttr: PthreadAttrT?, startRoutine: ((COpaquePointer?) -> COpaquePointer?)?, value: COpaquePointer?): Int
