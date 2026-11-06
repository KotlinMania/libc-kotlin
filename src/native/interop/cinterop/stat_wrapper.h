#ifndef LIBC_STAT_STAT_WRAPPER_H
#define LIBC_STAT_STAT_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_stat_stat(const char* pathname, void* statbuf);
int32_t libc_stat_fstat(int32_t fd, void* statbuf);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_STAT_STAT_WRAPPER_H */
