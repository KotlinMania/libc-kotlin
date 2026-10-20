#include "macro_parity_fixture.h"

/* Compile the real fixture, including compiler-derived layout, for wasm32. */
uint64_t kotlinmania_macro_layout_value(int index) {
    return libc_macro_layout_value(index);
}
