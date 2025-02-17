package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * A reply_short_channel_ids_end message is sent as a reply to a
 * query_short_channel_ids message. The query recipient makes a best
 * effort to respond based on their local network view which may not be
 * a perfect view of the network.
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class ReplyShortChannelIdsEnd extends CommonBase {
	ReplyShortChannelIdsEnd(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.ReplyShortChannelIdsEnd_free(ptr); }
	}

	/**
	 * The genesis hash of the blockchain that was queried
	 */
	public byte[] get_chain_hash() {
		byte[] ret = bindings.ReplyShortChannelIdsEnd_get_chain_hash(this.ptr);
		return ret;
	}

	/**
	 * The genesis hash of the blockchain that was queried
	 */
	public void set_chain_hash(byte[] val) {
		bindings.ReplyShortChannelIdsEnd_set_chain_hash(this.ptr, val);
	}

	/**
	 * Indicates if the query recipient maintains up-to-date channel
	 * information for the chain_hash
	 */
	public boolean get_full_information() {
		boolean ret = bindings.ReplyShortChannelIdsEnd_get_full_information(this.ptr);
		return ret;
	}

	/**
	 * Indicates if the query recipient maintains up-to-date channel
	 * information for the chain_hash
	 */
	public void set_full_information(boolean val) {
		bindings.ReplyShortChannelIdsEnd_set_full_information(this.ptr, val);
	}

	/**
	 * Constructs a new ReplyShortChannelIdsEnd given each field
	 */
	public static ReplyShortChannelIdsEnd constructor_new(byte[] chain_hash_arg, boolean full_information_arg) {
		long ret = bindings.ReplyShortChannelIdsEnd_new(chain_hash_arg, full_information_arg);
		ReplyShortChannelIdsEnd ret_hu_conv = new ReplyShortChannelIdsEnd(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the ReplyShortChannelIdsEnd
	 */
	public ReplyShortChannelIdsEnd clone() {
		long ret = bindings.ReplyShortChannelIdsEnd_clone(this.ptr);
		ReplyShortChannelIdsEnd ret_hu_conv = new ReplyShortChannelIdsEnd(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Read a ReplyShortChannelIdsEnd from a byte array, created by ReplyShortChannelIdsEnd_write
	 */
	public static Result_ReplyShortChannelIdsEndDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.ReplyShortChannelIdsEnd_read(ser);
		Result_ReplyShortChannelIdsEndDecodeErrorZ ret_hu_conv = Result_ReplyShortChannelIdsEndDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

	/**
	 * Serialize the ReplyShortChannelIdsEnd object into a byte array which can be read by ReplyShortChannelIdsEnd_read
	 */
	public byte[] write() {
		byte[] ret = bindings.ReplyShortChannelIdsEnd_write(this.ptr);
		return ret;
	}

}
