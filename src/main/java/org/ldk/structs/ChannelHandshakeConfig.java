package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * Configuration we set when applicable.
 * 
 * Default::default() provides sane defaults.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class ChannelHandshakeConfig extends CommonBase {
	ChannelHandshakeConfig(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.ChannelHandshakeConfig_free(ptr); }
	}

	/**
	 * Confirmations we will wait for before considering the channel locked in.
	 * Applied only for inbound channels (see ChannelHandshakeLimits::max_minimum_depth for the
	 * equivalent limit applied to outbound channels).
	 * 
	 * Default value: 6.
	 */
	public int get_minimum_depth() {
		int ret = bindings.ChannelHandshakeConfig_get_minimum_depth(this.ptr);
		return ret;
	}

	/**
	 * Confirmations we will wait for before considering the channel locked in.
	 * Applied only for inbound channels (see ChannelHandshakeLimits::max_minimum_depth for the
	 * equivalent limit applied to outbound channels).
	 * 
	 * Default value: 6.
	 */
	public void set_minimum_depth(int val) {
		bindings.ChannelHandshakeConfig_set_minimum_depth(this.ptr, val);
	}

	/**
	 * Set to the amount of time we require our counterparty to wait to claim their money.
	 * 
	 * It's one of the main parameter of our security model. We (or one of our watchtowers) MUST
	 * be online to check for peer having broadcast a revoked transaction to steal our funds
	 * at least once every our_to_self_delay blocks.
	 * 
	 * Meanwhile, asking for a too high delay, we bother peer to freeze funds for nothing in
	 * case of an honest unilateral channel close, which implicitly decrease the economic value of
	 * our channel.
	 * 
	 * Default value: BREAKDOWN_TIMEOUT (currently 144), we enforce it as a minimum at channel
	 * opening so you can tweak config to ask for more security, not less.
	 */
	public short get_our_to_self_delay() {
		short ret = bindings.ChannelHandshakeConfig_get_our_to_self_delay(this.ptr);
		return ret;
	}

	/**
	 * Set to the amount of time we require our counterparty to wait to claim their money.
	 * 
	 * It's one of the main parameter of our security model. We (or one of our watchtowers) MUST
	 * be online to check for peer having broadcast a revoked transaction to steal our funds
	 * at least once every our_to_self_delay blocks.
	 * 
	 * Meanwhile, asking for a too high delay, we bother peer to freeze funds for nothing in
	 * case of an honest unilateral channel close, which implicitly decrease the economic value of
	 * our channel.
	 * 
	 * Default value: BREAKDOWN_TIMEOUT (currently 144), we enforce it as a minimum at channel
	 * opening so you can tweak config to ask for more security, not less.
	 */
	public void set_our_to_self_delay(short val) {
		bindings.ChannelHandshakeConfig_set_our_to_self_delay(this.ptr, val);
	}

	/**
	 * Set to the smallest value HTLC we will accept to process.
	 * 
	 * This value is sent to our counterparty on channel-open and we close the channel any time
	 * our counterparty misbehaves by sending us an HTLC with a value smaller than this.
	 * 
	 * Default value: 1. If the value is less than 1, it is ignored and set to 1, as is required
	 * by the protocol.
	 */
	public long get_our_htlc_minimum_msat() {
		long ret = bindings.ChannelHandshakeConfig_get_our_htlc_minimum_msat(this.ptr);
		return ret;
	}

	/**
	 * Set to the smallest value HTLC we will accept to process.
	 * 
	 * This value is sent to our counterparty on channel-open and we close the channel any time
	 * our counterparty misbehaves by sending us an HTLC with a value smaller than this.
	 * 
	 * Default value: 1. If the value is less than 1, it is ignored and set to 1, as is required
	 * by the protocol.
	 */
	public void set_our_htlc_minimum_msat(long val) {
		bindings.ChannelHandshakeConfig_set_our_htlc_minimum_msat(this.ptr, val);
	}

	/**
	 * Constructs a new ChannelHandshakeConfig given each field
	 */
	public static ChannelHandshakeConfig constructor_new(int minimum_depth_arg, short our_to_self_delay_arg, long our_htlc_minimum_msat_arg) {
		long ret = bindings.ChannelHandshakeConfig_new(minimum_depth_arg, our_to_self_delay_arg, our_htlc_minimum_msat_arg);
		ChannelHandshakeConfig ret_hu_conv = new ChannelHandshakeConfig(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the ChannelHandshakeConfig
	 */
	public ChannelHandshakeConfig clone() {
		long ret = bindings.ChannelHandshakeConfig_clone(this.ptr);
		ChannelHandshakeConfig ret_hu_conv = new ChannelHandshakeConfig(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Creates a "default" ChannelHandshakeConfig. See other documentaiton for details on what this implies.
	 */
	public static ChannelHandshakeConfig constructor_default() {
		long ret = bindings.ChannelHandshakeConfig_default();
		ChannelHandshakeConfig ret_hu_conv = new ChannelHandshakeConfig(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

}
