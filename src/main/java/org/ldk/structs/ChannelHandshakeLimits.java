package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * Optional channel limits which are applied during channel creation.
 * 
 * These limits are only applied to our counterparty's limits, not our own.
 * 
 * Use 0/<type>::max_value() as appropriate to skip checking.
 * 
 * Provides sane defaults for most configurations.
 * 
 * Most additional limits are disabled except those with which specify a default in individual
 * field documentation. Note that this may result in barely-usable channels, but since they
 * are applied mostly only to incoming channels that's not much of a problem.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class ChannelHandshakeLimits extends CommonBase {
	ChannelHandshakeLimits(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.ChannelHandshakeLimits_free(ptr); }
	}

	/**
	 * Minimum allowed satoshis when a channel is funded, this is supplied by the sender and so
	 * only applies to inbound channels.
	 * 
	 * Default value: 0.
	 */
	public long get_min_funding_satoshis() {
		long ret = bindings.ChannelHandshakeLimits_get_min_funding_satoshis(this.ptr);
		return ret;
	}

	/**
	 * Minimum allowed satoshis when a channel is funded, this is supplied by the sender and so
	 * only applies to inbound channels.
	 * 
	 * Default value: 0.
	 */
	public void set_min_funding_satoshis(long val) {
		bindings.ChannelHandshakeLimits_set_min_funding_satoshis(this.ptr, val);
	}

	/**
	 * The remote node sets a limit on the minimum size of HTLCs we can send to them. This allows
	 * you to limit the maximum minimum-size they can require.
	 * 
	 * Default value: u64::max_value.
	 */
	public long get_max_htlc_minimum_msat() {
		long ret = bindings.ChannelHandshakeLimits_get_max_htlc_minimum_msat(this.ptr);
		return ret;
	}

	/**
	 * The remote node sets a limit on the minimum size of HTLCs we can send to them. This allows
	 * you to limit the maximum minimum-size they can require.
	 * 
	 * Default value: u64::max_value.
	 */
	public void set_max_htlc_minimum_msat(long val) {
		bindings.ChannelHandshakeLimits_set_max_htlc_minimum_msat(this.ptr, val);
	}

	/**
	 * The remote node sets a limit on the maximum value of pending HTLCs to them at any given
	 * time to limit their funds exposure to HTLCs. This allows you to set a minimum such value.
	 * 
	 * Default value: 0.
	 */
	public long get_min_max_htlc_value_in_flight_msat() {
		long ret = bindings.ChannelHandshakeLimits_get_min_max_htlc_value_in_flight_msat(this.ptr);
		return ret;
	}

	/**
	 * The remote node sets a limit on the maximum value of pending HTLCs to them at any given
	 * time to limit their funds exposure to HTLCs. This allows you to set a minimum such value.
	 * 
	 * Default value: 0.
	 */
	public void set_min_max_htlc_value_in_flight_msat(long val) {
		bindings.ChannelHandshakeLimits_set_min_max_htlc_value_in_flight_msat(this.ptr, val);
	}

	/**
	 * The remote node will require we keep a certain amount in direct payment to ourselves at all
	 * time, ensuring that we are able to be punished if we broadcast an old state. This allows to
	 * you limit the amount which we will have to keep to ourselves (and cannot use for HTLCs).
	 * 
	 * Default value: u64::max_value.
	 */
	public long get_max_channel_reserve_satoshis() {
		long ret = bindings.ChannelHandshakeLimits_get_max_channel_reserve_satoshis(this.ptr);
		return ret;
	}

	/**
	 * The remote node will require we keep a certain amount in direct payment to ourselves at all
	 * time, ensuring that we are able to be punished if we broadcast an old state. This allows to
	 * you limit the amount which we will have to keep to ourselves (and cannot use for HTLCs).
	 * 
	 * Default value: u64::max_value.
	 */
	public void set_max_channel_reserve_satoshis(long val) {
		bindings.ChannelHandshakeLimits_set_max_channel_reserve_satoshis(this.ptr, val);
	}

	/**
	 * The remote node sets a limit on the maximum number of pending HTLCs to them at any given
	 * time. This allows you to set a minimum such value.
	 * 
	 * Default value: 0.
	 */
	public short get_min_max_accepted_htlcs() {
		short ret = bindings.ChannelHandshakeLimits_get_min_max_accepted_htlcs(this.ptr);
		return ret;
	}

	/**
	 * The remote node sets a limit on the maximum number of pending HTLCs to them at any given
	 * time. This allows you to set a minimum such value.
	 * 
	 * Default value: 0.
	 */
	public void set_min_max_accepted_htlcs(short val) {
		bindings.ChannelHandshakeLimits_set_min_max_accepted_htlcs(this.ptr, val);
	}

	/**
	 * Outputs below a certain value will not be added to on-chain transactions. The dust value is
	 * required to always be higher than this value so this only applies to HTLC outputs (and
	 * potentially to-self outputs before any payments have been made).
	 * Thus, HTLCs below this amount plus HTLC transaction fees are not enforceable on-chain.
	 * This setting allows you to set a minimum dust limit for their commitment transactions,
	 * reflecting the reality that tiny outputs are not considered standard transactions and will
	 * not propagate through the Bitcoin network.
	 * 
	 * Default value: 546, the current dust limit on the Bitcoin network.
	 */
	public long get_min_dust_limit_satoshis() {
		long ret = bindings.ChannelHandshakeLimits_get_min_dust_limit_satoshis(this.ptr);
		return ret;
	}

	/**
	 * Outputs below a certain value will not be added to on-chain transactions. The dust value is
	 * required to always be higher than this value so this only applies to HTLC outputs (and
	 * potentially to-self outputs before any payments have been made).
	 * Thus, HTLCs below this amount plus HTLC transaction fees are not enforceable on-chain.
	 * This setting allows you to set a minimum dust limit for their commitment transactions,
	 * reflecting the reality that tiny outputs are not considered standard transactions and will
	 * not propagate through the Bitcoin network.
	 * 
	 * Default value: 546, the current dust limit on the Bitcoin network.
	 */
	public void set_min_dust_limit_satoshis(long val) {
		bindings.ChannelHandshakeLimits_set_min_dust_limit_satoshis(this.ptr, val);
	}

	/**
	 * Maximum allowed threshold above which outputs will not be generated in their commitment
	 * transactions.
	 * HTLCs below this amount plus HTLC transaction fees are not enforceable on-chain.
	 * 
	 * Default value: u64::max_value.
	 */
	public long get_max_dust_limit_satoshis() {
		long ret = bindings.ChannelHandshakeLimits_get_max_dust_limit_satoshis(this.ptr);
		return ret;
	}

	/**
	 * Maximum allowed threshold above which outputs will not be generated in their commitment
	 * transactions.
	 * HTLCs below this amount plus HTLC transaction fees are not enforceable on-chain.
	 * 
	 * Default value: u64::max_value.
	 */
	public void set_max_dust_limit_satoshis(long val) {
		bindings.ChannelHandshakeLimits_set_max_dust_limit_satoshis(this.ptr, val);
	}

	/**
	 * Before a channel is usable the funding transaction will need to be confirmed by at least a
	 * certain number of blocks, specified by the node which is not the funder (as the funder can
	 * assume they aren't going to double-spend themselves).
	 * This config allows you to set a limit on the maximum amount of time to wait.
	 * 
	 * Default value: 144, or roughly one day and only applies to outbound channels.
	 */
	public int get_max_minimum_depth() {
		int ret = bindings.ChannelHandshakeLimits_get_max_minimum_depth(this.ptr);
		return ret;
	}

	/**
	 * Before a channel is usable the funding transaction will need to be confirmed by at least a
	 * certain number of blocks, specified by the node which is not the funder (as the funder can
	 * assume they aren't going to double-spend themselves).
	 * This config allows you to set a limit on the maximum amount of time to wait.
	 * 
	 * Default value: 144, or roughly one day and only applies to outbound channels.
	 */
	public void set_max_minimum_depth(int val) {
		bindings.ChannelHandshakeLimits_set_max_minimum_depth(this.ptr, val);
	}

	/**
	 * Set to force the incoming channel to match our announced channel preference in
	 * ChannelConfig.
	 * 
	 * Default value: true, to make the default that no announced channels are possible (which is
	 * appropriate for any nodes which are not online very reliably).
	 */
	public boolean get_force_announced_channel_preference() {
		boolean ret = bindings.ChannelHandshakeLimits_get_force_announced_channel_preference(this.ptr);
		return ret;
	}

	/**
	 * Set to force the incoming channel to match our announced channel preference in
	 * ChannelConfig.
	 * 
	 * Default value: true, to make the default that no announced channels are possible (which is
	 * appropriate for any nodes which are not online very reliably).
	 */
	public void set_force_announced_channel_preference(boolean val) {
		bindings.ChannelHandshakeLimits_set_force_announced_channel_preference(this.ptr, val);
	}

	/**
	 * Set to the amount of time we're willing to wait to claim money back to us.
	 * 
	 * Not checking this value would be a security issue, as our peer would be able to set it to
	 * max relative lock-time (a year) and we would \"lose\" money as it would be locked for a long time.
	 * 
	 * Default value: MAX_LOCAL_BREAKDOWN_TIMEOUT (1008), which we also enforce as a maximum value
	 * so you can tweak config to reduce the loss of having useless locked funds (if your peer accepts)
	 */
	public short get_their_to_self_delay() {
		short ret = bindings.ChannelHandshakeLimits_get_their_to_self_delay(this.ptr);
		return ret;
	}

	/**
	 * Set to the amount of time we're willing to wait to claim money back to us.
	 * 
	 * Not checking this value would be a security issue, as our peer would be able to set it to
	 * max relative lock-time (a year) and we would \"lose\" money as it would be locked for a long time.
	 * 
	 * Default value: MAX_LOCAL_BREAKDOWN_TIMEOUT (1008), which we also enforce as a maximum value
	 * so you can tweak config to reduce the loss of having useless locked funds (if your peer accepts)
	 */
	public void set_their_to_self_delay(short val) {
		bindings.ChannelHandshakeLimits_set_their_to_self_delay(this.ptr, val);
	}

	/**
	 * Constructs a new ChannelHandshakeLimits given each field
	 */
	public static ChannelHandshakeLimits constructor_new(long min_funding_satoshis_arg, long max_htlc_minimum_msat_arg, long min_max_htlc_value_in_flight_msat_arg, long max_channel_reserve_satoshis_arg, short min_max_accepted_htlcs_arg, long min_dust_limit_satoshis_arg, long max_dust_limit_satoshis_arg, int max_minimum_depth_arg, boolean force_announced_channel_preference_arg, short their_to_self_delay_arg) {
		long ret = bindings.ChannelHandshakeLimits_new(min_funding_satoshis_arg, max_htlc_minimum_msat_arg, min_max_htlc_value_in_flight_msat_arg, max_channel_reserve_satoshis_arg, min_max_accepted_htlcs_arg, min_dust_limit_satoshis_arg, max_dust_limit_satoshis_arg, max_minimum_depth_arg, force_announced_channel_preference_arg, their_to_self_delay_arg);
		ChannelHandshakeLimits ret_hu_conv = new ChannelHandshakeLimits(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the ChannelHandshakeLimits
	 */
	public ChannelHandshakeLimits clone() {
		long ret = bindings.ChannelHandshakeLimits_clone(this.ptr);
		ChannelHandshakeLimits ret_hu_conv = new ChannelHandshakeLimits(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Creates a "default" ChannelHandshakeLimits. See other documentaiton for details on what this implies.
	 */
	public static ChannelHandshakeLimits constructor_default() {
		long ret = bindings.ChannelHandshakeLimits_default();
		ChannelHandshakeLimits ret_hu_conv = new ChannelHandshakeLimits(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

}
