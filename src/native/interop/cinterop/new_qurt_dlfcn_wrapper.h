#ifndef LIBC_NEW_QURT_DLFCN_NEW_QURT_DLFCN_WRAPPER_H
#define LIBC_NEW_QURT_DLFCN_NEW_QURT_DLFCN_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

void* libc_new_qurt_dlfcn_dlopen(const char* filename, int32_t flag);
int32_t libc_new_qurt_dlfcn_dlclose(void* handle);
void* libc_new_qurt_dlfcn_dlsym(void* handle, const char* symbol);
char* libc_new_qurt_dlfcn_dlerror(void);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_DLFCN_NEW_QURT_DLFCN_WRAPPER_H */
