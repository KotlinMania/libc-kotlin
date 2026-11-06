#ifndef LIBC_SOLARIS_SOLARIS_WRAPPER_H
#define LIBC_SOLARIS_SOLARIS_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_solaris_fexecve(int32_t fd, void* argv, void* envp);
int32_t libc_solaris_mincore(void* addr, uint64_t len, char* vec);
int32_t libc_solaris_door_call(int32_t d, void* params);
int32_t libc_solaris_door_return(char* data_ptr, uint64_t data_size, void* desc_ptr, uint32_t num_desc);
int32_t libc_solaris_door_create(int32_t server_procedure, void* cookie, uint32_t attributes);
int32_t libc_solaris_fattach(int32_t fildes, const char* path);
int32_t libc_solaris_pthread_getattr_np(int32_t thread, void* attr);
int32_t libc_solaris_euidaccess(const char* path, int32_t amode);
int32_t libc_solaris_openpty(void* amain, void* asubord, char* name, void* termp, void* winp);
int32_t libc_solaris_forkpty(void* amain, char* name, void* termp, void* winp);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_SOLARIS_SOLARIS_WRAPPER_H */
