#ifndef LIBC_NEW_QURT_DLFCN_NEW_QURT_DLFCN_WRAPPER_H
#define LIBC_NEW_QURT_DLFCN_NEW_QURT_DLFCN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libcNewQurtDlfcnDlopen(const char* filename, int32_t flag);
int32_t libcNewQurtDlfcnDlclose(void* handle);
void* libcNewQurtDlfcnDlsym(void* handle, const char* symbol);
char* libcNewQurtDlfcnDlerror(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_DLFCN_NEW_QURT_DLFCN_WRAPPER_H */
