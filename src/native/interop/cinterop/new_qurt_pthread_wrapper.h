#ifndef LIBC_NEW_QURT_PTHREAD_NEW_QURT_PTHREAD_WRAPPER_H
#define LIBC_NEW_QURT_PTHREAD_NEW_QURT_PTHREAD_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libcNewQurtPthreadPthreadCreate(void* thread, void* attr, void* startRoutine, void* arg);
int32_t libcNewQurtPthreadPthreadJoin(void* thread, void* retval);
int32_t libcNewQurtPthreadPthreadDetach(void* thread);
void libcNewQurtPthreadPthreadExit(void* retval);
void* libcNewQurtPthreadPthreadSelf(void);
int32_t libcNewQurtPthreadPthreadEqual(void* t1, void* t2);
int32_t libcNewQurtPthreadPthreadAttrInit(void* attr);
int32_t libcNewQurtPthreadPthreadAttrDestroy(void* attr);
int32_t libcNewQurtPthreadPthreadAttrSetstacksize(void* attr, uint64_t stacksize);
int32_t libcNewQurtPthreadPthreadAttrGetstacksize(void* attr, void* stacksize);
int32_t libcNewQurtPthreadPthreadAttrSetdetachstate(void* attr, int32_t detachstate);
int32_t libcNewQurtPthreadPthreadAttrGetdetachstate(void* attr, void* detachstate);
int32_t libcNewQurtPthreadPthreadMutexInit(void* mutex, void* attr);
int32_t libcNewQurtPthreadPthreadMutexDestroy(void* mutex);
int32_t libcNewQurtPthreadPthreadMutexLock(void* mutex);
int32_t libcNewQurtPthreadPthreadMutexTrylock(void* mutex);
int32_t libcNewQurtPthreadPthreadMutexUnlock(void* mutex);
int32_t libcNewQurtPthreadPthreadMutexattrInit(void* attr);
int32_t libcNewQurtPthreadPthreadMutexattrDestroy(void* attr);
int32_t libcNewQurtPthreadPthreadMutexattrSettype(void* attr, int32_t kind);
int32_t libcNewQurtPthreadPthreadMutexattrGettype(void* attr, void* kind);
int32_t libcNewQurtPthreadPthreadCondInit(void* cond, void* attr);
int32_t libcNewQurtPthreadPthreadCondDestroy(void* cond);
int32_t libcNewQurtPthreadPthreadCondWait(void* cond, void* mutex);
int32_t libcNewQurtPthreadPthreadCondTimedwait(void* cond, void* mutex, void* abstime);
int32_t libcNewQurtPthreadPthreadCondSignal(void* cond);
int32_t libcNewQurtPthreadPthreadCondBroadcast(void* cond);
int32_t libcNewQurtPthreadPthreadCondattrInit(void* attr);
int32_t libcNewQurtPthreadPthreadCondattrDestroy(void* attr);
int32_t libcNewQurtPthreadPthreadCondattrSetclock(void* attr, int32_t clockId);
int32_t libcNewQurtPthreadPthreadKeyCreate(void* key, void* destructor);
int32_t libcNewQurtPthreadPthreadKeyDelete(int32_t key);
void* libcNewQurtPthreadPthreadGetspecific(int32_t key);
int32_t libcNewQurtPthreadPthreadSetspecific(int32_t key, void* value);
int32_t libcNewQurtPthreadPthreadOnce(void* onceControl, void* initRoutine);
int32_t libcNewQurtPthreadPthreadGetnameNp(void* thread, char* name, uint64_t len);
int32_t libcNewQurtPthreadPthreadAttrSetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libcNewQurtPthreadPthreadAttrGetaffinityNp(void* attr, uint64_t cpusetsize, void* cpuset);
int32_t libcNewQurtPthreadPosixMemalign(void* memptr, uint64_t alignment, uint64_t size);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_NEW_QURT_PTHREAD_NEW_QURT_PTHREAD_WRAPPER_H */
