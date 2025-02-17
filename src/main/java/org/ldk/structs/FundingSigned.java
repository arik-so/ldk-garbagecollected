package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * A funding_signed message to be sent or received from a peer
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class FundingSigned extends CommonBase {
	FundingSigned(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.FundingSigned_free(ptr); }
	}

	/**
	 * The channel ID
	 */
	public byte[] get_channel_id() {
		byte[] ret = bindings.FundingSigned_get_channel_id(this.ptr);
		return ret;
	}

	/**
	 * The channel ID
	 */
	public void set_channel_id(byte[] val) {
		bindings.FundingSigned_set_channel_id(this.ptr, val);
	}

	/**
	 * The signature of the channel acceptor (fundee) on the funding transaction
	 */
	public byte[] get_signature() {
		byte[] ret = bindings.FundingSigned_get_signature(this.ptr);
		return ret;
	}

	/**
	 * The signature of the channel acceptor (fundee) on the funding transaction
	 */
	public void set_signature(byte[] val) {
		bindings.FundingSigned_set_signature(this.ptr, val);
	}

	/**
	 * Constructs a new FundingSigned given each field
	 */
	public static FundingSigned constructor_new(byte[] channel_id_arg, byte[] signature_arg) {
		long ret = bindings.FundingSigned_new(channel_id_arg, signature_arg);
		FundingSigned ret_hu_conv = new FundingSigned(null, ret);
		ret_hu_conv.ptrs_to.add(ret_hu_conv);
		return ret_hu_conv;
	}

	/**
	 * Creates a copy of the FundingSigned
	 */
	public FundingSigned clone() {
		long ret = bindings.FundingSigned_clone(this.ptr);
		FundingSigned ret_hu_conv = new FundingSigned(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Serialize the FundingSigned object into a byte array which can be read by FundingSigned_read
	 */
	public byte[] write() {
		byte[] ret = bindings.FundingSigned_write(this.ptr);
		return ret;
	}

	/**
	 * Read a FundingSigned from a byte array, created by FundingSigned_write
	 */
	public static Result_FundingSignedDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.FundingSigned_read(ser);
		Result_FundingSignedDecodeErrorZ ret_hu_conv = Result_FundingSignedDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
