package io.github.kotlinmania.libc

private fun layoutProbe(index: Int): String = js("""(() => {
    const proc = globalThis.process;
    if (!proc || typeof proc.getBuiltinModule !== 'function') {
        if (typeof globalThis.__kotlinmaniaMacroLayoutValue !== 'function') throw new Error('Compiled C layout fixture was not loaded');
        return globalThis.__kotlinmaniaMacroLayoutValue(index);
    }
    const path = proc.getBuiltinModule('path');
    const requireNative = proc.getBuiltinModule('module').createRequire(path.join(proc.cwd(), 'package.json'));
    return requireNative('@kotlinmania/libc-native-bindings').macroLayoutValue(index);
})()""")

internal actual fun macroLayoutValue(index: Int): ULong = layoutProbe(index).toULong()
