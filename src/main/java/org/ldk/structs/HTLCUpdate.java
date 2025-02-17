package org.ldk.structs;

import org.ldk.impl.bindings;
import org.ldk.enums.*;
import org.ldk.util.*;
import java.util.Arrays;


/**
 * Simple structure sent back by `chain::Watch` when an HTLC from a forward channel is detected on
 * chain. Used to update the corresponding HTLC in the backward channel. Failing to pass the
 * preimage claim backward will lead to loss of funds.
 * 
 * [`chain::Watch`]: ../trait.Watch.html
 */
@SuppressWarnings("unchecked") // We correctly assign various generic arrays
public class HTLCUpdate extends CommonBase {
	HTLCUpdate(Object _dummy, long ptr) { super(ptr); }
	@Override @SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
		if (ptr != 0) { bindings.HTLCUpdate_free(ptr); }
	}

	/**
	 * Creates a copy of the HTLCUpdate
	 */
	public HTLCUpdate clone() {
		long ret = bindings.HTLCUpdate_clone(this.ptr);
		HTLCUpdate ret_hu_conv = new HTLCUpdate(null, ret);
		ret_hu_conv.ptrs_to.add(this);
		return ret_hu_conv;
	}

	/**
	 * Serialize the HTLCUpdate object into a byte array which can be read by HTLCUpdate_read
	 */
	public byte[] write() {
		byte[] ret = bindings.HTLCUpdate_write(this.ptr);
		return ret;
	}

	/**
	 * Read a HTLCUpdate from a byte array, created by HTLCUpdate_write
	 */
	public static Result_HTLCUpdateDecodeErrorZ constructor_read(byte[] ser) {
		long ret = bindings.HTLCUpdate_read(ser);
		Result_HTLCUpdateDecodeErrorZ ret_hu_conv = Result_HTLCUpdateDecodeErrorZ.constr_from_ptr(ret);
		return ret_hu_conv;
	}

}
