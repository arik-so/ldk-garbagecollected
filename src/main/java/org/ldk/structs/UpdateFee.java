package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * An update_fee message to be sent or received from a peer
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class UpdateFee extends CommonBase {
	UpdateFee(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.UpdateFee_free(ptr); }
	}

	/**
	 * The channel ID
	 */
	public byte[] get_channel_id() {
		byte[] ret = bindings.UpdateFee_get_channel_id(this.ptr);
		return ret;
	}

	/**
	 * The channel ID
	 */
	public void set_channel_id(byte[] val) {
		bindings.UpdateFee_set_channel_id(this.ptr, val);
	}

	/**
	 * Fee rate per 1000-weight of the transaction
	 */
	public int get_feerate_per_kw() {
		int ret = bindings.UpdateFee_get_feerate_per_kw(this.ptr);
		return ret;
	}

	/**
	 * Fee rate per 1000-weight of the transaction
	 */
	public void set_feerate_per_kw(int val) {
		bindings.UpdateFee_set_feerate_per_kw(this.ptr, val);
	}

	/**
	 * Constructs a new UpdateFee given each field
	 */
	public static UpdateFee constructor_new(byte[] channel_id_arg, int feerate_per_kw_arg) {
		long ret = bindings.UpdateFee_new(channel_id_arg, feerate_per_kw_arg);
		UpdateFee ret_hu_conv = new UpdateFee(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the UpdateFee
	 */
	public UpdateFee clone() {
		long ret = bindings.UpdateFee_clone(this.ptr);
		UpdateFee ret_hu_conv = new UpdateFee(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Serialize the UpdateFee object into a byte array which can be read by UpdateFee_read
	 */
	public byte[] write() {
		byte[] ret = bindings.UpdateFee_write(this.ptr);
		return ret;
	}

	/**
	 * Read a UpdateFee from a byte array, created by UpdateFee_write
	 */
	public static Result_UpdateFeeDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.UpdateFee_read(ser);
		Result_UpdateFeeDecodeErrorZ ret_hu_conv = Result_UpdateFeeDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
