#ifndef LIBC_NEW_QURT_PTHREAD_NEW_QURT_PTHREAD_WRAPPER_H
#define LIBC_NEW_QURT_PTHREAD_NEW_QURT_PTHREAD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_new_qurt_pthread_pthreadCreate(void* thread, void* attr, void* start_routine, void* arg);
int32_t libc_new_qurt_pthread_pthreadJoin(void* thread, void* retval);
int32_t libc_new_qurt_pthread_pthreadDetach(void* thread);
void libc_new_qurt_pthread_pthreadExit(void* retval);
void* libc_new_qurt_pthread_pthreadSelf(void);
int32_t libc_new_qurt_pthread_pthreadEqual(void* t1, void* t2);
int32_t libc_new_qurt_pthread_pthreadAttrInit(void* attr);
int32_t libc_new_qurt_pthread_pthreadAttrDestroy(void* attr);
int32_t libc_new_qurt_pthread_pthreadAttrSetstacksize(void* attr, uint64_t stacksize);
int32_t libc_new_qurt_pthread_pthreadAttrGetstacksize(void* attr, void* stacksize);
int32_t libc_new_qurt_pthread_pthreadAttrSetdetachstate(void* attr, int32_t detachstate);
int32_t libc_new_qurt_pthread_pthreadAttrGetdetachstate(void* attr, void* detachstate);
int32_t libc_new_qurt_pthread_pthreadMutexInit(void* mutex, void* attr);
int32_t libc_new_qurt_pthread_pthreadMutexDestroy(void* mutex);
int32_t libc_new_qurt_pthread_pthreadMutexLock(void* mutex);
int32_t libc_new_qurt_pthread_pthreadMutexTrylock(void* mutex);
int32_t libc_new_qurt_pthread_pthreadMutexUnlock(void* mutex);
int32_t libc_new_qurt_pthread_pthreadMutexattrInit(void* attr);
int32_t libc_new_qurt_pthread_pthreadMutexattrDestroy(void* attr);
int32_t libc_new_qurt_pthread_pthreadMutexattrSettype(void* attr, int32_t kind);
int32_t libc_new_qurt_pthread_pthreadMutexattrGettype(void* attr, void* kind);
int32_t libc_new_qurt_pthread_pthreadCondInit(void* cond, void* attr);
int32_t libc_new_qurt_pthread_pthreadCondDestroy(void* cond);
int32_t libc_new_qurt_pthread_pthreadCondWait(void* cond, void* mutex);
int32_t libc_new_qurt_pthread_pthreadCondTimedwait(void* cond, void* mutex, void* abstime);
int32_t libc_new_qurt_pthread_pthreadCondSignal(void* cond);
int32_t libc_new_qurt_pthread_pthreadCondBroadcast(void* cond);
int32_t libc_new_qurt_pthread_pthreadCondattrInit(void* attr);
int32_t libc_new_qurt_pthread_pthreadCondattrDestroy(void* attr);
int32_t libc_new_qurt_pthread_pthreadCondattrSetclock(void* attr, int32_t clock_id);
int32_t libc_new_qurt_pthread_pthreadKeyCreate(void* key, void* destructor);
int32_t libc_new_qurt_pthread_pthreadKeyDelete(int32_t key);
void* libc_new_qurt_pthread_pthreadGetspecific(int32_t key);
int32_t libc_new_qurt_pthread_pthreadSetspecific(int32_t key, void* value);
int32_t libc_new_qurt_pthread_pthreadOnce(void* once_control, void* init_routine);
int32_t libc_new_qurt_pthread_pthreadGetnameNp(void* thread, char* name, uint64_t len);
int32_t libc_new_qurt_pthread_pthreadAttrSetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libc_new_qurt_pthread_pthreadAttrGetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libc_new_qurt_pthread_posixMemalign(void* memptr, uint64_t alignment, uint64_t size);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_PTHREAD_NEW_QURT_PTHREAD_WRAPPER_H */
