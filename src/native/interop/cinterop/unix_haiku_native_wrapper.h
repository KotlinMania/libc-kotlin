#ifndef LIBC_UNIX_HAIKU_NATIVE_UNIX_HAIKU_NATIVE_WRAPPER_H
#define LIBC_UNIX_HAIKU_NATIVE_UNIX_HAIKU_NATIVE_WRAPPER_H

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

int32_t libc_unix_haiku_native_createArea(const char* name, void* startAddress, uint32_t addressSpec, uint64_t size, uint32_t lock, uint32_t protection);
int32_t libc_unix_haiku_native_cloneArea(const char* name, void* destAddress, uint32_t addressSpec, uint32_t protection, int32_t source);
int32_t libc_unix_haiku_native_findArea(const char* name);
int32_t libc_unix_haiku_native_areaFor(void* address);
int32_t libc_unix_haiku_native_deleteArea(int32_t id);
int32_t libc_unix_haiku_native_resizeArea(int32_t id, uint64_t newSize);
int32_t libc_unix_haiku_native_setAreaProtection(int32_t id, uint32_t newProtection);
int32_t libc_unix_haiku_native_getAreaInfo(int32_t id, void* areaInfo, uint64_t size);
int32_t libc_unix_haiku_native_getNextAreaInfo(int32_t team, void* cookie, void* areaInfo, uint64_t size);
int32_t libc_unix_haiku_native_createPort(int32_t capacity, const char* name);
int32_t libc_unix_haiku_native_findPort(const char* name);
int64_t libc_unix_haiku_native_readPort(int32_t port, void* code, void* buffer, uint64_t bufferSize);
int64_t libc_unix_haiku_native_readPortEtc(int32_t port, void* code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout);
int32_t libc_unix_haiku_native_writePort(int32_t port, int32_t code, void* buffer, uint64_t bufferSize);
int32_t libc_unix_haiku_native_writePortEtc(int32_t port, int32_t code, void* buffer, uint64_t bufferSize, uint32_t flags, int64_t timeout);
int32_t libc_unix_haiku_native_closePort(int32_t port);
int32_t libc_unix_haiku_native_deletePort(int32_t port);
int64_t libc_unix_haiku_native_portBufferSize(int32_t port);
int64_t libc_unix_haiku_native_portBufferSizeEtc(int32_t port, uint32_t flags, int64_t timeout);
int64_t libc_unix_haiku_native_portCount(int32_t port);
int32_t libc_unix_haiku_native_setPortOwner(int32_t port, int32_t team);
int32_t libc_unix_haiku_native_getPortInfo(int32_t port, void* buf, uint64_t portInfoSize);
int32_t libc_unix_haiku_native_getNextPortInfo(int32_t port, void* cookie, void* portInfo, uint64_t portInfoSize);
int32_t libc_unix_haiku_native_getPortMessageInfoEtc(int32_t port, void* info, uint64_t infoSize, uint32_t flags, int64_t timeout);
int32_t libc_unix_haiku_native_createSem(int32_t count, const char* name);
int32_t libc_unix_haiku_native_deleteSem(int32_t id);
int32_t libc_unix_haiku_native_acquireSem(int32_t id);
int32_t libc_unix_haiku_native_acquireSemEtc(int32_t id, int32_t count, uint32_t flags, int64_t timeout);
int32_t libc_unix_haiku_native_releaseSem(int32_t id);
int32_t libc_unix_haiku_native_releaseSemEtc(int32_t id, int32_t count, uint32_t flags);
int32_t libc_unix_haiku_native_switchSem(int32_t semToBeReleased, int32_t id);
int32_t libc_unix_haiku_native_switchSemEtc(int32_t semToBeReleased, int32_t id, int32_t count, uint32_t flags, int64_t timeout);
int32_t libc_unix_haiku_native_getSemCount(int32_t id, void* threadCount);
int32_t libc_unix_haiku_native_setSemOwner(int32_t id, int32_t team);
int32_t libc_unix_haiku_native_getSemInfo(int32_t id, void* info, uint64_t infoSize);
int32_t libc_unix_haiku_native_getNextSemInfo(int32_t team, void* cookie, void* info, uint64_t infoSize);
int32_t libc_unix_haiku_native_killTeam(int32_t team);
int32_t libc_unix_haiku_native_getTeamInfo(int32_t team, void* info, uint64_t size);
int32_t libc_unix_haiku_native_getNextTeamInfo(void* cookie, void* info, uint64_t size);
int32_t libc_unix_haiku_native_spawnThread(void* func, const char* name, int32_t priority, void* data);
int32_t libc_unix_haiku_native_killThread(int32_t thread);
int32_t libc_unix_haiku_native_resumeThread(int32_t thread);
int32_t libc_unix_haiku_native_suspendThread(int32_t thread);
int32_t libc_unix_haiku_native_renameThread(int32_t thread, const char* newName);
int32_t libc_unix_haiku_native_setThreadPriority(int32_t thread, int32_t newPriority);
int32_t libc_unix_haiku_native_suggestThreadPriority(uint32_t what, int32_t period, int64_t jitter, int64_t length);
int64_t libc_unix_haiku_native_estimateMaxSchedulingLatency(int32_t th);
void libc_unix_haiku_native_exitThread(int32_t status);
int32_t libc_unix_haiku_native_waitForThread(int32_t thread, void* returnValue);
int32_t libc_unix_haiku_native_onExitThread(void* callback, void* data);
int32_t libc_unix_haiku_native_findThread(const char* name);
int32_t libc_unix_haiku_native_getSchedulerMode(void);
int32_t libc_unix_haiku_native_setSchedulerMode(int32_t mode);
int32_t libc_unix_haiku_native_sendData(int32_t thread, int32_t code, void* buffer, uint64_t bufferSize);
int32_t libc_unix_haiku_native_receiveData(void* sender, void* buffer, uint64_t bufferSize);
bool libc_unix_haiku_native_hasData(int32_t thread);
int32_t libc_unix_haiku_native_snooze(int64_t amount);
int32_t libc_unix_haiku_native_snoozeEtc(int64_t amount, int32_t timeBase, uint32_t flags);
int32_t libc_unix_haiku_native_snoozeUntil(int64_t arg_0_time, int32_t timeBase);
int32_t libc_unix_haiku_native_getThreadInfo(int32_t id, void* info, uint64_t size);
int32_t libc_unix_haiku_native_getNextThreadInfo(int32_t team, void* cookie, void* info, uint64_t size);
int32_t libc_unix_haiku_native_getPthreadThreadId(void* thread);
int32_t libc_unix_haiku_native_getTeamUsageInfo(int32_t team, int32_t who, void* info, uint64_t size);
uint64_t libc_unix_haiku_native_realTimeClock(void);
void libc_unix_haiku_native_setRealTimeClock(uint64_t secsSinceJan1st1970);
int64_t libc_unix_haiku_native_realTimeClockUsecs(void);
int64_t libc_unix_haiku_native_systemTime(void);
int64_t libc_unix_haiku_native_systemTimeNsecs(void);
int64_t libc_unix_haiku_native_setAlarm(int64_t when, uint32_t flags);
void libc_unix_haiku_native_debugger(const char* message);
int32_t libc_unix_haiku_native_disableDebugger(int32_t state);
int32_t libc_unix_haiku_native_getSystemInfo(void* info);
int32_t libc_unix_haiku_native_getCpuInfoEtc(uint32_t firstCPU, uint32_t cpuCount, void* info, uint64_t size);
int32_t libc_unix_haiku_native_getCpuTopologyInfo(void* topologyInfos, void* topologyInfoCount);
int32_t libc_unix_haiku_native_isComputerOn(void);
double libc_unix_haiku_native_isComputerOnFire(void);
int32_t libc_unix_haiku_native_sendSignal(int32_t threadID, uint32_t signal);
void libc_unix_haiku_native_setSignalStack(void* base, uint64_t size);
int64_t libc_unix_haiku_native_waitForObjects(void* infos, int32_t numInfos);
int64_t libc_unix_haiku_native_waitForObjectsEtc(void* infos, int32_t numInfos, uint32_t flags, int64_t timeout);
int64_t libc_unix_haiku_native_fsReadAttr(int32_t fd, const char* attribute, uint32_t type_, int64_t pos, void* buffer, uint64_t readBytes);
int64_t libc_unix_haiku_native_fsWriteAttr(int32_t fd, const char* attribute, uint32_t type_, int64_t pos, void* buffer, uint64_t writeBytes);
int32_t libc_unix_haiku_native_fsRemoveAttr(int32_t fd, const char* attribute);
int32_t libc_unix_haiku_native_fsStatAttr(int32_t fd, const char* attribute, void* attrInfo);
int32_t libc_unix_haiku_native_fsOpenAttr(const char* path, const char* attribute, uint32_t type_, int32_t openMode);
int32_t libc_unix_haiku_native_fsFopenAttr(int32_t fd, const char* attribute, uint32_t type_, int32_t openMode);
int32_t libc_unix_haiku_native_fsCloseAttr(int32_t fd);
void* libc_unix_haiku_native_fsOpenAttrDir(const char* path);
void* libc_unix_haiku_native_fsLopenAttrDir(const char* path);
void* libc_unix_haiku_native_fsFopenAttrDir(int32_t fd);
int32_t libc_unix_haiku_native_fsCloseAttrDir(void* dir);
void* libc_unix_haiku_native_fsReadAttrDir(void* dir);
void libc_unix_haiku_native_fsRewindAttrDir(void* dir);
int32_t libc_unix_haiku_native_fsCreateIndex(int32_t device, const char* name, uint32_t type_, uint32_t flags);
int32_t libc_unix_haiku_native_fsRemoveIndex(int32_t device, const char* name);
int32_t libc_unix_haiku_native_fsStatIndex(int32_t device, const char* name, void* indexInfo);
void* libc_unix_haiku_native_fsOpenIndexDir(int32_t device);
int32_t libc_unix_haiku_native_fsCloseIndexDir(void* indexDirectory);
void* libc_unix_haiku_native_fsReadIndexDir(void* indexDirectory);
void libc_unix_haiku_native_fsRewindIndexDir(void* indexDirectory);
int32_t libc_unix_haiku_native_devForPath(const char* path);
int32_t libc_unix_haiku_native_nextDev(void* pos);
int32_t libc_unix_haiku_native_fsStatDev(int32_t dev, void* info);
void* libc_unix_haiku_native_fsOpenQuery(int32_t device, const char* query, uint32_t flags);
void* libc_unix_haiku_native_fsOpenLiveQuery(int32_t device, const char* query, uint32_t flags, int32_t port, int32_t token);
int32_t libc_unix_haiku_native_fsCloseQuery(void* d);
void* libc_unix_haiku_native_fsReadQuery(void* d);
int32_t libc_unix_haiku_native_getPathForDirent(void* dent, char* buf, uint64_t len);
int32_t libc_unix_haiku_native_fsMountVolume(const char* where_, const char* device, const char* filesystem, uint32_t flags, const char* parameters);
int32_t libc_unix_haiku_native_fsUnmountVolume(const char* path, uint32_t flags);
int32_t libc_unix_haiku_native_loadImage(int32_t argc, void* argv, void* arg_2_environ);
int32_t libc_unix_haiku_native_loadAddOn(const char* path);
int32_t libc_unix_haiku_native_unloadAddOn(int32_t image);
int32_t libc_unix_haiku_native_getImageSymbol(int32_t image, const char* name, int32_t symbolType, void* symbolLocation);
int32_t libc_unix_haiku_native_getNthImageSymbol(int32_t image, int32_t n, char* nameBuffer, void* nameLength, void* symbolType, void* symbolLocation);
void libc_unix_haiku_native_clearCaches(void* address, uint64_t length, uint32_t flags);
int32_t libc_unix_haiku_native_getImageInfo(int32_t image, void* info, uint64_t size);
int32_t libc_unix_haiku_native_getNextImageInfo(int32_t team, void* cookie, void* info, uint64_t size);
int32_t libc_unix_haiku_native_findPath(void* codePointer, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize);
int32_t libc_unix_haiku_native_findPathEtc(void* codePointer, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize);
int32_t libc_unix_haiku_native_findPathForPath(const char* path, int32_t baseDirectory, const char* subPath, char* pathBuffer, uint64_t bufferSize);
int32_t libc_unix_haiku_native_findPathForPathEtc(const char* path, const char* dependency, const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, char* pathBuffer, uint64_t bufferSize);
int32_t libc_unix_haiku_native_findPaths(int32_t baseDirectory, const char* subPath, void* arg_2_paths, void* pathCount);
int32_t libc_unix_haiku_native_findPathsEtc(const char* architecture, int32_t baseDirectory, const char* subPath, uint32_t flags, void* arg_4_paths, void* pathCount);
int32_t libc_unix_haiku_native_findDirectory(int32_t which, int32_t volume, bool createIt, char* pathString, int32_t length);
int32_t libc_unix_haiku_native_getCpuid(void* info, uint32_t eaxRegister, uint32_t cpuNum);

#ifdef __cplusplus
}
#endif

#endif /* LIBC_UNIX_HAIKU_NATIVE_UNIX_HAIKU_NATIVE_WRAPPER_H */
