package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;

/**
 * The `Watch` trait defines behavior for watching on-chain activity pertaining to channels as
 * blocks are connected and disconnected.
 * 
 * Each channel is associated with a [`ChannelMonitor`]. Implementations of this trait are
 * responsible for maintaining a set of monitors such that they can be updated accordingly as
 * channel state changes and HTLCs are resolved. See method documentation for specific
 * requirements.
 * 
 * Implementations **must** ensure that updates are successfully applied and persisted upon method
 * completion. If an update fails with a [`PermanentFailure`], then it must immediately shut down
 * without taking any further action such as persisting the current state.
 * 
 * If an implementation maintains multiple instances of a channel's monitor (e.g., by storing
 * backup copies), then it must ensure that updates are applied across all instances. Otherwise, it
 * could result in a revoked transaction being broadcast, allowing the counterparty to claim all
 * funds in the channel. See [`ChannelMonitorUpdateErr`] for more details about how to handle
 * multiple instances.
 * 
 * [`ChannelMonitor`]: channelmonitor/struct.ChannelMonitor.html
 * [`ChannelMonitorUpdateErr`]: channelmonitor/enum.ChannelMonitorUpdateErr.html
 * [`PermanentFailure`]: channelmonitor/enum.ChannelMonitorUpdateErr.html#variant.PermanentFailure
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class Watch extends CommonBase {
	final bindings.LDKWatch bindings_instance;
	Watch(Object _dummy, long ptr) { super(ptr); bindings_instance = null; }
	private Watch(bindings.LDKWatch arg) {
		super(bindings.LDKWatch_new(arg));
		this.ptrs_to.add(arg);
		this.bindings_instance = arg;
	}
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		if (ptr != 0) { bindings.Watch_free(ptr); } super.finalize();
	}

	public static interface WatchInterface {
		/**
		 * Watches a channel identified by `funding_txo` using `monitor`.
		 * 
		 * Implementations are responsible for watching the chain for the funding transaction along
		 * with any spends of outputs returned by [`get_outputs_to_watch`]. In practice, this means
		 * calling [`block_connected`] and [`block_disconnected`] on the monitor.
		 * 
		 * [`get_outputs_to_watch`]: channelmonitor/struct.ChannelMonitor.html#method.get_outputs_to_watch
		 * [`block_connected`]: channelmonitor/struct.ChannelMonitor.html#method.block_connected
		 * [`block_disconnected`]: channelmonitor/struct.ChannelMonitor.html#method.block_disconnected
		 */
		Result_NoneChannelMonitorUpdateErrZ watch_channel(OutPoint funding_txo, ChannelMonitor monitor);
		/**
		 * Updates a channel identified by `funding_txo` by applying `update` to its monitor.
		 * 
		 * Implementations must call [`update_monitor`] with the given update. See
		 * [`ChannelMonitorUpdateErr`] for invariants around returning an error.
		 * 
		 * [`update_monitor`]: channelmonitor/struct.ChannelMonitor.html#method.update_monitor
		 * [`ChannelMonitorUpdateErr`]: channelmonitor/enum.ChannelMonitorUpdateErr.html
		 */
		Result_NoneChannelMonitorUpdateErrZ update_channel(OutPoint funding_txo, ChannelMonitorUpdate update);
		/**
		 * Returns any monitor events since the last call. Subsequent calls must only return new
		 * events.
		 */
		MonitorEvent[] release_pending_monitor_events();
	}
	private static class LDKWatchHolder { Watch held; }
	public static Watch new_impl(WatchInterface arg) {
		final LDKWatchHolder impl_holder = new LDKWatchHolder();
		impl_holder.held = new Watch(new bindings.LDKWatch() {
			@Override public long watch_channel(long funding_txo, long monitor) {
				OutPoint funding_txo_hu_conv = new OutPoint(null, funding_txo);
				funding_txo_hu_conv.ptrs_to.add(this);
				ChannelMonitor monitor_hu_conv = new ChannelMonitor(null, monitor);
				monitor_hu_conv.ptrs_to.add(this);
				Result_NoneChannelMonitorUpdateErrZ ret = arg.watch_channel(funding_txo_hu_conv, monitor_hu_conv);
				long result = ret != null ? ret.ptr : 0;
				return result;
			}
			@Override public long update_channel(long funding_txo, long update) {
				OutPoint funding_txo_hu_conv = new OutPoint(null, funding_txo);
				funding_txo_hu_conv.ptrs_to.add(this);
				ChannelMonitorUpdate update_hu_conv = new ChannelMonitorUpdate(null, update);
				update_hu_conv.ptrs_to.add(this);
				Result_NoneChannelMonitorUpdateErrZ ret = arg.update_channel(funding_txo_hu_conv, update_hu_conv);
				long result = ret != null ? ret.ptr : 0;
				return result;
			}
			@Override public long[] release_pending_monitor_events() {
				MonitorEvent[] ret = arg.release_pending_monitor_events();
				long[] result = Arrays.stream(ret).mapToLong(ret_conv_14 -> ret_conv_14.ptr).toArray();
				/* TODO 2 MonitorEvent  */;
				return result;
			}
		});
		return impl_holder.held;
	}
	/**
	 * Watches a channel identified by `funding_txo` using `monitor`.
	 * 
	 * Implementations are responsible for watching the chain for the funding transaction along
	 * with any spends of outputs returned by [`get_outputs_to_watch`]. In practice, this means
	 * calling [`block_connected`] and [`block_disconnected`] on the monitor.
	 * 
	 * [`get_outputs_to_watch`]: channelmonitor/struct.ChannelMonitor.html#method.get_outputs_to_watch
	 * [`block_connected`]: channelmonitor/struct.ChannelMonitor.html#method.block_connected
	 * [`block_disconnected`]: channelmonitor/struct.ChannelMonitor.html#method.block_disconnected
	 */
	public Result_NoneChannelMonitorUpdateErrZ watch_channel(OutPoint funding_txo, ChannelMonitor monitor) {
		long ret = bindings.Watch_watch_channel(this.ptr, funding_txo == null ? 0 : funding_txo.ptr & ~1, monitor == null ? 0 : monitor.ptr & ~1);
		Result_NoneChannelMonitorUpdateErrZ ret_hu_conv = Result_NoneChannelMonitorUpdateErrZ.constr_from_ptr(ret);
		this.ptrs_to.add(funding_txo);
		this.ptrs_to.add(monitor);
		return ret_hu_conv;
	}

	/**
	 * Updates a channel identified by `funding_txo` by applying `update` to its monitor.
	 * 
	 * Implementations must call [`update_monitor`] with the given update. See
	 * [`ChannelMonitorUpdateErr`] for invariants around returning an error.
	 * 
	 * [`update_monitor`]: channelmonitor/struct.ChannelMonitor.html#method.update_monitor
	 * [`ChannelMonitorUpdateErr`]: channelmonitor/enum.ChannelMonitorUpdateErr.html
	 */
	public Result_NoneChannelMonitorUpdateErrZ update_channel(OutPoint funding_txo, ChannelMonitorUpdate update) {
		long ret = bindings.Watch_update_channel(this.ptr, funding_txo == null ? 0 : funding_txo.ptr & ~1, update == null ? 0 : update.ptr & ~1);
		Result_NoneChannelMonitorUpdateErrZ ret_hu_conv = Result_NoneChannelMonitorUpdateErrZ.constr_from_ptr(ret);
		this.ptrs_to.add(funding_txo);
		this.ptrs_to.add(update);
		return ret_hu_conv;
	}

	/**
	 * Returns any monitor events since the last call. Subsequent calls must only return new
	 * events.
	 */
	public MonitorEvent[] release_pending_monitor_events() {
		long[] ret = bindings.Watch_release_pending_monitor_events(this.ptr);
		MonitorEvent[] ret_conv_14_arr = new MonitorEvent[ret.length];
		for (int o = 0; o < ret.length; o++) {
			long ret_conv_14 = ret[o];
			MonitorEvent ret_conv_14_hu_conv = MonitorEvent.constr_from_ptr(ret_conv_14);
			ret_conv_14_hu_conv.ptrs_to.add(this);
			ret_conv_14_arr[o] = ret_conv_14_hu_conv;
		}
		return ret_conv_14_arr;
	}

}
