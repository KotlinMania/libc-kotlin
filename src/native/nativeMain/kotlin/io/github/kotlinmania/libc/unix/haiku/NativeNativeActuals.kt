@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.DIR
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun createArea(name: String?, startAddress: COpaquePointer?, addressSpec: UInt, size: ULong, lock: UInt, protection: UInt): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_create_area(name, startAddress?.value?.toCPointer<ByteVar>(), addressSpec, size, lock, protection)

public actual fun cloneArea(name: String?, destAddress: COpaquePointer?, addressSpec: UInt, protection: UInt, source: AreaId): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_clone_area(name, destAddress?.value?.toCPointer<ByteVar>(), addressSpec, protection, source)

public actual fun findArea(name: String?): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_area(name)

public actual fun areaFor(address: COpaquePointer?): AreaId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_area_for(address?.value?.toCPointer<ByteVar>())

public actual fun deleteArea(id: AreaId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_delete_area(id)

public actual fun resizeArea(id: AreaId, newSize: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_resize_area(id, newSize)

public actual fun setAreaProtection(id: AreaId, newProtection: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_area_protection(id, newProtection)

public actual fun getAreaInfo(id: AreaId, areaInfo: AreaInfo?, size: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_area_info(id, areaInfo?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextAreaInfo(team: TeamId, cookie: Long?, areaInfo: AreaInfo?, size: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_next_area_info(team, cookie?.value?.toCPointer<ByteVar>(), areaInfo?.value?.toCPointer<ByteVar>(), size)

public actual fun createPort(capacity: Int, name: String?): PortId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_create_port(capacity, name)

public actual fun findPort(name: String?): PortId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_port(name)

public actual fun readPort(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_read_port(port, code?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun readPortEtc(port: PortId, code: Int?, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_read_port_etc(port, code?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize, flags, timeout)

public actual fun writePort(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_write_port(port, code, buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun writePortEtc(port: PortId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_write_port_etc(port, code, buffer?.value?.toCPointer<ByteVar>(), bufferSize, flags, timeout)

public actual fun closePort(port: PortId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_close_port(port)

public actual fun deletePort(port: PortId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_delete_port(port)

public actual fun portBufferSize(port: PortId): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_port_buffer_size(port)

public actual fun portBufferSizeEtc(port: PortId, flags: UInt, timeout: BigtimeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_port_buffer_size_etc(port, flags, timeout)

public actual fun portCount(port: PortId): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_port_count(port)

public actual fun setPortOwner(port: PortId, team: TeamId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_port_owner(port, team)

public actual fun getPortInfo(port: PortId, buf: PortInfo?, portInfoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_port_info(port, buf?.value?.toCPointer<ByteVar>(), portInfoSize)

public actual fun getNextPortInfo(port: PortId, cookie: Int?, portInfo: PortInfo?, portInfoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_next_port_info(port, cookie?.value?.toCPointer<ByteVar>(), portInfo?.value?.toCPointer<ByteVar>(), portInfoSize)

public actual fun getPortMessageInfoEtc(port: PortId, info: PortMessageInfo?, infoSize: SizeT, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_port_message_info_etc(port, info?.value?.toCPointer<ByteVar>(), infoSize, flags, timeout)

public actual fun createSem(count: Int, name: String?): SemId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_create_sem(count, name)

public actual fun deleteSem(id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_delete_sem(id)

public actual fun acquireSem(id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_acquire_sem(id)

public actual fun acquireSemEtc(id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_acquire_sem_etc(id, count, flags, timeout)

public actual fun releaseSem(id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_release_sem(id)

public actual fun releaseSemEtc(id: SemId, count: Int, flags: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_release_sem_etc(id, count, flags)

public actual fun switchSem(semToBeReleased: SemId, id: SemId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_switch_sem(semToBeReleased, id)

public actual fun switchSemEtc(semToBeReleased: SemId, id: SemId, count: Int, flags: UInt, timeout: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_switch_sem_etc(semToBeReleased, id, count, flags, timeout)

public actual fun getSemCount(id: SemId, threadCount: Int?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_sem_count(id, threadCount?.value?.toCPointer<ByteVar>())

public actual fun setSemOwner(id: SemId, team: TeamId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_sem_owner(id, team)

public actual fun getSemInfo(id: SemId, info: SemInfo?, infoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_sem_info(id, info?.value?.toCPointer<ByteVar>(), infoSize)

public actual fun getNextSemInfo(team: TeamId, cookie: Int?, info: SemInfo?, infoSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_next_sem_info(team, cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), infoSize)

public actual fun killTeam(team: TeamId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_kill_team(team)

public actual fun getTeamInfo(team: TeamId, info: TeamInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_team_info(team, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextTeamInfo(cookie: Int?, info: TeamInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_next_team_info(cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), size)

public actual fun spawnThread(func: ThreadFunc, name: String?, priority: Int, data: COpaquePointer?): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_spawn_thread(func.toInt(), name, priority, data?.value?.toCPointer<ByteVar>())

public actual fun killThread(thread: ThreadId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_kill_thread(thread)

public actual fun resumeThread(thread: ThreadId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_resume_thread(thread)

public actual fun suspendThread(thread: ThreadId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_suspend_thread(thread)

public actual fun renameThread(thread: ThreadId, newName: String?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_rename_thread(thread, newName)

public actual fun setThreadPriority(thread: ThreadId, newPriority: Int): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_thread_priority(thread, newPriority)

public actual fun suggestThreadPriority(what: UInt, period: Int, jitter: io.github.kotlinmania.libc.BigtimeT, length: io.github.kotlinmania.libc.BigtimeT): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_suggest_thread_priority(what, period, jitter, length)

public actual fun estimateMaxSchedulingLatency(th: io.github.kotlinmania.libc.ThreadId): io.github.kotlinmania.libc.BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_estimate_max_scheduling_latency(th)

public actual fun exitThread(status: StatusT) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_exit_thread(status)
}

public actual fun waitForThread(thread: ThreadId, returnValue: Int?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_wait_for_thread(thread, returnValue?.value?.toCPointer<ByteVar>())

public actual fun onExitThread(callback: OnExitThreadCallbackCallback, data: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_on_exit_thread(callback.toInt(), data?.value?.toCPointer<ByteVar>())

public actual fun findThread(name: String?): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_thread(name)

public actual fun getSchedulerMode(): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_scheduler_mode()

public actual fun setSchedulerMode(mode: Int): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_scheduler_mode(mode)

public actual fun sendData(thread: ThreadId, code: Int, buffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_send_data(thread, code, buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun receiveData(sender: Int?, buffer: COpaquePointer?, bufferSize: SizeT): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_receive_data(sender?.value?.toCPointer<ByteVar>(), buffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun hasData(thread: ThreadId): Boolean =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_has_data(thread)

public actual fun snooze(amount: BigtimeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_snooze(amount)

public actual fun snoozeEtc(amount: BigtimeT, timeBase: CInt, flags: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_snooze_etc(amount, timeBase, flags)

public actual fun snoozeUntil(time: BigtimeT, timeBase: CInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_snooze_until(time, timeBase)

public actual fun getThreadInfo(id: ThreadId, info: ThreadInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_thread_info(id, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextThreadInfo(team: TeamId, cookie: Int?, info: ThreadInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_next_thread_info(team, cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), size)

public actual fun getPthreadThreadId(thread: PthreadT): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_pthread_thread_id(thread.toInt())

public actual fun getTeamUsageInfo(team: TeamId, who: Int, info: TeamUsageInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_team_usage_info(team, who, info?.value?.toCPointer<ByteVar>(), size)

public actual fun realTimeClock(): CUlong =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_real_time_clock()

public actual fun setRealTimeClock(secsSinceJan1st1970: CUlong) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_real_time_clock(secsSinceJan1st1970)
}

public actual fun realTimeClockUsecs(): BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_real_time_clock_usecs()

public actual fun systemTime(): BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_system_time()

public actual fun systemTimeNsecs(): NanotimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_system_time_nsecs()

public actual fun setAlarm(whenBranch: BigtimeT, flags: UInt): BigtimeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_alarm(whenBranch, flags)

public actual fun debugger(message: String?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_debugger(message)
}

public actual fun disableDebugger(state: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_disable_debugger(state)

public actual fun getSystemInfo(info: SystemInfo?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_system_info(info?.value?.toCPointer<ByteVar>())

public actual fun getCpuInfoEtc(firstCPU: UInt, cpuCount: UInt, info: CpuInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_cpu_info_etc(firstCPU, cpuCount, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getCpuTopologyInfo(topologyInfos: CpuTopologyNodeInfo?, topologyInfoCount: UInt?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_cpu_topology_info(topologyInfos?.value?.toCPointer<ByteVar>(), topologyInfoCount?.value?.toCPointer<ByteVar>())

public actual fun isComputerOn(): Int =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_is_computer_on()

public actual fun isComputerOnFire(): CDouble =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_is_computer_on_fire()

public actual fun sendSignal(threadID: ThreadId, signal: CUint): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_send_signal(threadID, signal)

public actual fun setSignalStack(base: COpaquePointer?, size: SizeT) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_set_signal_stack(base?.value?.toCPointer<ByteVar>(), size)
}

public actual fun waitForObjects(infos: ObjectWaitInfo?, numInfos: CInt): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_wait_for_objects(infos?.value?.toCPointer<ByteVar>(), numInfos)

public actual fun waitForObjectsEtc(infos: ObjectWaitInfo?, numInfos: CInt, flags: UInt, timeout: BigtimeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_wait_for_objects_etc(infos?.value?.toCPointer<ByteVar>(), numInfos, flags, timeout)

public actual fun fsReadAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, readBytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_read_attr(fd, attribute, type, pos, buffer?.value?.toCPointer<ByteVar>(), readBytes)

public actual fun fsWriteAttr(fd: CInt, attribute: String?, type: UInt, pos: OffT, buffer: COpaquePointer?, writeBytes: SizeT): SsizeT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_write_attr(fd, attribute, type, pos, buffer?.value?.toCPointer<ByteVar>(), writeBytes)

public actual fun fsRemoveAttr(fd: CInt, attribute: String?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_remove_attr(fd, attribute)

public actual fun fsStatAttr(fd: CInt, attribute: String?, attrInfo: AttrInfo?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_stat_attr(fd, attribute, attrInfo?.value?.toCPointer<ByteVar>())

public actual fun fsOpenAttr(path: String?, attribute: String?, type: UInt, openMode: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_open_attr(path, attribute, type, openMode)

public actual fun fsFopenAttr(fd: CInt, attribute: String?, type: UInt, openMode: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_fopen_attr(fd, attribute, type, openMode)

public actual fun fsCloseAttr(fd: CInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_close_attr(fd)

public actual fun fsOpenAttrDir(path: String?): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_open_attr_dir(path)?.let { DIR(it.toLong()) }

public actual fun fsLopenAttrDir(path: String?): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_lopen_attr_dir(path)?.let { DIR(it.toLong()) }

public actual fun fsFopenAttrDir(fd: CInt): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_fopen_attr_dir(fd)?.let { DIR(it.toLong()) }

public actual fun fsCloseAttrDir(dir: DIR?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_close_attr_dir(dir?.handle?.toCPointer<ByteVar>())

public actual fun fsReadAttrDir(dir: DIR?): Dirent? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_read_attr_dir(dir?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fsRewindAttrDir(dir: DIR?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_rewind_attr_dir(dir?.handle?.toCPointer<ByteVar>())
}

public actual fun fsCreateIndex(device: DevT, name: String?, type: UInt, flags: UInt): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_create_index(device.toInt(), name, type, flags)

public actual fun fsRemoveIndex(device: DevT, name: String?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_remove_index(device.toInt(), name)

public actual fun fsStatIndex(device: DevT, name: String?, indexInfo: IndexInfo?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_stat_index(device.toInt(), name, indexInfo?.value?.toCPointer<ByteVar>())

public actual fun fsOpenIndexDir(device: DevT): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_open_index_dir(device.toInt())?.let { DIR(it.toLong()) }

public actual fun fsCloseIndexDir(indexDirectory: DIR?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_close_index_dir(indexDirectory?.handle?.toCPointer<ByteVar>())

public actual fun fsReadIndexDir(indexDirectory: DIR?): Dirent? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_read_index_dir(indexDirectory?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun fsRewindIndexDir(indexDirectory: DIR?) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_rewind_index_dir(indexDirectory?.handle?.toCPointer<ByteVar>())
}

public actual fun devForPath(path: String?): DevT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_dev_for_path(path)

public actual fun nextDev(pos: Int?): DevT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_next_dev(pos?.value?.toCPointer<ByteVar>())

public actual fun fsStatDev(dev: DevT, info: FsInfo?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_stat_dev(dev.toInt(), info?.value?.toCPointer<ByteVar>())

public actual fun fsOpenQuery(device: DevT, query: String?, flags: UInt): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_open_query(device.toInt(), query, flags)?.let { DIR(it.toLong()) }

public actual fun fsOpenLiveQuery(device: DevT, query: String?, flags: UInt, port: PortId, token: Int): DIR? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_open_live_query(device.toInt(), query, flags, port, token)?.let { DIR(it.toLong()) }

public actual fun fsCloseQuery(d: DIR?): CInt =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_close_query(d?.handle?.toCPointer<ByteVar>())

public actual fun fsReadQuery(d: DIR?): Dirent? =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_read_query(d?.handle?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getPathForDirent(dent: Dirent?, buf: COpaquePointer?, len: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_path_for_dirent(dent?.value?.toCPointer<ByteVar>(), buf?.value?.toCPointer<ByteVar>(), len)

public actual fun fsMountVolume(where: String?, device: String?, filesystem: String?, flags: UInt, parameters: String?): DevT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_mount_volume(where, device, filesystem, flags, parameters)

public actual fun fsUnmountVolume(path: String?, flags: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_fs_unmount_volume(path, flags)

public actual fun loadImage(argc: Int, argv: COpaquePointer?, environ: COpaquePointer?): ThreadId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_load_image(argc, argv?.value?.toCPointer<ByteVar>(), environ?.value?.toCPointer<ByteVar>())

public actual fun loadAddOn(path: String?): ImageId =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_load_add_on(path)

public actual fun unloadAddOn(image: ImageId): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_unload_add_on(image)

public actual fun getImageSymbol(image: ImageId, name: String?, symbolType: Int, symbolLocation: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_image_symbol(image, name, symbolType, symbolLocation?.value?.toCPointer<ByteVar>())

public actual fun getNthImageSymbol(image: ImageId, n: Int, nameBuffer: COpaquePointer?, nameLength: Int?, symbolType: Int?, symbolLocation: COpaquePointer?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_nth_image_symbol(image, n, nameBuffer?.value?.toCPointer<ByteVar>(), nameLength?.value?.toCPointer<ByteVar>(), symbolType?.value?.toCPointer<ByteVar>(), symbolLocation?.value?.toCPointer<ByteVar>())

public actual fun clearCaches(address: COpaquePointer?, length: SizeT, flags: UInt) {
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_clear_caches(address?.value?.toCPointer<ByteVar>(), length, flags)
}

public actual fun getImageInfo(image: ImageId, info: ImageInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_image_info(image, info?.value?.toCPointer<ByteVar>(), size)

public actual fun getNextImageInfo(team: TeamId, cookie: Int?, info: ImageInfo?, size: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_next_image_info(team, cookie?.value?.toCPointer<ByteVar>(), info?.value?.toCPointer<ByteVar>(), size)

public actual fun findPath(codePointer: COpaquePointer?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: ULong): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_path(codePointer?.value?.toCPointer<ByteVar>(), baseDirectory.toInt(), subPath, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathEtc(codePointer: COpaquePointer?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_path_etc(codePointer?.value?.toCPointer<ByteVar>(), dependency, architecture, baseDirectory.toInt(), subPath, flags, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathForPath(path: String?, baseDirectory: PathBaseDirectory, subPath: String?, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_path_for_path(path, baseDirectory.toInt(), subPath, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPathForPathEtc(path: String?, dependency: String?, architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, pathBuffer: COpaquePointer?, bufferSize: SizeT): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_path_for_path_etc(path, dependency, architecture, baseDirectory.toInt(), subPath, flags, pathBuffer?.value?.toCPointer<ByteVar>(), bufferSize)

public actual fun findPaths(baseDirectory: PathBaseDirectory, subPath: String?, paths: COpaquePointer?, pathCount: SizeT?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_paths(baseDirectory.toInt(), subPath, paths?.value?.toCPointer<ByteVar>(), pathCount?.value?.toCPointer<ByteVar>())

public actual fun findPathsEtc(architecture: String?, baseDirectory: PathBaseDirectory, subPath: String?, flags: UInt, paths: COpaquePointer?, pathCount: SizeT?): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_paths_etc(architecture, baseDirectory.toInt(), subPath, flags, paths?.value?.toCPointer<ByteVar>(), pathCount?.value?.toCPointer<ByteVar>())

public actual fun findDirectory(which: DirectoryWhich, volume: DevT, createIt: Boolean, pathString: COpaquePointer?, length: Int): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_find_directory(which.toInt(), volume.toInt(), createIt, pathString?.value?.toCPointer<ByteVar>(), length)

public actual fun getCpuid(info: CpuidInfo?, eaxRegister: UInt, cpuNum: UInt): StatusT =
    io.github.kotlinmania.libc.unix.haiku.cinterop.libc_native_get_cpuid(info?.value?.toCPointer<ByteVar>(), eaxRegister, cpuNum)
